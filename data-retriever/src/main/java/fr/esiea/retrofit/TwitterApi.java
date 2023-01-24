package fr.esiea.retrofit;

import fr.esiea.object.TwitterResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface TwitterApi {
    // (#WarhammerCommunity OR #Warhammer40K) -#ageofsigmar -#WarhammerAoS -#warhammerfantasy -is:retweet
    @GET("2/tweets/search/recent?max_results=100&tweet.fields=public_metrics&media.fields=public_metrics&query=%28%23WarhammerCommunity+OR+%23Warhammer40K%29+-%23ageofsigmar+-%23WarhammerAoS+-%23warhammerfantasy+-is%3Aretweet")
    Call<TwitterResponse> firstCall(@Header("Authorization") String authToken);

    @GET("2/tweets/search/recent?max_results=100&tweet.fields=public_metrics&media.fields=public_metrics&query=%28%23WarhammerCommunity+OR+%23Warhammer40K%29+-%23ageofsigmar+-%23WarhammerAoS+-%23warhammerfantasy+-is%3Aretweet")
    Call<TwitterResponse> nextCall(@Header("Authorization") String authToken, @Query("pagination_token") String paginationToken);
}
