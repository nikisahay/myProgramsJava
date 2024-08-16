package strings;

import java.util.Scanner;

public class CountCharacters {
	public static void main(String[] args) {
  //String n = "nothing";
  Scanner s= new Scanner(System.in);
	System.out.println("Please enter a string:: \n");
	String n = s.next();
	n = n.replaceAll("\\s", "").toLowerCase();
	int len = n.length();
  System.out.println("The entered string is " +n);
  int counter=0;
  for(int i = 0;i<len;i++)
  {
	  if(n.charAt(i)!=' ')
		  counter++;
     }
   System.out.println("Total characters " +counter);
   }
}
