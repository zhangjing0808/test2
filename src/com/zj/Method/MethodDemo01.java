package com.zj.Method;

public class MethodDemo01 {
    public static void main(String[] args) {

    }
    public void tell() {
        System.out.println("hello zhangjing");
    }
    /**
     * 方法的返回值类型，void类型是不需要返回值的，
     * 其他的类型全部是需要有返回值的
     */

    public int say() {
        return 0;
    }

    public String print() {
        return "hello";
    }

    public void tell1(int i,String n) {
        System.out.println(n);
    }

    public int tell2(int i,String n) {
        return i;
    }
}
