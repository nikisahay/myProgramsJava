package test;

public class AdvanceCal implements Calc{

	public static void main(String[] args) {
		
		//x=10;  Interface is having final variable and cant be changed.
		Calc obj = new AdvanceCal();
		obj.add();
		obj.sub();
		obj.multi();
		((AdvanceCal) obj).CalculateSin();

	}
	
	public void CalculateSin()
	{
		System.out.println("I am in Advance Calc -- Sin theta method");
	}

	public void add() {
		System.out.println("I am in addition method");
		
	}

	public void sub() {
		System.out.println("I am in subtraction method");
		
	}

	public void multi() {
		System.out.println("I am in multiplication method");
		
	}

}
