package com.cg.demo;


interface Vehicle{
	public abstract int speed(); //all the variables by default are public , static and final
	void changeGear();
}

class Car implements Vehicle{
	@Override
	public int speed() {
		return 0;
	}
	
	@Override
	public void changeGear() {
		System.out.print("overriden method");
	}
}

public class InterfaceDemo {

}
