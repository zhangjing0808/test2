package com.zj.thisDemo;

class People1 {
    public void tell() {
        System.out.println(this);
    }
}
public class ThisDemo02 {
    public static void main(String[] args) {
        People1 p = new People1();
        System.out.println(p);
        p.tell();

    }
}
