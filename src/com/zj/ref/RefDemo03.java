package com.zj.ref;

class Ref2 {
    String temp = "hello";
}
public class RefDemo03 {
    public static void main(String[] args) {
        Ref2 r1 = new Ref2();
        r1.temp = "world";
        System.out.println(r1.temp);
        tell(r1);
        System.out.println(r1.temp);

    }
    /**
     * String 类型数据不可变
     */
    public static void tell(Ref2 r2) {
        r2.temp = "zhangjing";
    }
}
