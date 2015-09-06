package sortpkg.btree;

public class Node {
	public Integer value;
	public Node left;
	public Node right;
	public Node root;
	
	public Node (Integer value){
		this.value = value;
		this.root = null;
		this.left = null;
		this.right = null;
	}
	
	public Node (Integer value, Node root){
		this.value = value;
		this.root = root;
		this.left = null;
		this.right = null;
	}
	
	public Node(Integer value, Node left, Node right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

}
