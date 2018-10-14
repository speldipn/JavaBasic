package com.speldipn.example.java_ysw.ch22;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-14
 */
public class PrimitiveCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int n = it.next();
            System.out.println(n);
        }
    }
}
