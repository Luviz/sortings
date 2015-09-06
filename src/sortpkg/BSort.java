package sortpkg;

import java.util.ArrayList;

import sortpkg.btree.Node;



public class BSort {
	private Node root;
	private Node w;

	public BSort(Node root) {
		this.root = root;
	}
	public BSort(ArrayList<Integer> list){
		root = new Node(list.remove(0));
		for (Integer integer : list) {
			add(integer);
		}
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	private void add(Integer nr){
		w = root;
		//System.out.println("root: "+ root.value + " n: "+ nr);
		add(w, new Node(nr));
	}

	private void add(Node r, Node n) {
		//System.out.println("Walker: "+ r.value);
		//System.out.println( r.value+ " "+r.value.compareTo(n.value)  +" "+ n.value);
		if (r.value.compareTo(n.value) >= 0) { // Smaller Then
			if(r.left == null){
				n.root = r;
				r.left = n;
				//System.out.println("adding Left:" + n.value);
			}else{
				r = tLeft(r);
				add(r, n);
			}
		} else if (r.value.compareTo(n.value) < 0) { // Grater Then
			if(r.right == null){
				n.root = r;
				r.right = n;
				//System.out.println("adding Right: "+ n.value);
			}else{
				r = tRight(r);
				add(r, n);
			}
		}
		
	}
	
	private Node tLeft(Node n){
		//System.out.print("l");
		return n.left;
	}
	
	private Node tRight(Node n){
		//System.out.print("r");
		return n.right;
	}
	
	public ArrayList<Integer> sort(){
		ArrayList<Integer> ret = new ArrayList<>();
		while (root.left != null) {
			w = getEndLeft(root);
			//System.out.println(">"+w.value +" left:"+ w.left+" right: "+w.right + " root: " +w.root);
			if (w.root != null) {
				ret.add(removeNode(w).value);
			}
			
		}
		return ret;
	}
	
	public Node getEndLeft(Node n){
		if (n.left == null){
			return n;
		}else{
			w = getEndLeft(n.left);
		}
		return w;
	}
	
	public Node removeNode(Node n){
		Node ret = n;
		n.root.left = null;
		if (ret.right != null){
			ret.right.root = ret.root;	//???? ret.root.right
			ret.root.left = ret.right;
			
		}
		return ret;
	}
	
	
}
