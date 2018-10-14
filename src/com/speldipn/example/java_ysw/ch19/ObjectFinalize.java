package com.speldipn.example.java_ysw.ch19;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-12
 */
public class ObjectFinalize {
  static class MyName {
    String objName;
    public MyName(String name) {
      objName = name;
    }

    @Override
    protected void finalize() throws Throwable {
      super.finalize();
      System.out.println(objName + "이 소멸되었습니다.");
    }
  }
  public static void main(String[] args) throws Exception {
    MyName obj1 = new MyName("Instance 1");
    MyName obj2 = new MyName("Instance 2");

    obj1 = null;
    obj2 = null;
    System.out.println("프로그램을 종료합니다.");
//    System.gc();
//    System.runFinalization();
    Thread.sleep(1000);
  }
}
