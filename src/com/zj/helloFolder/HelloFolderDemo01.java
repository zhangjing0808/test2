package com.zj.helloFolder;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.sql.SQLOutput;

public class HelloFolderDemo01 {
    public static void main(String[] args) {
//        File folder = new File("my new folders/one/two/three/main");
//        if (folder.mkdirs()) {
//            System.out.println("文件夹创建完成");
//        }else {
//            if (folder.exists()) {
//                System.out.println("文件夹已经存在不用创建");
//            }else {
//                System.out.println("文件夹创建失败");
//            }
//        }

//        File folder = new File("my new folders/one/two");
////        File newFolder = new File("my new folders/two");
////
////        if (folder.renameTo(newFolder)) {
////            System.out.println("done");
////        }else {
////            System.out.println("fail");
////        }

        //文件夹必须是空文件夹才能被删除
        File folder = new File("my new folders/one");
        if (folder.delete()) {
            System.out.println("done");
        }else {
            System.out.println("fail");
        }

    }
}
