//Program to demonstrate method overriding - Runtime Polymorphism
package com.tnsif.day7;

public class ICICI {
	//subclass
	public class ICICI extends RBI {
		@Override
		public float getRateOfInterest() {
			return 6.9f;
		}

	}

}
