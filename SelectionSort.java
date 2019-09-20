

public class SelectionSort implements SortingAlgorithm {
	
	//swap the positions of the values at a[i] and a[j]
	public void swap (int [] a, int i, int j) {
		int temp = a[i]; 
		a[i] = a[j]; 
		a[j] = temp; 
	}
	
	// returns index of minimum val in array a
	public int findMin(int [] a, int start) {
	
		int min=start; 
		
		//compares every val in array a after first element to check for min 
		for (int i= start+1; i<a.length; i++) {
			if (a[i] < a[min])
				min =i; 
			 
			
		}return min;
	}
	
	public void sort (int [] a) {
		for (int i = 0; i < a.length; i++) {
			
			//find min in the array from last checked, i,  to end of array, and swap 
			//the min found and the element at pos i 
			swap (a,i,(findMin(a,i)));
		}
	}
	
	public String sortName() {
		return "selection"; 
	}
}

