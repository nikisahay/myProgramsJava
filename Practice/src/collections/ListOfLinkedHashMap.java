package collections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class ListOfLinkedHashMap {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		// create LinkedHashMap 
//        LinkedHashMap<Integer, String> lhmap 
//            = new LinkedHashMap<Integer, String>(); 
//  
//        // add elements in LinkedHashMap 
//        lhmap.put(1, "One"); 
//        lhmap.put(2, "Two"); 
//        lhmap.put(3, "Three"); 
//        lhmap.put(4, "Four"); 
//        lhmap.put(5, "Five"); 
//  
//        // Create List 1 that store keys 
//        List<Integer> list1 = new ArrayList<Integer>(lhmap.keySet()); 
//  
//        // display List 1 
//        System.out.println("List 1 - " + list1); 
//  
//        // Create List 2 that store values 
//        List<String> list2  = new ArrayList<String>(lhmap.values()); 
//  
//        // display List 1 
//        System.out.println("List 2 - " + list2); 
//    } 
	 public static void main(String[] args) 
	    {
	        int x, y, z;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the first number:");
	        x = s.nextInt();
	        System.out.print("Enter the second number:");
	        y = s.nextInt();
	        System.out.print("Enter the third number:");
	        z = s.nextInt();
	        if(x > y && x > z)
	        {
	            System.out.println("Largest number is:"+x);
	        }
	        else if(y > z)
	        {
	            System.out.println("Largest number is:"+y);
	        }
	        else
	        {
	            System.out.println("Largest number is:"+z);
	        }
	    }
}


