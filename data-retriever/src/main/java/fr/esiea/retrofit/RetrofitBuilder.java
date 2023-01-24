package fr.esiea.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitBuilder {
    public static TwitterApi buildService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.twitter.com/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        return retrofit.create(TwitterApi.class);
    }
}
