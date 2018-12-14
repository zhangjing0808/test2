package com.zj.ch03;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入5分制分数：");
        int score = scanner.nextInt();
        if(score == 5) {
            System.out.println("优秀");
        }else if(score == 4) {
            System.out.println("良好");
        }else if(score == 3) {
            System.out.println("及格");
        }else if(score >= 0 && score <= 2) {
            System.out.println("不及格");
        }else {
            System.out.println("输入的分数不是5分制分数");
        }

    }
}
