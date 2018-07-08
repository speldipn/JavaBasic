package com.speldipn.example.fc_java.Loop;

public class ArrayLoop {

	public static void main(String[] args) {
		int array[] = new int[31];
		
		for(int index = 0; index < array.length; ++index) {
			array[index] = index + 1;
		}
		
//		for(int index = 0; index < array.length; ++index) {
//			System.out.println("[" + index + "]: " + array[index]);			
//		}
		
		// 향상된 for문
		for(int value : array) {
//			System.out.println(value);
		}
		
		for (int i : array) {
			System.out.println(i);
			
		}

	}

}
