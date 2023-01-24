package fr.esiea.retrofit;

import fr.esiea.object.TwitterResponse;
import retrofit2.Call;

import java.io.IOException;

public class TwitterService {
    private final TwitterApi twitterApi;

    public TwitterService(TwitterApi twitterApi) {
        this.twitterApi = twitterApi;
    }

    public TwitterResponse firstCall(String authToken) throws IOException {
        Call<TwitterResponse> call = twitterApi.firstCall(authToken);
        return call.execute().body();
    }

    public TwitterResponse nextCall(String authToken, String nextPageToken) throws IOException {
        Call<TwitterResponse> call = twitterApi.nextCall(authToken, nextPageToken);
        return call.execute().body();
    }
}
