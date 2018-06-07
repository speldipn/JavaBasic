package com.speldipn.example.fc_java.Loop.src.com.speldipn.loop;

public class Gugudan {

	public static void main(String[] args) {
		int begin = 1;
		int end = 9;		
		int offset = 10;
		
		for(int i = begin; i <= end; ++i) {
			for(int j = 1; j <= offset; ++j) {
				int result = i * j;
//				System.out.println(i + " * " + j + " = " + result);
				System.out.printf("%d x %d = %d\n", i, j, result);
			}			
		}

	}

}
