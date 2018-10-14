package com.speldipn.example.java_ysw.ch22;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-14
 */
public class ComparablePerson {
    static class Person implements Comparable<Person> {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void showData() {
            System.out.printf("%s %d \n", name, age);
        }

        @Override
        public int compareTo(Person p) {
            return age > p.age ? 1 : (age == p.age ) ? 0 : -1;
        }
    }

    public static void main(String[] args) {
        TreeSet<Person> sTree = new TreeSet<>();
        sTree.add(new Person("Lee", 24));
        sTree.add(new Person("Hong", 29));
        sTree.add(new Person("Choi", 21));

        Iterator<Person> it = sTree.iterator();
        while (it.hasNext()) {
            it.next().showData();
        }
    }
}
