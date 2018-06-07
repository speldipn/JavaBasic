package com.speldipn.example.this_is_java.ch11;

public class GcExample {
  public static void main(String[] args) {
    Employee emp;

    emp = new Employee(1);
    emp = null;
    emp = new Employee(2);
    emp = new Employee(3);

    System.out.print("emp가 최종적으로 참조하느 사원번호: ");
    System.out.println(emp.eno);
    System.gc();
  }
}

class Employee {
  public int eno;

  public Employee(int eno) {
    this.eno = eno;
    System.out.println(eno + "가 메모리에 생성됨");
  }
}
