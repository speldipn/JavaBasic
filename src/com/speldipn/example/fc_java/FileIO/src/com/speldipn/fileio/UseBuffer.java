package com.speldipn.example.fc_java.FileIO.src.com.speldipn.fileio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UseBuffer {
	//1. 읽기
	public String read(String filePath) {
		String result = "";
		
		File file = new File(filePath);
		
		//1.2 파일 스트림을 열어준다.
		try(FileInputStream fis = new FileInputStream(file)) {
			
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			// 1.4 한번에 읽어서 담아둘 그릇의 사이즈를 정한다
			byte[] basket = new byte[1024];
			while(true) {
				// 더 이상 읽을 수 없ㅇ면 -1을 리턴
				int flag = bis.read(basket, 0, basket.length);
				// 1.5 파일의 끝일 경우 read() 함수에서 -1을 리턴한다. 따라서 break로 while 구문을 종료한다.
				if(flag == (-1))break;
				result = result + new String(basket);
			}			
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		return result;
	}
	
	//2. 쓰기
	public void write(String filePath, String content) {
		File file = new File(filePath);
		
		try(FileOutputStream fos = new FileOutputStream(file);) {
			
			// 버퍼를 달아준다.
			BufferedOutputStream bos = new BufferedOutputStream(fos);			
			bos.write(content.getBytes());
			bos.flush();	
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
