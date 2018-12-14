package com.zj.io.nultWriteFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile随机文件读写
 * 一个线程
 */
public class WriteFile extends Thread{
    File file;
    int block;
    int L = 100;
    public WriteFile(File f,int b) {
        this.file = f;
        this.block = b;
    }

    @Override
    public void run() {
        try {
            RandomAccessFile raf = new RandomAccessFile(file,"rw");
            raf.seek((block-1)*L);
            raf.writeBytes("this is block:" + block);
            raf.writeBytes("\n");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
