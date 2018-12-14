package com.zj.ref;

public class RefDemo02 {
    public static void main(String[] args) {
        String temp = "hello";
        System.out.println(temp);
        tell(temp);
        System.out.println(temp);
    }
    /**
     * String 类型数据不可变
     */
    public static void tell(String str2) {
        str2 = "zhangjing";
    }
}
