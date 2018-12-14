package com.zj.ch03;

import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入java分数 android分数 sql分数：");
        int java = scanner.nextInt();
        int android = scanner.nextInt();
        int sql = scanner.nextInt();
        int maxScore = java;
        if (maxScore < android) {
            maxScore = android;
        }
        if(maxScore < sql) {
            maxScore = sql;
        }
        System.out.println("最高分为：" + maxScore);

    }
}
