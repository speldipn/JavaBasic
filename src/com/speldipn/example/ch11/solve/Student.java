package com.speldipn.example.ch11.solve;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-16
 */
public class Student {
  private String studentNum;

  public Student(String studentNum) {
    this.studentNum = studentNum;
  }

  public String getStudentNum() {
    return studentNum;
  }

  @Override
  public int hashCode() {
    return studentNum.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Student) {
      Student student = (Student)obj;
      if(studentNum.equals(student.studentNum)) {
        return true;
      }
    }
    return false;
  }

  //
}
