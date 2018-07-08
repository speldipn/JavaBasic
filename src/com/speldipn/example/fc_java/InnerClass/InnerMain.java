package com.speldipn.example.fc_java.InnerClass;

public class InnerMain {

	public static void main(String[] args) {
		
		// 객체지향 설계 마무리 - Inner Class 정리
		
		// inner class 란?
		// 클래스 내부에 정의하는 클래스
		
		// 1. 이너클래스 사용하기
		Outer out = new Outer();		
		Outer.Inner in = out.new Inner(); // 외부 클래스를 통해서 new 연산자를 사용할 수 있다.
		
		// 6. static 이너 클래스 사용하기
		Common.Inner in2 = new Common.Inner();
		
		// 8. 지녁 클래스 사용하기
		Local loc = new Local();
		loc.local();
		
		// 9. 익명 클래스 사용하기
		Outer3 out3 = new Outer3();
		out3.init();

	}

}

//9. 익명 클래스 - 독립적으로 만들어지는 내부 클래스 - 주로 인터페이스의 구현체로 코딩
class Outer3 {
	public void init() {
		
		// 1. 식별자가 없이 사용하는 형태
		new Anonym() {
			@Override
			public void iAmAnonym() {
				System.out.println("Hello");
				
			}			
		}.iAmAnonym();
		
		// 2. 식별자가 있는 익명클래스 
		Anonym anonym = new Anonym() {
			@Override
			public void iAmAnonym() {		
				System.out.println("Hello");				
			}			
		};
		anonym.iAmAnonym();
	}
}

class A implements Anonym {

	@Override
	public void iAmAnonym() {
		// TODO Auto-generated method stub
		
	}	
}

interface Anonym {
	public void iAmAnonym();
}



// 8. 지역(Local) 이너 클래스
// 멤버, 자신의 지역변수 등 모든 영역의 변수에 접근할 수 있다.
class Local {
	int outerVariable = 15;
	
	public void local() {
		int localVariable = 37;
		
		class Inner {
			public void init() {
				System.out.println(outerVariable);
				System.out.println(localVariable);
			}			
		}
		
		new Inner().init();
	}
}

// static 이너 클래스
class Common {	
	final static int flag = 10;
	int variable = 20;
	public static void startFunction() {}
	private void getValue() {}
	
	static class Inner {		
		public void init() {
			int innerVariable = flag; // outer의 static 멤버 변수
			startFunction();
			//getValue(); // 7. static inner 클래스에서는 외부 클래스의 static 멤버만 사용할 수 있다.
		}		
	}
}


// 1. 일반적인 이너클래스의 형태
class Outer {
	
	// 종류
	// 1. 멤버 클래스
	// 2. static 클래스
	// 3. local 클래스 - 함수안에 정의
	// 4. 익명 클래스 - 단독으로 실행되는 클래스 - 주로 interface를 구현하는 형태로 정의
	
	final static int flag = 10;
	int variable = 20;
	public static void startFunction() {}
	private void getValue() {}	
	
	class Inner {
		// 이너클래스에서는 static으로된 멤버를 사용할 수 없다.
		// 단, final은 예외다.
		//static int var = 20;
		final static int pi = 3;
		
		// 4. 외부 멤버의 이름을 사용할 수 있다.
		int variable = 35;
		
		public void init() {
			// 2. 일반 이너클래스에서는 외부클래스의 모든 자원을 사용할 수 있다. 자기것처럼
			int innerVariable = flag; // outer의static 멤버 변수
			startFunction();
			getValue();
			
		}
	}
	
}
