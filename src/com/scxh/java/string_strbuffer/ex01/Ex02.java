package com.scxh.java.string_strbuffer.ex01;
/**
 * String类 定义字符串
 * @author viktor
 *
 */
public class Ex02 {

	public static void main(String[] args) {
		int a = 10;
		char b = '四';
		
		char[] arrayB = new char[4];
		arrayB[0] = '四';
		arrayB[1] = '川';
		arrayB[2] = '新';
		arrayB[3] = '华';
		
		for(char array:arrayB){
			System.out.print(array);
		}
		
		System.out.println("===========");
		
		
		String str = "四川新华";
		System.out.println("声明 String :"+str);
		
		String stry = new String(arrayB);
		System.out.println("new String :"+stry);
		
		System.out.println(str+"字符串长度是 "+str.length());
		
		
		System.out.println(str+"字符串中输出 \"新\"字符 "+"\""+str.charAt(1)+"\"");
		
		System.out.println("" + str.contains("华新"));
		
		
		String str1 = "中国云南新华";
		String str2 = str1.replace("中国云南", "四川");
		System.out.println("str2  :"+str2);
		
		String str3 = "中国;云南;新华";
		String[] str4;
		str4 = str3.split(";");
		
		for(String array:str4){
			System.out.println(array);
		}
		
		
	}

}
