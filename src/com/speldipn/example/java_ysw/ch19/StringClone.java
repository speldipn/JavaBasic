package com.speldipn.example.java_ysw.ch19;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-12
 */
public class StringClone {
  static class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public void changeName(String name) {
      this.name = name;
    }
    public void showPersonInfo() {
      System.out.println("이름: " + name);
      System.out.println("나이 : " + age);
      System.out.println();
    }
    public Object clone() throws CloneNotSupportedException {
      Person p = (Person) super.clone();
      return p;
//      p.name = new String(name);
//      return p;
    }
  }

  public static void main(String[] args) {
    Person p1 = new Person("준영", 31);
    Person p2;
    try {
      p2 = (Person) p1.clone();
      p1.changeName("일상");
      p1.showPersonInfo();
      p2.showPersonInfo();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
  }
}
