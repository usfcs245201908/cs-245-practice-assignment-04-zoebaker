public class BubbleSort {
	void sort (int [] a) {
		boolean swapped = true; 
		int j = 0; 
		while (swapped) {
			swapped = false; 
			for (int i =0; i < a.length-1-j; i++) {
				if (a[i] > a[i+1]) {
					swap (a, i, i+1); 
					swapped = true; 
				}
				j++; 
			}
		}
	}
	
	void swap (int [] a, int i, int j) {
		int temp = a[i]; 
		a[i] = a[j];
		a[j] = temp; 
	}
	
	String sortName () {
		return "bubble sort"; 
	}
}
