package com.speldipn.example.java_ysw.ch24;

import java.io.*;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-15
 */
public class ByteBufferedFileCopy {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("org.avi");
        OutputStream out = new FileOutputStream("cpy.avi");

        BufferedInputStream bis = new BufferedInputStream(in);
        BufferedOutputStream bos = new BufferedOutputStream(out);

        int copyByte = 0;
        int bData;

        while (true) {
            bData = bis.read();
            if(bData == (-1))
                break;

            bos.write(bData);
            ++copyByte;
        }

        bis.close();
        bos.close();
        System.out.println("복사된 바이크 크기 : " + copyByte);
    }
}
