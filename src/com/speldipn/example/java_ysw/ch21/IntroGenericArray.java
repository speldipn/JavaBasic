package com.speldipn.example.java_ysw.ch21;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-13
 */
public class IntroGenericArray {
    public static <T> void showArrayData(T[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        String[] strArr = new String[]{
            "Hi!",
            "I'm so happy",
            "Java Generic Programming"
        };

        showArrayData(strArr);
    }
}
