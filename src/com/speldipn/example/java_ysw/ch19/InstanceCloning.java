package com.speldipn.example.java_ysw.ch19;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-12
 */
public class InstanceCloning  {
  static class Point implements Cloneable {
    private int xpos;
    private int ypos;

    public Point(int xpos, int ypos) {
      this.xpos = xpos;
      this.ypos = ypos;
    }
    public void showPosition() {
      System.out.printf("[%d, %d] \n", xpos, ypos);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
      return super.clone();
    }
  }

  public static void main(String[] args) {
    Point org = new Point(3, 5);
    Point cpy;

    try {
      cpy = (Point)org.clone();
      org.showPosition();
      cpy.showPosition();

      if(org == cpy) {
        System.out.println("동일 참조입니다.");
      } else {
        System.out.println("동일 참조가 아닙니다.");
      }
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
  }
}
