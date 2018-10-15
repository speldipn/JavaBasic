package com.speldipn.example.java_ysw.ch24;

import java.io.*;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-15
 */
public class ObjectSerializable {
    static class Circle implements Serializable {
        int xPos;
        int yPos;
        double rad;

        public Circle(int x, int y, double r) {
            xPos = x;
            yPos = y;
            rad = r;
        }

        public void showCircleInfo() {
            System.out.printf("[%d, %d] \n", xPos, yPos);
            System.out.println("rad : " + rad);
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /* 인스턴스 저장 */
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Object.ser"));

        out.writeObject(new Circle(1, 1, 2.4));
        out.writeObject(new Circle(2, 2, 4.8));
        out.writeObject(new String("String implements serializable"));
        out.close();

        /* 인스턴스 복원 */
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Object.ser"));
        Circle c1 = (Circle) in.readObject();
        Circle c2 = (Circle) in.readObject();
        String message = (String) in.readObject();
        in.close();

        /* 복원된 정보 출력 */
        c1.showCircleInfo();
        c2.showCircleInfo();
        System.out.println("message : " + message);
    }
}
