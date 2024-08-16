package core;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = { 1, 2, 7, 6, 4, 9, 12 };
		 for (int arr = 0; arr < a.length; arr++) {
	            // Print array element present at index i
	            System.out.print(a[arr] + " ");
	 }
      for(int i =0;i<a.length;i++)
      {
	    for(int j=1;j<a.length;j++) {
		 if(a[i] >a[j])
		 {
			 int temp = a[i];
			 a[i]= a[j];
			 a[j]=temp;
		 }
       }
    }
      for (int sarr = 0; sarr < a.length; sarr++) {
          // Print array element present at index i
          System.out.print(a[sarr] + " ");
      }
     
  }
}	 

