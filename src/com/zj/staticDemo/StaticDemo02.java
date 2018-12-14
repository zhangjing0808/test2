package com.zj.staticDemo;

public class StaticDemo02 {
    /**
     *静态方法，不能调用非静态方法和属性
     * */
    private static int i = 10;
    public static void main(String[] args) {
        tell();
        System.out.println(i);
    }
    public static void tell() {

    }
}
