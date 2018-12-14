package com.zj.file.filescan.main;

import java.io.File;

public class Scanner {
    public static void main(String[] args) {
        printFiles(new File("D:\\IDEA\\test2\\src\\com\\zj\\file"),1);


    }
    public static void printFiles(File dir,int tab) {
        if(dir.isDirectory()) {
            File next[] = dir.listFiles();
            for (int i = 0; i < next.length; i++) {
                for (int j = 0; j < tab; j++) {
                    System.out.print("|--");
                }
                System.out.println(next[i].getName());
                if (next[i].isDirectory()) {
                    printFiles(next[i],tab+1);
                }
            }
        }
    }
}
