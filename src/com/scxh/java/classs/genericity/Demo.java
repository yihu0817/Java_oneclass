package com.scxh.java.classs.genericity;

public class Demo {

	public static void main(String[] args) {
		Point point = new Point();
		point.setX("东经180度");
		point.setY("北纬210度");

		Point point1 = new Point();
		point1.setX(10);
		point1.setY(10);

		Point point2 = new Point();
		point2.setX(12.88);
		point2.setY("北纬210度");

		int x1 = (Integer) point1.getX();
		int y1 = (Integer) point1.getY();

		String x = (String) point.getX();
		String y = (String) point.getY();

		double x2 = (Double) point2.getX();
		String y2 = (String) point2.getY();

		System.out.println("x =" + x + " y=" + y);
		System.out.println("x1 =" + x1 + " y1=" + y1);
		System.out.println("x2 =" + x2 + " y2=" + y2);

	}

}
