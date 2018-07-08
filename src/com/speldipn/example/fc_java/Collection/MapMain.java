package com.speldipn.example.fc_java.Collection;

import java.util.HashMap;

public class MapMain {

	public static void main(String[] args) {
		
		// Map - Map 인터페이스를 사용한다.
		// key 와 value로 입력되고, 키로 조회할 수 있는 컬렉션이다.
		
		/*
		 * 중요 - 컬렉션은 generic과 함께쓴다.
		 */
		
		// 1. 정의
		HashMap<String, Integer> map = new HashMap<>();
		
		// 2. 입력 - put(키, 값) 키와 값을 모두 입력
		map.put("마지막월", 12);
		map.put("첫월",  1);
		
		// 3.조회 - 키로 조회
		int lastMonth = map.get("마지막월");
		System.out.println(lastMonth);
		
		int firstMonth = map.get("첫월");
		System.out.println(firstMonth);
		
		// 4.수정
		map.put("마지막월",11);
		lastMonth = map.get("마지막월");
		System.out.println(lastMonth);
		
		// 5.삭제
		map.remove("마지막월");
		System.out.println("사이즈: " + map.size());
	}
}
