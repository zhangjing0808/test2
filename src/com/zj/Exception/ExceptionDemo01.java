package com.zj.Exception;

class Exc {
    int a = 10;
    int b = 10;
}
public class ExceptionDemo01 {
    public static void main(String[] args) {
        int temp = 0;
        Exc e = null;
//        e = new Exc();
        try {
            temp = e.a / e.b;
            System.out.println(temp);
        }catch (NullPointerException e2) {
            System.out.println("空指针异常：" + e2);
        }catch (ArithmeticException e2) {
            System.out.println("算数异常：" + e2);
        }finally {
            System.out.println("程序退出");
        }






    }
}
