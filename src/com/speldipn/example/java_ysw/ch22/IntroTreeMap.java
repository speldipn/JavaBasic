package com.speldipn.example.java_ysw.ch22;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeMap;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-14
 */
public class IntroTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tMap = new TreeMap<>();
        tMap.put(1, "data1");
        tMap.put(3, "data3");
        tMap.put(5, "data5");
        tMap.put(2, "data2");
        tMap.put(4, "data4");

//        Set<Integer> s = tMap.keySet();
//        Iterator<Integer> itr = s.iterator();
//        while (itr.hasNext()) {
//            System.out.println(tMap.get(itr.next()));
//        }
//        System.out.println("\n");

        NavigableSet<Integer> navi = tMap.navigableKeySet();

        System.out.println("오름차순 출력");
        Iterator<Integer> it = navi.iterator();
        while (it.hasNext())
            System.out.println(tMap.get(it.next()));

        System.out.println("내림차순 출력");
        it = navi.descendingIterator();
        while (it.hasNext())
            System.out.println(tMap.get(it.next()));
    }
}
