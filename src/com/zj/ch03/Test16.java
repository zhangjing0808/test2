package com.zj.ch03;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入java分数：");
        int java = scanner.nextInt();
        System.out.println("输入android分数：");
        int android = scanner.nextInt();
        System.out.println("输入sql分数：");
        int sql = scanner.nextInt();

        if(java >= android && java >= sql) {
            System.out.println("最高分为：" + java);
        }else if(android > java && android > sql) {
            System.out.println("最高分为：" + android);
        }else {
            System.out.println("最高分为：" + sql);
        }
    }
}
