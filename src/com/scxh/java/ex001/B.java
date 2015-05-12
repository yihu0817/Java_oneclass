package com.scxh.java.ex001;

class B {
	int x = 10;

	int getA() {
		return x;
	}
}

class C extends B {
	int x = 100;

	int getB() {
		return x;
	}

}

class Demo {
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.getA());
		System.out.println(c.getB());
		System.out.println(c.x);
		
		
	}
}
