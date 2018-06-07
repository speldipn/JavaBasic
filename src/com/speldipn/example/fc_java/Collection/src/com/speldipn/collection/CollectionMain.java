package com.speldipn.example.fc_java.Collection.src.com.speldipn.collection;

import java.util.ArrayList;

public class CollectionMain {

	public static void main(String[] args) {
		
		/*
		 * Collection = 동적 배열
		 */
		// 배열은 정해진 크기를 벗어난 값을 입력할 수 없다.
		int[] array = new int[100];		
		//array[101] = 30;
		// 컬렉션
		// 정해진 크기가 없고, 값을 계속 넣을 수 있다
		
		// 가. List와 Set은 동일한 Collection 인터페이스를 사용한다.		
		// 1. List
		// 배열과 흡사하다. 배열처럼 index로 값을 접근		
		// 리스트에 실제 구현체는 4가지 정도 있다.
		ArrayList arrayList = new ArrayList();
		
		// 1. 1 입력 - add()
		arrayList.add("첫번째"); // List에 아무런 처리를 하지않고 값을 입력하면 Object 타입으로 변환되서 입력된다.
		arrayList.add("두번째");
		arrayList.add(37);
		
		// 1.2  조회
		String one = (String)arrayList.get(0);		
		String two = (String)arrayList.get(1);
		int three = (int)arrayList.get(2);
		
		System.out.println(arrayList.size());
		System.out.println(one + " " + two + " " + three);
		
		// 1.3 수정
		arrayList.set(0,  "수정값");
		one = (String)arrayList.get(0);		
		two = (String)arrayList.get(1);
		three = (int)arrayList.get(2);
		
		System.out.println(one + " " + two + " " + three);
		
		// 1.4 삭제
		arrayList.remove(1);
		one = (String)arrayList.get(0);		
		three = (int)arrayList.get(1);		
		
		System.out.println(one + " " + three);
		
		for(Object obj : arrayList) {
		//	String temp = (String)obj;
		//	System.out.println(temp.length());
		}
		
		// 2. Generic 사용하기
		// 컬렉션에 입력되는 타입을 특정한다. 컬렉션<타입>
		ArrayList<String> list = new ArrayList<>();
		list.add("하나");
		list.add("둘");
		//list.add(30);  // String 말고 다른 타입을 사용할 수 없다.
		for(String str : list ) {			
			System.out.println(str + ", " + str.length());
		}
		
		
		
		// 3. Set
		// List인데, 중복을 허용하지 않는 List
		
		
		
		// 나. Map은 Map 인터페이스를 사용한다.
		// 4. Map
		// 키와 값으로 구성된 배열	
		

	}

}
