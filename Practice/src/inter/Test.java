package inter;

public class Test {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String s= "Passed: 100,Failed: 150";
//		String i = s.replaceAll("[^0-9]+", " ").trim();
//		System.out.println(i);
//		String s1[]=s.split("\\D+");
//		int out=0;
//	     for (String ele: s1)
//	     {
//	         if (!ele.isEmpty()){
//	             
//	          out=out+Integer.parseInt(ele);
//	         }
//	     }
//	     System.out.print(out);
		
		StringBuffer str  = new StringBuffer("madam");
		StringBuffer reverseString = str.reverse();
		if(str.equals(reverseString)) {
			System.out.println("Its a palindrome");
		}
		}
	  }
	
