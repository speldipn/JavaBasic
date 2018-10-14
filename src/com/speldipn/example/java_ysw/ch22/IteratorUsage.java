package com.speldipn.example.java_ysw.ch22;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-14
 */
public class IteratorUsage {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");

        Iterator<String> it = list.iterator();
        System.out.println("반복자를 이용한 1차 출력과 \"Third\" 삭제");
        while (it.hasNext()) {
            String curStr = it.next();
            System.out.println(curStr);
            if (curStr.compareTo("Third") == 0) {
                it.remove();
            }
        }

        System.out.println("\n\"Third\" 삭제 후 반복자를 이용한 2차 출력");
        it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
