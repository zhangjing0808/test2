package com.zj.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {
        List<String> lists = null;
        lists = new ArrayList<>();
        lists.add("a");
        lists.add("b");
        lists.add("a");

        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }

        lists.remove(0);
        System.out.println("删除之后---------");
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }
        System.out.println("集合是否为空：" + lists.isEmpty());
        System.out.println("b是否存在：" + lists.indexOf("b"));

    }
}
