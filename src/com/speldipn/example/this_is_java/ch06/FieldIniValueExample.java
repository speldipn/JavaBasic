package com.speldipn.example.this_is_java.ch06;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-19
 */
public class FieldIniValueExample {
  public static void main(String[] args) {
    FieldInitValue fiv = new FieldInitValue();

    System.out.println("byteField: " + fiv.byteField);
    System.out.println("shortField : " + fiv.shortField);
    System.out.println("intField : " + fiv.intField);
    System.out.println("longField : " + fiv.longField);
    System.out.println("booleanField : " + fiv.booleanField);
    System.out.println("charField : " + fiv.charField);
    System.out.println("floatField : " + fiv.floatField);
    System.out.println("doubleField : " + fiv.douebleField);
    System.out.println("arrField : " + fiv.arrField);
    System.out.println("referenceField : " + fiv.referenceField);
  }
}
