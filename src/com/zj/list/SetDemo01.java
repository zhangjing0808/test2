package com.zj.list;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo01 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
//        Set<String> s = new TreeSet<>();
        s.add("a");
        s.add("c");
        s.add("d");
        s.add("e");
        s.add("b");
        s.add("f");
        System.out.println(s);
    }
}
