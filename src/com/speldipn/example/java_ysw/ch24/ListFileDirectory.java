package com.speldipn.example.java_ysw.ch24;

import java.io.File;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-15
 */
public class ListFileDirectory {
    public static void main(String[] args) {
        File myDir = new File("MyDir");
        File[] list = myDir.listFiles();

        for (int i = 0; i < list.length; ++i) {
            System.out.println(list[i].getName() + " # abs: " + list[i].getAbsolutePath());
            if (list[i].isDirectory()) {
                System.out.println("\t \t DIR");
            } else
                System.out.println("\t \t FILE");
        }
    }
}
