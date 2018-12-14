package com.zj.Method;

public class MethodDemo03 {
    public static void main(String[] args) {
        System.out.println(addNum(100));
    }
    /**
     * 从1加到100
     * */
    public static int addNum(int num) {
        if (num == 1) { //程序出口
            return  1;
        }else {
            return num + addNum(num-1);
        }
    }
}
