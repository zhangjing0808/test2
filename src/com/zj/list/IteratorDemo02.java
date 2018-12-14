package com.zj.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo02 {
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
            lists.remove(2);
            System.out.println(iterator.next());

        }

    }
}
