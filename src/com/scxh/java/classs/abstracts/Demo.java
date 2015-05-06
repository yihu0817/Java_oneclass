package com.scxh.java.classs.abstracts;

public class Demo {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RollingDoor door = new RollingDoor();
		door.doorName = "卷帘门";
		door.open();
		door.close();
		
		SlidingDoor slingDoor = new SlidingDoor();
		slingDoor.doorName = "推拉门";
		slingDoor.open();
		slingDoor.close();

	}

}
