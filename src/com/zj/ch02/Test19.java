package com.zj.ch02;

import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("姓名：");
        String name = scanner.next();

        System.out.println("性别：");
        char sex = scanner.next().charAt(0);

        System.out.println("年龄：");
        int age = scanner.nextInt();

        System.out.println("身高:");
        double height = scanner.nextDouble();

        System.out.println("性格：");
        String type = scanner.next();

        System.out.println(name + "," + sex + "," + age + "," + height + "," + type);

    }
}
