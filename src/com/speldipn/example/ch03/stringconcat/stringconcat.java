package com.speldipn.example.ch03.stringconcat;

/**
 * Author : Joonyoung Oh
 * Since  : 2018-04-17
 */
public class stringconcat {
    public static void main(String[] args) {
        String str1 = "JDK" + 6.0;
        String str2 = str1 + "특징";
        System.out.println(str2);

        String str3 = "JDK" + 3 + 3.0;
        String str4 = 3 + 3.0 + "JDK";
        System.out.println(str3);
        System.out.println(str4);
    }
}
