package com.speldipn.example.fc_java.DesignTools.src.com.speldipn.tools;

public class ToolMain {

	public static void main(String[] args) {
		// 객체지향을 설계할 수 있도록 도와주는 것들
		
		// 1. interface
		// 설계자의 의도대로 기능을 구현하도록 강제하는 것
		// 설계자가 미리 정해놓은 함수 이름
		
		Child chd = new Child();
		chd.function();
		chd.function2();	
		chd.open();
		chd.close();
		
		
		// 2. abastract
		// 설계자의 의도대로 기능을 구현하도록 강제하는 것
		// 설계자가 미리 정해놓은 함수이름 + 로직(연산이 일어난 코드)
		// 초기화 할 수 없다 > 상속을 통해서만 사용할 수 있다.
		
		AbstractChild child = new AbstractChild();
		child.open();
		child.close();
		child.something();
		
		// 3. annotation 
		// 사전적 의미로"주석 달기" 라는 뜻이다
		// 주석앞에 @을 이용하여 주석을 작성하는 것이다.

		// 주석과 annotation과의 차이 
		// 1. 주석은 개발자를 위한 용도로 사용되는 비고
		// 2. annotation은 개발자, 컴파일러, 런타임(실행환경)
		
		// ex) @Override - 컴파일러에 정보를 제공 ( 개발자에게도 알려준다 )
		// 애너테이션의 용도
		// 가. 컴파일러에 정보 제공
		// 나. 실행시간에 특수기능제공
		// 다. 코드 자동 생성
		
		AnnoClass anno = new AnnoClass();
		// anno 변수에서 애너테이션 정보꺼내기
		String value = anno
				.getClass()
				.getAnnotation(Annotation.class).val();				
		System.out.println(value);
		
		Class cls = anno.getClass();
		Annotation ano = (Annotation) cls.getAnnotation(Annotation.class);
		String key = ano.key();
		System.out.println(key);
		
	}
}

// 인터페이스 만들기
interface ITool {
	// 내부에 함수만 만들 수 있다.
	// body가 없다
	public void function();
	public 	void function2();
}

interface IDoor {
	public void open();
	public void close();
}

// 2. 인터페이스 사용하기 = 상속에서의 extends와 유사하게 사용 > 인터페이스에서는 implements라는 예약어 사용
class Child implements ITool, IDoor {

	@Override // 애너테이션
	public void function() {
		System.out.println("구현한 함수1이 실행됨");
	}

	@Override
	public void function2() {		
		System.out.println("구현한 함수2이 실행됨");
	}
	
	@Override
	public void open() {
		System.out.println("문이 열렸습니다.");		
	}

	@Override
	public void close() {
		System.out.println("문이 닫혔습니다.");		
	}
}

/* 애너테이션 사용하기 */
@Annotation(key = "추가된 키의 값")
class AnnoClass {
	
}

// 1. abstract 만들기
// class에 붙이는 예약어와 같은 것
abstract class  Abstract {
	
	abstract public void open();
	public void close() {
		System.out.println("문이 닫혔습니다");
	}
	
}

// 2. abstract 사용하기 > 상속과 동일

class AbstractChild extends Abstract {

	@Override
	public void open() {
		System.out.println("문이 열렸습니다");		
	}
	
	public void something() {
		
	}
	
}
