package com.zj.io;

import java.io.*;

/**
 * 使用字符流读取数据
 */
public class RWByCharStream {
    public static void main(String[] args) {
        try {
            File file = new File("text.txt");
            FileInputStream fis = new FileInputStream(file);
            FileOutputStream fos = new FileOutputStream("new3_text.txt");
            InputStreamReader isr = new InputStreamReader(fis,"utf-8");
            OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");

            char input[] = new char[100];
            int l = 0;
            while ((l = isr.read(input)) != -1) {
//                System.out.println(input);
                osw.write(input,0,l);
            }
            isr.close();
            fis.close();
            osw.close();
            fos.close();
            System.out.println("done");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
