package com.speldipn.example.java_ysw.ch24;

import java.io.*;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-15
 */
public class SerializableInstMember {
    static class Point implements Serializable {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class Circle implements Serializable {
         Point p;
        double rad;

        public Circle(Point p, double rad) {
            this.p = p;
            this.rad = rad;
        }

        public void showCircleInfo() {
            System.out.printf("[%d, %d] \n", p.x, p.y);
            System.out.println("rad : " + rad);
        }
    }

    private static final String FILENAME = "object.ser";
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILENAME));
        out.writeObject(new Circle(new Point(1, 1), 2.4));
        out.writeObject(new Circle(new Point(2, 4), 2.4*2));
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILENAME));
        Circle c1 = (Circle) in.readObject();
        Circle c2 = (Circle) in.readObject();
        in.close();

        c1.showCircleInfo();
        c2.showCircleInfo();
    }
}
