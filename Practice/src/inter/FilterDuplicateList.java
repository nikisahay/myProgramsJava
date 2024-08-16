package inter;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FilterDuplicateList {
	public static void main(String[] args)
	{
	//ArrayList<Integer> duplicateList = new ArrayList<>(Arrays.asList(1,5,23,12,9,2,1,4));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
        int arr_size = 0;
        arr_size = sc.nextInt();
        
     // Read the elements of the list from the user
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < arr_size; i++) {
            int number = sc.nextInt();
            list.add(number);
        }
        sc.close();
        List<Integer> filteredList = filterDuplicates(list);
        // Print the size of the filtered list
        System.out.println("Size of filtered list: " + filteredList.size());
	}

        public static List<Integer> filterDuplicates(List<Integer> list) {
        	
        	Set<Integer> nonDuplicateList = new LinkedHashSet<>(list);
        	List<Integer> filteredList = new ArrayList<Integer>(nonDuplicateList);
        	
        	return filteredList;
        }
}
