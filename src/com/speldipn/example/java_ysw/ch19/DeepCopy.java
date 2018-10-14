package com.speldipn.example.java_ysw.ch19;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-12
 */
public class DeepCopy {
  static class Point implements Cloneable {
    private int xpos;
    private int ypos;

    public Point(int x, int y) {
      xpos = x;
      ypos = y;
    }

    public void showPosition() {
      System.out.printf("[%d, %d] \n", xpos, ypos);
    }

    public void changePos(int x, int y) {
      xpos = x;
      ypos = y;
    }

    public Object clone() throws CloneNotSupportedException {
      return super.clone();
    }
  }

  static class Rectangle implements Cloneable {
    Point leftTop;
    Point rightBottom;

    public Rectangle(int x1, int y1, int x2, int y2) {
      leftTop = new Point(x1, y1);
      rightBottom = new Point(x2, y2);
    }

    public void changePos(int x1, int y1, int x2, int y2) {
      leftTop.changePos(x1, y1);
      rightBottom.changePos(x2, y2);
    }

    public void showPosition() {
      System.out.print("좌 상단 : ");
      leftTop.showPosition();
      System.out.print("우 하단 : ");
      rightBottom.showPosition();
    }

    public Object clone() throws CloneNotSupportedException {
//      Rectangle r = new Rectangle(leftTop.xpos, leftTop.ypos, rightBottom.xpos, rightBottom.ypos);
      Rectangle r = (Rectangle) super.clone();
      r.leftTop = (Point) leftTop.clone();
      r.rightBottom = (Point) rightBottom.clone();
      return r;
    }
  }

  public static void main(String[] args) {
    Rectangle r1 = new Rectangle(1, 1, 9, 9);
    Rectangle r2;

    try {
      r2 = (Rectangle) r1.clone();
      r1.changePos(2, 2, 7, 7);
      r1.showPosition();
      r2.showPosition();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
  }
}
