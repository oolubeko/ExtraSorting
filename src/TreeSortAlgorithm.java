import java.util.ArrayList;

//Implements the tree sort algorithm.

public class TreeSortAlgorithm {
	
	private static void storeSorted(Node m, ArrayList<Integer> n) {
		if(m != null) {
			storeSorted(m.getLeft(), n);
			n.add(m.getData());
			storeSorted(m.getRight(), n);
		}
	}

	public static void treeSort(int[] num) {
		BinarySearchTree b = new BinarySearchTree();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(Integer i: num) {
			b.insert(i);
		}
		//b.inOrder();
		storeSorted(b.getRoot(), a);
		for(int i = 0; i < num.length; i++) {
			num[i] = a.get(i);
		}
	}
	
	public static void printArr(int[] a) {
		for(Integer i: a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = {2, 4, 1, 7, 6, 12, 8, 11, 9};
		int[] num2 = {5, 4, 3, 2, 1, 0};
		
		System.out.print("Array 1 before sort: ");
		printArr(num1);
		treeSort(num1);
		System.out.print("Array 1 after sort: ");
		printArr(num1);
		
		System.out.print("Array 2 before sort: ");
		printArr(num2);
		treeSort(num2);
		System.out.print("Array 2 after sort: ");
		printArr(num2);

	}

}
