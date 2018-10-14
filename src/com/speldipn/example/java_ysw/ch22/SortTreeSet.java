package com.speldipn.example.java_ysw.ch22;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-14
 */
public class SortTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> sTree = new TreeSet<Integer>();
        sTree.add(1);
        sTree.add(2);
        sTree.add(4);
        sTree.add(3);
        sTree.add(2);

        System.out.println("저장된 데이터 수 : " + sTree.size());

        Iterator<Integer> it = sTree.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
