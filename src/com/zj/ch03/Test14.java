package com.zj.ch03;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个数：");
        int a = scanner.nextInt();
        System.out.println("输入第二个数：");
        int b = scanner.nextInt();
        if(a > b) {
            System.out.println(a + "最大的数");
        }else {
            System.out.println(b + "最大的数");
        }

    }
}
