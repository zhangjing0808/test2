package com.zj.io;

import java.io.*;

/**
 * 使用带缓冲的字节流读写数据
 */
public class ReadByBufferedByteStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("text.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream("new2_text.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            //大型文件对应的数组可以大一些，小型文件对应的数组可以小一些
            byte input[] = new byte[2];
            bis.read(input);
            int count = 0;
            long befor = System.currentTimeMillis();
            while (bis.read(input) != -1) {
                count ++;
            }
            bis.close();
            fis.close();

            System.out.println(System.currentTimeMillis() - befor);
            System.out.println("读取了：" + count + "次");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
