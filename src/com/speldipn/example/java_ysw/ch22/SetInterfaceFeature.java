package com.speldipn.example.java_ysw.ch22;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-14
 */
public class SetInterfaceFeature {
    public static void main(String[] args) {
        HashSet<String> hSet = new HashSet<>();
        hSet.add("First");
        hSet.add("Second");
        hSet.add("Third");
        hSet.add("Fourth");

        System.out.println("저장된 데이터 수: " + hSet.size());

        Iterator<String> it = hSet.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
