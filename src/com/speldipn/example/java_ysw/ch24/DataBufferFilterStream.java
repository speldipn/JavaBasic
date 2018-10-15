package com.speldipn.example.java_ysw.ch24;

import java.io.*;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-15
 */
public class DataBufferFilterStream {
    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream("data.bin");
        BufferedOutputStream bos = new BufferedOutputStream(out);
        DataOutputStream dos = new DataOutputStream(bos);

        dos.writeInt(275);
        dos.writeDouble(45.79);
        dos.close();

        InputStream in = new FileInputStream("data.bin");
        BufferedInputStream bis = new BufferedInputStream(in);
        DataInputStream dis = new DataInputStream(bis);
        dis.close();

        int num1 = dis.readInt();
        double num2 = dis.readDouble();
        System.out.println("num1 : " + num1 + ", num2 : " + num2);
    }
}
