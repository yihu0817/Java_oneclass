package com.scxh.java.ex022.enums.map;

public class Test {
	public static final int YEAR = 2015;
	public static final int MONTH = 5;
	public static final int DATE = 15;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "今年是" + YEAR + "年" + MONTH + "月" + DATE + "日";

		System.out.println(str);

		String strS = "今年是:" + Calendar.YEAR + "年" + Calendar.MONTH + "月" + Calendar.DATE + "日";

		System.out.println(strS);
		
		testEnum();

	}
	
	public static void testEnum(){
		Calendar a = Calendar.YEAR;
		String name = a.name();
		int order = a.ordinal();
		String value = a.toString();
		String str = "今年是" + name + "年" + order + "月" + value + "日";
		
		System.out.println(str);
		
		
	}

}
