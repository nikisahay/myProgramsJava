package test;

public class HRDept extends ITDept{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HRDept hr = new HRDept();
		hr.goodies();
		hr.work();
		hr.salary();
		hr.bonus();
		
		ITDept it = new HRDept();
		it.goodies();
		it.work();
		it.salary();
		
		
		//We cannot create object of an abstract class ex- ITDept it = new ITDept()

	}

	@Override
	public void salary() {
		System.out.println("Salary is 5LPA");
		
	}
	
	public void bonus()
	{
		System.out.println("Bonus section ---");
	}

}
