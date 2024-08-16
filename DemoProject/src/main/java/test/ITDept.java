package test;

public abstract class ITDept implements Emp{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public abstract void salary();

	@Override
	public void goodies() {
		System.out.println("Goodies for employees");
		
	}

	@Override
	public void work() {
		System.out.println("Work assigned");
		
	}

}
