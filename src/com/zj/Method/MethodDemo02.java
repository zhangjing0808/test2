package com.zj.Method;

public class MethodDemo02 {
    public static void main(String[] args) {
        tell(10,20);
        tell(10,20,30);
    }

    public static void tell(int i,int j) {
        System.out.println(i+j);
    }
    public static void tell(int i,int j,int n) {
        System.out.println(i+j+n);
    }
}
