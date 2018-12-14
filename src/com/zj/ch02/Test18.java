package com.zj.ch02;

public class Test18 {
    public static void main(String[] args) {
        args[0] = "10";
        args[1] = "3";
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(a + "+" + b + "=" + (a+b));
        System.out.println(a + "-" + b + "=" + (a-b));
        System.out.println(a + "*" + b + "=" + a*b);
        System.out.println(a + "/" + b + "=" + a/b);


    }
}
