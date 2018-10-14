package com.speldipn.example.java_ysw.ch11;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-10
 */
public class BuilderString {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    sb.append("AB");
    sb.append(25);
    sb.append('Y').append(true);

    System.out.println(sb);

    sb.insert(2, false);
    sb.insert(sb.length(), 'Z');
    System.out.println(sb);

    SimpleAdder sa = new SimpleAdder(0);
    sa.add(10).add(20).add(30);
    System.out.println(sa);
    sa.init();

    sa.add(50).add(120);
    System.out.println(sa);
  }

  static class SimpleAdder {
    int sum = 0;
    SimpleAdder(int n) { this.sum = n; }
    public void init() { this.sum = 0; }
    public SimpleAdder add(int n) { this.sum += n; return this; }

    @Override
    public String toString() {
      return "sum=" + sum;
    }
  }
}
