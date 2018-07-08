package com.speldipn.example.fc_java.Inheritance.poly;

/*
 * 상속에서 가중 중요한 다형성
 */
public class Polymorphism {

	public static void main(String[] args) {
		/*
		 * 다형성? - 객체지향에서 가장 중요하다가 할 수 있다.
		 * 다형성이란? 함수의 overload 개념을 클래스로 확장 시킨것이다.
		 */

		// 코드로는 자식 생성자로 부모타입에 대입할 수 있다.
		
		// 왜 이딴 기능을 넣은거에요?  제임스 고슬링씨
		
		// 설계 때문이다 ***
		
		CarList list = new CarList();
		/// 내부적으로 Sonata sonata01 은 Car sonata01로 치환됨
		Sonata sonata01 = new Sonata();		
		list.add(sonata01);
		/// 내부적으로 Avante avante01 은 Car avante01 로 치환됨
		Avante avante01 = new Avante();
		list.add(avante01);
		
		list.print();
	}
}

// 자동차 수집가가 수집 목록에 새로운 자동차를 추가한다.

class CarList {
	final int total = 10;
	Car cars[] = new Car[total]; // 자동차를 저장할 저장소
	int index = 0;
	
	public void add(Car car) {
		cars[index] = car;
		index = index + 1;
	}
	
	public void print() {
		for(int i = 0; i < index; ++i) {
			cars[i].printName();
		}
	}
}

class Car {
	String name = "";
	public void printName() {
		System.out.println(name);
	}
}

// 개발자1
class Sonata extends Car {
	public Sonata() {
		name = "소나타";	
	}
	
	public void drive() {
		System.out.println("자동차를 운전합니다");
	}
}

// 개발자2
class Avante extends Car {
	public Avante() {
		name = "아반떼";
	}
}