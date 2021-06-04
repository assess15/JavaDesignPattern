package com.laychv.design.creational.sington;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器 - 单例模式
 */
public class SingletonCollect {
    private static final Map<String, Object> map = new HashMap<>();

    private SingletonCollect() {
    }

    public static Object getInstance(String key) {
        return map.get(key);
    }

    public static void setInstance(String key, Object instance) {
        if (key != null && instance != null) {
            if (!map.containsKey(key)) {
                map.put(key, instance);
            }
        }
    }

}
