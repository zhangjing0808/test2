package com.zj.list;

import java.util.*;

public class MapDemo03 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("key1","hello");
        map.put("key2","world");
        map.put("key3","i");
        map.put("key4","love");
        map.put("key5","you");
        map.put("key6","jing");

      Set<String> s = map.keySet();
        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Collection<String> collection = map.values();
        Iterator<String> iterator2 = collection.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

    }
}
