package com.scxh.java.ex012.classs.interfaces;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SataHdd sam = new SamsungHdd();
		int count = SataHdd.count;
		sam.writeData("ÈıĞÇÓ²ÅÌ");
		sam.readData();
		
		SataHdd sea = new SeagateHdd();
		sea.writeData("Ï£½İÓ²ÅÌ");
		sea.readData();
		
		
		Demo d = new Demo();
		d.show(sam);
	}
	
	public void show(SataHdd hdd){
		hdd.writeData("ÈıĞÇÓ²ÅÌ");
	}

}
