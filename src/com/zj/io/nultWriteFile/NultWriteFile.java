package com.zj.io.nultWriteFile;

import java.io.*;

/**
 * RandomAccessFile随机文件读写
 */
public class NultWriteFile {
    static File file = new File("textw.txt");
    public static void main(String[] args) {
//        if (file.exists()) {
//            file.delete();
//        }
//        new WriteFile(file,1).start();
//        new WriteFile(file,2).start();
//        new WriteFile(file,3).start();
//        new WriteFile(file,4).start();
//        new WriteFile(file,5).start();

        /**
         * 读取文件
         */
        try {
            RandomAccessFile raf = new RandomAccessFile(file,"r");
            //从400开始读取
            raf.seek(400);
            byte[] str = new byte[5];
            raf.read(str);
            String in = new String(str);
            System.out.println(in);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
