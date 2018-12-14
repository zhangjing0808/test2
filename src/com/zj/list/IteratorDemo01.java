package com.zj.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo01 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("a");
        lists.add("b");
        lists.add("c");
        lists.add("d");
        lists.add("e");
        lists.add("f");
        Iterator<String> iterator = lists.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if ("a".equals(str)) {
                iterator.remove();
            }else {
                System.out.println(str);
            }
        }

    }
}
