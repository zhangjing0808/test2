package com.zj.file.helloFile;

import java.io.File;
import java.io.IOException;

public class HelloFileDemo01 {
    public static void main(String[] args) {
        File file = new File("hello.txt");

        //是否存在
        if (file.exists()) {
            //文件夹结构必须处于同一分区
            //文件处于不同的分区，需要使用文件的拷贝，而不是文件的重命名
            File nameto = new File("new Hello.txt");
            file.renameTo(nameto);
//            //文件
//            System.out.println(file.isFile());
//            //路径（文件夹）
//            System.out.println(file.isDirectory());
//            file.delete();
//            System.out.println("文件已删除");
        }else {
            System.out.println("文件不存在");
            try {
                file.createNewFile();
                System.out.println("文件已经成功创建");
            }catch (IOException e) {
                System.out.println("文件无法创建");
            }
        }
    }
}
