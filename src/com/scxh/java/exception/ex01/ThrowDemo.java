package com.scxh.java.exception.ex01;

import java.io.FileReader;
import java.io.IOException;

public class ThrowDemo {

	public static void main(String[] args) {
		ThrowDemo obj = new ThrowDemo();
		try {
			
			obj.readFileMethod();
			obj.arithmeticThrowMethod();
			
		} catch (ArithmeticException a) {
			System.out.println("除数为零  .");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//一定执行的代码
		}
	}

	public void arithmeticThrowMethod() {
		int a = 10;
		int b = 0;

		if (b == 0) {
			throw new ArithmeticException();
//			throw new Exception();
		}

		int c = a / b;

		System.out.println(c);
	}

	/**
	 * throws 告诉方法调用者此方法可能会引一个异常
	 * 
	 * @throws IOException
	 */
	public void readFileMethod() throws IOException {

		FileReader fileReader = new FileReader("f:\\test.txt");
		
		char[] c = new char[1000];
		
		int count = fileReader.read(c); //从输入流读取数据返回读取数据个数
		
		System.out.println("字符个数 :" + count);
		
		String str = new String(c, 0, count);//把字符数组转换成字符串
		
		System.out.println(str);

	}
	
	public void readFilefinally(){
		FileReader fileReader = null;
		try{

			fileReader = new FileReader("f:\\test.txt");
			
			char[] c = new char[1000];
			
			int count = fileReader.read(c); //从输入流读取数据返回读取数据个数
			
			System.out.println("字符个数 :" + count);
			
			String str = new String(c, 0, count);//把字符数组转换成字符串
			
			System.out.println(str);
			
		}catch(IOException io){
			io.printStackTrace();
		}finally{
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
