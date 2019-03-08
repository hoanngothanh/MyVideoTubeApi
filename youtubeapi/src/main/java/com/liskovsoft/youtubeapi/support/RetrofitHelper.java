package com.liskovsoft.youtubeapi.support;

import com.liskovsoft.youtubeapi.support.converters.jsonpath.converter.JsonPathConverterFactory;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitHelper {
    private static final String DEFAULT_BASE_URL = "https://www.youtube.com"; // ignored when specified url is full

    public static <T> T withGson(Class<T> clazz) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(DEFAULT_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(clazz);
    }

    public static <T> T withJsonPath(Class<T> clazz) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(DEFAULT_BASE_URL)
                .addConverterFactory(JsonPathConverterFactory.create())
                .build();

        return retrofit.create(clazz);
    }
}
