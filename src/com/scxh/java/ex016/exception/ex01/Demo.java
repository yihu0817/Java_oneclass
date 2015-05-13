package com.scxh.java.ex016.exception.ex01;

public class Demo {

	/**
	 * @param args
	 * @throws MyException 
	 */
	public static void main(String[] args) {

		Demo demo = new Demo();
		try {
			demo.show();
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

		try {
			demo.showError();
		} catch (MyException e) {
			e.printStackTrace();
		}

	}

	public void show() throws MyException {
		int code = 404;
		if (code == 404) {
			throw new MyException();
		}
	}

	public void showError() throws MyException {

		int code = 404;
		if (code == 404) {
			throw new MyException();
		}

	}

}
