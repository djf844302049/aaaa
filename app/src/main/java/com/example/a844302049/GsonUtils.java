package com.example.a844302049;

import com.google.gson.Gson;

import java.lang.reflect.Type;

/**
 * Created by 844302049 on 2018/7/4.
 */

public final class GsonUtils {

    public static <T> T parseJSON(String json, Class<T> clazz) {
        Gson gson = new Gson();
        T info = gson.fromJson(json, clazz);
        return info;
    }

    /**
     * Type type = new
     * TypeToken&lt;ArrayList&lt;TypeInfo>>(){}.getType();
     * <br>Type所在的包：java.lang.reflect
     * <br>TypeToken所在的包：com.google.gson.reflect.TypeToken
     *
     * @param jsonArr
     * @param type
     * @return
     */
    public static <T> T parseJSONArray(String jsonArr, Type type) {
        Gson gson = new Gson();
        T infos = gson.fromJson(jsonArr, type);
        return infos;
    }


    private GsonUtils() {
    }
}