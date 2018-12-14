package com.zj.ch03;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入5分制分数：");
        int score = scanner.nextInt();
        boolean isnotFiveScore = score < 0 || score > 5;
        System.out.println(score + "不是5分制分数：" + isnotFiveScore);
    }
}
