package com.zj.list;

import java.util.HashMap;
import java.util.Map;

public class MapDemo02 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("key1","hello");
        map.put("key2","world");
        map.put("key3","i");
        map.put("key4","love");
        map.put("key5","you");
        map.put("key6","jing");

       if (map.containsKey("key1")) {
           System.out.println("key存在");
       }else {
           System.out.println("key不存在");
       }
       if (map.containsValue("jing")) {
            System.out.println("value存在");
        }else {
            System.out.println("value不存在");
        }

    }
}
