package collections;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] marksArray = new int[] {55, 89, 95 , 44, 76};
			int temp;
			int lenthArray = marksArray.length;
			for(int i=0;i < lenthArray ; i++)
			{
				for (int j = i;j < lenthArray;j++)
				{
					if (marksArray[i] > marksArray[j])  // change it to < less than for descending order
					{
					temp = marksArray[i];
					marksArray[i]= marksArray[j];
					marksArray[j] = temp;
					}
				}
			}
			for (int a : marksArray)
			{
				System.out.println(a);
			}
	}

}
