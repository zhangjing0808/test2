package com.zj.ch03;

import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入分数：");
        int score = scanner.nextInt();
        boolean isPass = score >= 60;
        System.out.println(score + "及格：" + isPass);


    }
}
