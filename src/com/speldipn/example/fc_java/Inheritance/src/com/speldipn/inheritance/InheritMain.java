package com.speldipn.example.fc_java.Inheritance.src.com.speldipn.inheritance;

public class InheritMain {

	public static void main(String[] args) {
		
		// 1. 상속이란?
		// 부모 class 정의된 것을 상속받은 자식 class가 사용할 수 있다
		Child child = new Child();		
		child.printHouse();		
		
		// 1.2 상속관계에서의 호출순서
		// 생성자 호출 순서 : 부모 -> 자식
		// 소멸자 호출 순서 : 자식 -> 부모
		
		// 1.3 다단 상속 알아보기
		//GrandChild grandChild = new GrandChild();
		
		// 1.4 다중상속은 허용되지 않는다
		
		// 2. 오버라이드
		// - 보다 더 중요하다
		// 상속관계에서 자식에 선언된 자원을 사용하기 위해 사용한다
	}

}

class Parent {
	int money = 1000;
	String car = "BMW530i";
	String house = "XX아파트";
	
	public Parent() {
		System.out.println("엄마다");
	}
	
	public void printHouse() {
		System.out.println(house);
	}
}

// 상속을 받기 위해서는 extends 예약어를 사용한다
class Child extends Parent {
	String house = "초가집";
	
	public Child() {
		System.out.println("엄마 나야");
	}
	
	public void printHouse() {
		System.out.println(super.house);
	}
	// super 예약어를 사용하면 부모의 자원을 사용할 수 있다.
	public void printParentHouse() {
		super.printHouse();
	}
	// this는 현재 내 클래스에 있는 자원을 사용하게 한다
	public void print() {
		this.printHouse(); 
	}
}

class GrandChild extends Child {
	public GrandChild() {
		System.out.println("할머니 저에요");
	}
}