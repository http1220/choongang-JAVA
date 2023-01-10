package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

//쓰기
public class IO02 {
public static void main(String[] args) {
	FileInputStream fis = null;
	FileOutputStream fos = null;
	
	try {
		fis = new FileInputStream("c:\\Temp\\temp.txt");
		fos = new FileOutputStream("c:\\Temp\\write.txt");
		
		int data = 0;//몇개 읽었습니다.
		byte[] temp = new byte[5];//실제 데이터
		while(  (data = fis.read(temp)) != -1  ) {
			System.out.println(Arrays.toString(temp));
			System.out.println("읽은 수 :"+data);
			fos.write(temp, 0, data);
			//apple
			//실제 저장할 데이터, 시작위치, 끝위치
		}
				
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
