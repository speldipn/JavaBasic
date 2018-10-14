package com.speldipn.example.java_ysw.ch22;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-14
 */
public class UsefulIterator {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("First");
        set.add("Second");
        set.add("Thrid");
        set.add("Fourth");

        Iterator<String> it = set.iterator();

        System.out.println("반복자를 이용한 1차 출력과 Thrid 삭제");
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
            if(s.equals("Thrid"))
                it.remove();
        }

        System.out.println("\n반복자를 이용한 2차 출력");
        it = set.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
