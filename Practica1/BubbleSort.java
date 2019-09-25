public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
		Integer [] a = {1, 0, 0, 0, 2, 0 };
		//Integer [] a = {8, 7, 6, 5, 4, 9 };
		BS(a, a.length);
		for(int i = 0; i<a.length; i++)
			System.out.print(""+a[i]);
		}

public class BubbleSort {
	/**
	 * This method the BubbleSort method. Returns
	 * the array in increasing order.
	 *
	 * @param array The array to be sorted
	 * @param size The count of total number of elements in array
	 **/

	public static <T extends Comparable<T>> void BS(Integer array[], int size) {
		boolean swap;
		int last = size - 1;
		
		do
		{
			swap = false;
			for (int count = 0; count < last; count++)
			{
				int comp = array[count].compareTo(array[count + 1]);
				if (comp > 0)
				{
					Integer temp = array[count];
					array[count] = array[count + 1];
					array[count + 1] = temp;
					swap = true;
				}
			}
		} while (swap);
	}
}

}