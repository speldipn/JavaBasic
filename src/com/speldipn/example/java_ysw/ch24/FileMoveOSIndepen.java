package com.speldipn.example.java_ysw.ch24;

import java.io.File;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-15
 */
public class FileMoveOSIndepen {
    public static void main(String[] args) {
        File myFile = new File("MyJava" + File.separator + "my.txt");
        if(!myFile.exists()) {
            System.out.println("원본 파일이 준비되어 있지 않습니다.");
            return;
        }

        File reDir = new File("YourJava");
        reDir.mkdir();
        File reFile = new File(reDir, "my.txt");
        myFile.renameTo(reFile);
        if (reFile.exists()) {
            System.out.println("파일 이동에 성공하였습니다.");
        } else {
            System.out.println("파일 이동에 실패하였습니다.");
        }
    }
}
