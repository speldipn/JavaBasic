package com.speldipn.example.java_ysw.ch24;

import java.io.*;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-15
 */
public class BufferFileCopy {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("org.avi");
        OutputStream out = new FileOutputStream("cpy.avi");

        int copyByte = 0;
        int readLen;
        byte buf[] = new byte[1024];

        long prev = System.currentTimeMillis();

        while (true) {
            readLen = in.read(buf);
            if(readLen == (-1)) {
                break;
            }
            out.write(buf, 0, readLen);
            copyByte += readLen;
        }

        in.close();
        out.close();
        System.out.println("복사된 바이트 크기 : " + copyByte);
        System.out.println("elapsed time : " + (System.currentTimeMillis() - prev)/1000 + "[sec]");

    }
}
