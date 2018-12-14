package com.zj.list;

import java.util.List;
import java.util.Vector;

public class ListDemo02 {
    public static void main(String[] args) {
        List<String> lists = null;
        lists = new Vector<>();
        lists.add("a");
        lists.add("b");
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }
    }
}
