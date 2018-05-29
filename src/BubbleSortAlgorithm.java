//I will implement bubble sort
public class BubbleSortAlgorithm {
	
	private static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	public static void printArr(int[] a) {
		for(Integer i: a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	//The bubble sort algorithm makes n-1 passes through the array, and swaps
	//adjacent elements in the array if the preceding one is bigger than the one
	//after. It has a time complexity of O(n^2), so it is not very fast. Nevertheless,
	//it is relatively easy to code.
	public static void bubbleSort(int[] num) {
		for(int i = 0; i < num.length - 1; i++) {
			for(int j = 0; j < num.length - i - 1; j++) {
				if(num[j] > num[j + 1]) {
					swap(num, j, j + 1);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num1 = {2, 4, 1, 7, 6, 12, 8, 11, 9};
		int[] num2 = {5, 4, 3, 2, 1, 0};
		
		System.out.print("Array 1 before sort: ");
		printArr(num1);
		bubbleSort(num1);
		System.out.print("Array 1 after sort: ");
		printArr(num1);
		
		System.out.print("Array 2 before sort: ");
		printArr(num2);
		bubbleSort(num2);
		System.out.print("Array 2 after sort: ");
		printArr(num2);
		
		

	}

}
