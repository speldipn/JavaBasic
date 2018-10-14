package com.speldipn.example.java_ysw.ch22;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-14
 */
public class IntroComparator {
    static class StrLenComparator implements Comparator<String> {
        @Override
        public int compare(String str1, String str2) {
            if (str1.length() > str2.length()) {
                return 1;
            } else if (str1.length() < str2.length()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        TreeSet<String> tSet = new TreeSet<String>(new StrLenComparator());
        tSet.add("Orange");
        tSet.add("Apple");
        tSet.add("Dog");
        tSet.add("Indivisual");

        Iterator<String> it = tSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
