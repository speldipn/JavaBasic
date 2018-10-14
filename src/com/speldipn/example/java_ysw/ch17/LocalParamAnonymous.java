package com.speldipn.example.java_ysw.ch17;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-11
 */
public class LocalParamAnonymous {
  interface Readable {
    void read();
  }

  static class OuterClass {
    private String myName;

    OuterClass(String name) {
      myName = name;
    }

    public Readable createLocalClassInst(final int instId) {
      return new Readable() {
        @Override
        public void read() {
          System.out.println("Outer inst name: " + myName);
          System.out.println("Local inst ID: " + instId);
        }
      };
    }
  }

  public static void main(String[] args) {
    OuterClass out = new OuterClass("Outer Class");
    Readable r1 = out.createLocalClassInst(111);
    Readable r2 = out.createLocalClassInst(222);

    r1.read();
    r2.read();
  }
}
