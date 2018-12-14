package com.zj.file.rwFile;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("text.txt");
        if (file.exists()) {
            try {
                System.out.println("exists");
                FileInputStream fis = new FileInputStream(file);
                InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
                BufferedReader br = new BufferedReader(isr);
                String line;
                while ((line = br.readLine())!= null) {
                    System.out.println(line);
                }
                br.close();
                isr.close();
                fis.close();
            }catch (FileNotFoundException e) {
                e.printStackTrace();
            }catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            File newfile = new File("newfile.txt");
            FileOutputStream fos = new FileOutputStream(newfile);
            OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write("i love you honey");

            bw.close();
            osw.close();
            fos.close();

            System.out.println("写入完成");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
