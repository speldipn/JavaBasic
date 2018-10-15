package com.speldipn.example.java_ysw.ch24;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-15
 */
public class RandomFileReadWrite {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("printf.txt", "rw");
        System.out.println("Wrtie..........");
        System.out.printf("현재 입출력 위치 : %d 바이트 \n", raf.getFilePointer());

        raf.writeInt(200);
        raf.writeInt(500);
        System.out.printf("현재 입출력 위치 : %d 바이트 \n", raf.getFilePointer());

        raf.writeDouble(48.65);
        raf.writeDouble(52.24);
        System.out.printf("현재 입출력 위치 : %d 바이트 \n", raf.getFilePointer());

        System.out.println("Read............");
        raf.seek(0);
        System.out.printf("현재 입출력 위치 : %d 바이트 \n", raf.getFilePointer());

        System.out.println(raf.readInt());
        System.out.println(raf.readInt());
        System.out.printf("현재 입출력 위치 : %d 바이트 \n", raf.getFilePointer());

        System.out.println(raf.readDouble());
        System.out.println(raf.readDouble());
        System.out.printf("현재 입출력 위치 : %d 바이트 \n", raf.getFilePointer());
        raf.close();
    }
}
