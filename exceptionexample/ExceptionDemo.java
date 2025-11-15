package com.tnsif.exceptionexample;

public class ExceptionDemo {
	public static void main(String args[]) {
		
		int x[] = {1,2,3};
		int c;
		try {
			c=x[4];
		}
		catch(ArrayIndexOutOfBoundsException a) {
			c=x[2];
			System.out.println("C:"+c);
		}
		
	}

}
