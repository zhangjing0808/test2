package com.zj.Exception;

public class ExceptionDemo02 {
    public static void main(String[] args) throws Exception{
        tell(10,0);
    }
    public static void tell(int i,int j) throws ArithmeticException{
        int temp = 0;
        temp = i/j;
        System.out.println(temp);
    }
}
