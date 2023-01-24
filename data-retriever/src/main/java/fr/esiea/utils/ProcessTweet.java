package fr.esiea.utils;

import fr.esiea.RetrieveData;
import fr.esiea.object.Data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

import static fr.esiea.utils.CheckArmies.checkArmies;
import static fr.esiea.utils.Spark.streamContent;

public class ProcessTweet {
    public static void Process(Data data) {
        String fileName = "/project/raw_tweets/" + data.id() + ".txt";
        String content = "total tweets::1;;";
        File file = new File(fileName);

        // Check if the tweet was already processed
        try {
            if (!file.createNewFile()) {
                if (RetrieveData.DEBUG)
                    System.out.println("Tweet " + data.id() + " already processed");
                return;
            }
        } catch (IOException e) {
            System.out.println("Unable to create file " + fileName);
            e.printStackTrace();
            return;
        }

        // Check armies
        content = checkArmies(content, data.text().toLowerCase(Locale.ROOT), data.public_metrics().like_count());

        // Save to file
        try {
            save(fileName, content);
        } catch (IOException e) {
            System.out.println("Unable to save file " + fileName);
            e.printStackTrace();
            return;
        }

        streamContent(content);

        if (RetrieveData.DEBUG)
            System.out.println("Tweet " + data.id() + " processed successfully");
    }

    private static void save(String fileName, String str) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(str);
        writer.close();

        if (RetrieveData.DEBUG)
            System.out.println("File " + fileName + " saved");
    }
}
