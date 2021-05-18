package HurleyCodes;

public class QuickSort {

	// http://www.mycstutorials.com/articles/sorting/quicksort​
	public void quickSort(int array[]) {
		for (int x : array)	System.out.print(x + " ");
		System.out.println();
		quickSort(array, 0, array.length - 1);
		}
	
	public void quickSort(int array[], int start, int end) {
		int i = start; // index of left-to-right scan​
		int k = end; // index of right-to-left scan​
		if (end - start >= 1) // check that there are at least two elements​
		{
			int pivot = array[start]; // set the first element as pivot​
			System.out.println("pivot " + pivot);
			System.out.println("i: " + i + " k: " + k);
			while (k > i) // while the scan indices have not met​
			{
				while (array[i] <= pivot && i <= end && k > i) {// from the left, look for the first​
					i++; // element greater than the pivot​
				System.out.println("i: " + i);
				}
				while (array[k] > pivot && k >= start && k >= i) {
				// from the right, look for the first​
				k--; // element not greater than the pivot​
				System.out.println("k: " + k);
				}
				if (k > i) // if the left seekindex is still smaller than​
					swap(array, i, k); // the right index, swap the corresponding elements​
			}	
			swap(array, start, k); // after the indices cross, swap the last element in the left partition with the​ pivot​
			quickSort(array, start, k - 1); // quicksort the left partition​
			quickSort(array, k + 1, end); // quicksort the right partition​
		}
		 else // if there is only one element in the partition, do not do any sorting​
			 {
			 return; // the array is sorted, so exit​
			 }
	}
	public void swap(int array[], int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
	
		array[index2] = array[index2];
		array[index2] = temp;
		for(int x: array)
			System.out.print(x + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		QuickSort q = new QuickSort();
		int[] myArray = {5,4,10,11,3,9,8,1};
		q.quickSort(myArray);
	}
}
