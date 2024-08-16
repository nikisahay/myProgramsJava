package core;

public class ExampleArrays {

	public static void main(String[] args) {
	 int[] arr = new int[5];
	 arr[0]= 1;
	 arr[1]= 2;
	 arr[2]= 3;
	 arr[3]= 4;
	 arr[4]= 5;
	 
	 int[] arr2= {1,2,4,5,6,9,20,31,12,17,21};
	 
	 System.out.println(arr2[2]);
	 
	 //for loop arr.length => 5
	 
	 for(int i =0;i<arr.length;i++) {
        System.out.println("The array elements are :"+arr[i]);
	 }
	 
	 for(int i = 0;i<arr2.length;i++) {
	     System.out.println(arr2[i]);
	 }
	 
	 String[] name = {"rahul","shetty","selenium"};
	 for(int i= 0;i<name.length;i++) {
		 System.out.println(name[i]);
	 }
	 
	 for(String s: name) {
		 System.out.println(s);
	 }
	 
	 //check if the array has multiple of 2
	 for(int i =0 ;i<arr.length;i++) {
		 if(arr[i]%2 ==0) {
			 System.out.println(arr[i]);
			// break;
		 }else {
			 System.out.println(arr[i]+" is not multiple of 2");
		 }
	  }
   }
}
