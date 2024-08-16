package core;

public class ExceptionHandled {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		
		checkexception();
	}
		
		public static int checkexception() {
	   try{  
			      //code that may raise exception  
			      int data=100/0;  
			      System.out.println("throws arithmatic exception");  
			      return data;
			   }
	   catch(Exception e) {
		   return 1;
	   }  
  
	 finally {  
	        System.out.println("finally block is always executed");  
	      }  
		}

 }
