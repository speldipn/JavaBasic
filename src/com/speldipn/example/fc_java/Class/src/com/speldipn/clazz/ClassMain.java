package com.speldipn.example.fc_java.Class.src.com.speldipn.clazz;

public class ClassMain {

	public static void main(String[] args) {
		// 클래스 사용하기
		// 1. 변수를 클래스의 이름을 타입으로 해서 선언
		Class name;
		
		// 2. new 연산자로 초기화
		name = new Class();
		
		// Class name2 = new Class();
		
		// 3.2 변수 사용하기
		name.width = 10;
		name.height = 20;
		name.color = "red";
		System.out.println(name.width + ", " + name.height + ", " + name.color);
				
		// 3.2 함수 사용하기
		name.call();
		name.receive();
		name.printColor();
		
		// 4. 기본형과 동일하게 배열표현식을 사용할 수 있다.
		Class classes[] = new Class[5];
		
		// 5. 위에 선언한 classes 변수는 다섯개의 class를 갖는 배열변수이다
		for(int index = 0; index < classes.length; ++index) {
			classes[index] = new Class();
		}
		
		// 5.1 기본형 변수 사용하기
		String colors[] = {"빨강", "주황", "노랑", "초록", "파랑"};
		for(String color : colors) {
			System.out.println(color);			
		}
		
		for(int index = 0; index < classes.length; ++index) {
			classes[index].color = colors[index];
		}		
		
		for(int index = 0; index < classes.length; ++index) {
			classes[index].printColor();
		}
		
	}

}
