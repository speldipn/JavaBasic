package com.speldipn.example.fc_java.FileIO.src.com.speldipn.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseStream {
	
	// 1. 파일 일기
	public String read(String filePath) {
		String result = "";		
		File file = new File(filePath);
		try(FileInputStream fis = new FileInputStream(file)) {
			
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			
			// 파일 인풋 스트림은 한번에 한글자씩 읽는다 -> 한글자를 숫자값으로 읽어들인다.
			 int oneChar = 0;
			
			// 반복문을 통해 한글자씩, 글자가 없을때까지 읽어들인다.
			while((oneChar = isr.read()) != (-1)) {
				System.out.print((char)oneChar);
				result = result + (char)oneChar;
			}
			System.out.println();
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		} 
		
		return result;
	}
	
	// 2. 파일 쓰기
	public void write(String filePath, String message) {
		File file = new File(filePath);		
		/*
		 * JDK8부터 try - with 문법 추가
		 */		
		try (FileOutputStream fos = new FileOutputStream(file);) {
			fos.write(message.getBytes());
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}
