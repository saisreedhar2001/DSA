class Node{
	int key;
	Node left;
	Node right;
	public Node(int item){
		  key =item;
		
		left = right = null;

	}
}
public class binaryttree{
	Node root;

	public void traversetree(Node node){
			if(node!=null){
				traversetree(node.left);
				System.out.println(" " + node.key);
				traversetree(node.right);
			}
		}


	public static void main(String [] args){
          

          binaryttree tree = new binaryttree();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right=new Node(3);
		tree.root.right.left = new Node(5);

		System.out.println("\nBinary Tree: ");
		tree.traversetree(tree.root);




	}
	

}

