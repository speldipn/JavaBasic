package com.speldipn.example.java_ysw.ch24;

import java.io.*;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-15
 */
public class TransientMembers {
    static class PersonInfo implements Serializable {
        String name;
        transient String secretInfo;

        int age;
        transient int secretNum;

        public PersonInfo(String name, String sInfo, int age, int sNum) {
            this.name = name;
            this.secretInfo = sInfo;
            this.age = age;
            this.secretNum = sNum;
        }
        public void showCircleInfo() {
            System.out.println("name: " + name);
            System.out.println("secret info : " + secretInfo);
            System.out.println("age : " + age);
            System.out.println("secret num : " + secretNum);
            System.out.println("");
        }
    }

    private static final String FILENAME = "Personal.ser";
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        /* 인스턴스 저장 */
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILENAME));

        PersonInfo info = new PersonInfo("John", "baby", 3, 42);
        info.showCircleInfo();
        out.writeObject(info);
        out.close();

        /* 인스턴스 복원 */
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILENAME));

        PersonInfo recovInfo = (PersonInfo) in.readObject();
        in.close();

        recovInfo.showCircleInfo();
    }
}
