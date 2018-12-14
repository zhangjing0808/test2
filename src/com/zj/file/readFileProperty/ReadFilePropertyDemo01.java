package com.zj.file.readFileProperty;

import java.io.File;

public class ReadFilePropertyDemo01 {
    public static void main(String[] args) {
        File file = new File("text.txt");
        System.out.println("文件是否存在：" + file.exists());
        System.out.println("读取文件名称：" + file.getName());
        System.out.println("读取文件路径;" + file.getPath());
        System.out.println("读取文件的绝对路径;" + file.getAbsolutePath());
        System.out.println("读取文件的父级路径："+ new File(file.getAbsolutePath()).getParent());
        System.out.println("读取文件的大小：" + file.length() + "byte");
        System.out.println("判断文件是否被隐藏：" + file.isHidden());
        System.out.println("判断文件是否可读：" + file.canRead());
        System.out.println("判断文件是否可写：" + file.canWrite());
        System.out.println("判断文件是否为文件夹：" + file.isDirectory());



    }
}
