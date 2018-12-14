package com.zj.file.setFileProperty;

import java.io.File;

public class SetFilePropertyDemo01 {
    public static void main(String[] args) {
        File file = new File("test.file");
        if (file.exists()) {
            //将文件设定为可写
            file.setWritable(true);
            //将文设定为可读
            file.setReadable(true);
            //将文件设定为只读
            file.setReadOnly();
        }


    }
}
