package com.zj.list;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("key1","hello");
        map.put("key2","world");
        map.put("key3","i");
        map.put("key4","love");
        map.put("key5","you");
        map.put("key6","jing");

        String str = map.get("key1");
        System.out.println(str);

    }
}
