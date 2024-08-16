package inter;

import java.util.Scanner;

public class FindTshirtSizeSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the t-shirt size :");
        int number = scanner.nextInt();
        String size;
        
        switch(number) {
        case 32:
        	size = "Small";
        	break;
        case 40:
        	size = "Medium";
        	break;
        case 44:
        	size ="Large";
        	break;
        case 48:
        	size = "X-large";
        	break;
        default:
        	size= "No such T-shirt in the store";
        	break;
        }
        System.out.println("Size is: " +size);
        scanner.close();
      }
	
	}


