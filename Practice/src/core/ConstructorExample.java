package core;

public class ConstructorExample {
	 
	ConstructorExample(int a, int b)  
	    {  
	        System.out.println("a = "+a+" b = "+b);  
	    }  
	ConstructorExample(int a, float b)  
	    {  
	        System.out.println("a = "+a+" b = "+b);  
	    }  
	    public static void main (String args[])  
	    {  
	        byte a = 10;   
	        byte b = 15;  
	        ConstructorExample test = new ConstructorExample(a,b);  
	    }  
	}  

