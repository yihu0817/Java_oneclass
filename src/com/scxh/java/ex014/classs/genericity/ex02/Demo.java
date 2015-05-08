package com.scxh.java.ex014.classs.genericity.ex02;

public class Demo {
	/**
	 * 获取最大值
	 * 
	 * @param array
	 * @return
	 */
	public double getMax(double[] array) {
		double max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}

		return max;
	}

	public <T extends Number> T getMax(T[] array) {
		T max = null;

		for (int i = 1; i < array.length; i++) {
			T temp = array[i];
			if (temp.doubleValue() > max.doubleValue()) {
				max = array[i];
			}
		}

		return max;
	}


	public static void main(String args[]) {
		double[] array = { 10, -1, 33, 8, -8, 30.9 };

		Demo demo = new Demo();
		double max = demo.getMax(array);
		System.out.println("最大值是 ：" + max);

//		short a = (short) 10.0;
//		Short b = a;
		
		Double[] array1 = { 10.0, -1.0, 33.0, 8.0, -8.0, 30.0 };
		
//		String[] array2 = { "10", "-1", "33", "8", "-8", "30.9" };
		
		max = demo.getMax(array1);
		
		System.out.println("最大值是 ：" + max);
	}
}
