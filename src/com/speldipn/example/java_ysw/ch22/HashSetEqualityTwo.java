package com.speldipn.example.java_ysw.ch22;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-14
 */
public class HashSetEqualityTwo {
    static class SimpleNumber {
        int num;

        public SimpleNumber(int n) {
            num = n;
        }

        @Override
        public String toString() {
            return String.valueOf(num);
        }

        @Override
        public int hashCode() {
            return num % 3;
        }

        @Override
        public boolean equals(Object obj) {
            SimpleNumber comp = (SimpleNumber) obj;
            if (comp.num == num) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        HashSet<SimpleNumber> hSet = new HashSet<>();
        hSet.add(new SimpleNumber(10));
        hSet.add(new SimpleNumber(20));
        hSet.add(new SimpleNumber(20));

        System.out.println("저장된 데이터 수 : " + hSet.size());

        Iterator<SimpleNumber> it = hSet.iterator();
        while (it.hasNext()) {
            SimpleNumber sn = it.next();
            System.out.println(sn);
        }
    }
}
