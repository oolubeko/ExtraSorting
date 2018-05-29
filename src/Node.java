//Node class for the BST 
public class Node {
	private int data;
	private Node left;
	private Node right;
	
	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public void setLeft(Node n) {
		this.left = n;
	}
	
	public void setRight(Node n) {
		this.right = n;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public Node getLeft() {
		return this.left;
	}
	
	public Node getRight() {
		return this.right;
	}
	
	public int getData() {
		return this.data;
	}
}
