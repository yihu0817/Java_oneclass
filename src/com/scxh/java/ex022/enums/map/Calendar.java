package com.scxh.java.ex022.enums.map;

public enum Calendar {
	YEAR(2015), MONTH(5), DATE(15);
	
	int code;
	Calendar(int code){
		this.code = code;
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.code);
	}
}

//public enum Calendar {
//	YEAR, MONTH, DATE;
//}
