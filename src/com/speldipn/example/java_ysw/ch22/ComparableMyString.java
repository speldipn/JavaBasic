package com.speldipn.example.java_ysw.ch22;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-14
 */
public class ComparableMyString {
    static class MyString implements Comparable<MyString> {
        String str;

        public MyString(String s) { str = s; }
        public int getLength() { return str.length(); }
        public String toString() { return str; }

        @Override
        public int compareTo(MyString str) {
            if(getLength() > str.getLength()) { return 1; }
            else if(getLength() < str.getLength()) { return -1; }
            else { return 0; }
        }
    }

    public static void main(String[] args) {
        TreeSet<MyString> tSet = new TreeSet<>();
        tSet.add(new MyString("Orange"));
        tSet.add(new MyString("Apple"));
        tSet.add(new MyString("Dog"));
        tSet.add(new MyString("Indivisual"));

        Iterator<MyString> it = tSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
