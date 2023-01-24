package fr.esiea;

import fr.esiea.exception.ArgumentException;
import fr.esiea.exception.TokenException;
import fr.esiea.object.TwitterResponse;
import fr.esiea.retrofit.TwitterService;
import fr.esiea.utils.ProcessTweet;
import fr.esiea.utils.Spark;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static fr.esiea.retrofit.RetrofitBuilder.buildService;

public class RetrieveData {
    private static final String AUTH_TOKEN = "Bearer " + System.getenv("TWITTER_API_KEY");
    private static final TwitterService service = new TwitterService(buildService());
    private static final int MAX_API_CALLS = 200;
    public static boolean DEBUG = false;
    private static int API_CALLS = 50;
    private static int WAIT_TIME = 10;
    private static String NEXT_TOKEN = "";

    public static void main(String[] args) throws Exception {
        // Check arguments
        try {
            setArgs(args);
        } catch (ArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        try {
            // Looping calls
            for (int call = 0; call < API_CALLS; call++) {
                // Call Twitter API
                TwitterResponse response = callApi(NEXT_TOKEN);
                NEXT_TOKEN = response.meta().next_token();

                // Process Tweets
                response.data().stream().parallel().forEach(ProcessTweet::Process);

                try {
                    // Save files
                    //Spark.putFiles();

                    // Execute Spark batch
                    Spark.executeSparkBatch();
                } catch (IOException e) {
                    // TODO
                    //System.out.println("Error while saving tweets or Spark processing. Check error details with --debug=1");
                    //e.printStackTrace();
                }

                // Wait before next call
                System.out.println("Waiting " + WAIT_TIME + " seconds before next API call...");
                TimeUnit.SECONDS.sleep(WAIT_TIME);
            }
        } catch (IOException e) {
            System.out.println("Error while retrieving tweets.");
            e.printStackTrace();
            System.exit(-1);
        } catch (TokenException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Execution ended successfully, feel free to rerun the app");
        System.exit(0);
    }

    private static void setArgs(String[] args) throws ArgumentException {
        String baseMessage = " Usage:\n" +
            "\n" +
            "REQUIRED\n" +
            "   --api-calls=<Integer>   How many times the Twitter API will be called (pls don't spam there is a limit)\n" +
            "\n" +
            "OPTIONAL\n" +
            "   --debug=<0 OR 1>        Enable debug logging or not\n" +
            "   --wait-time=<Integer>   Time to wait (in second) between each call (default 10 seconds)\n";
        if (args.length == 0) {
            String message = "Arguments needed." + baseMessage;
            throw new ArgumentException(message);
        }

        boolean requiredArg = false;

        for (String arg: args) {
            if (arg.contains("--api-calls")) {
                String[] spliced = arg.split("=");
                int apiCalls = Integer.parseInt(spliced[1]);

                if (apiCalls > MAX_API_CALLS || apiCalls < 1) {
                    throw new ArgumentException("--api-calls cannot exceed " + MAX_API_CALLS + " and should be over 1." + baseMessage);
                }

                API_CALLS = apiCalls;
                requiredArg = true;
            }

            if (arg.contains("--debug")) {
                String[] spliced = arg.split("=");
                int debugValue = Integer.parseInt(spliced[1]);

                if (debugValue != 0 && debugValue != 1) {
                    throw new ArgumentException("--debug value needs to be 0 or 1." + baseMessage);
                }

                DEBUG = debugValue == 1;
            }

            if (arg.contains("--wait-time")) {
                String[] spliced = arg.split("=");
                int waitTime = Integer.parseInt(spliced[1]);

                if (waitTime < 1) {
                    throw new ArgumentException("--wait-time value needs to be over 0." + baseMessage);
                }

                WAIT_TIME = waitTime;
            }
        }

        if (!requiredArg) throw new ArgumentException("--api-calls argument needed." + baseMessage);
    }

    private static TwitterResponse callApi(String nextPage) throws IOException, TokenException {
        if (nextPage == null) throw new TokenException("No next token");
        if (!nextPage.isEmpty()) return service.nextCall(AUTH_TOKEN, nextPage);
        return service.firstCall(AUTH_TOKEN);
    }

}
