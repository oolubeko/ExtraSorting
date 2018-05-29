//Create a binary search tree class for the tree sort algorithm.
public class BinarySearchTree {
	
	private Node root;
	
	public BinarySearchTree() {
		this.root = null;
	}
	
	public BinarySearchTree(int data) {
		this.root = new Node(data);
	}
	
	public Node getRoot() {
		return this.root;
	}
	
	public boolean isEmpty() {
		return this.root == null;
	}
	
	public void insert(int d) {																	
		this.root = insert(root, d);
	}
	
	public Node insert(Node n, int d) {
		if(n == null) {
			n = new Node(d);
		}
		else {
			if(d <= n.getData()) {
				n.setLeft(this.insert(n.getLeft(), d));;
			}
			
			else {
				n.setRight(this.insert(n.getRight(), d));
			}
		}
		
		return n;
	}
	
	public void inOrder() {
		inOrder(this.root);
	}
	
	private void inOrder(Node n) {
		if(n != null) {
			inOrder(n.getLeft());
			System.out.print(n.getData() + " ");
			inOrder(n.getRight());
		}
		
	}
}
