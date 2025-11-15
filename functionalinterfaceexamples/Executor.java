package com.tnsif.functionalinterfaceexamples;


public class Executor {
	public static void main(String args[]) {
		Calculate c1 = new Calculate() {
			public void calculateTesting(int a,int b) {
			  System.out.println("Addition:" +(a+b));	
			}
		};
		c1.calculateTesting(10, 20);
		Calculate c2=new Calculate()
				{
			public void calculateTesting(int a,int b)
			{
				System.out.println("Subtraction: "+(a-b));
			}
		};
		c2.calculateTesting(8, 10);
		//Lambda Expression
		Calculate c3=(n,m)->{System.out.println("multiply:"+n*m);};
		Calculate c4=(n,m)->{System.out.println("division:"+n/m);};
		
	}

}
