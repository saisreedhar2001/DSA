public class bst{

    public static void main(String [] args){
       bstnode root=new bstnode(1);
		
		root.left=new bstnode(2);
		root.right=new bstnode(3);
		
		root.left.left=new bstnode(4);
		root.left.right=new bstnode(5);
		
		root.right.left=new bstnode(6);
		root.right.right=new bstnode(7);
System.out.println("inorder");
        inorder(root);
        System.out.println();
System.out.println("postorder");
        postorder(root);
        System.out.println();
System.out.println("preorder");
        preorder(root);
        System.out.println();

    }
    public static void inorder(bstnode r){
        if (r ==null){
            return;
        }
        inorder(r.left);
        System.out.println(r.data+" ");
        inorder(r.right);
    }
    public static void postorder(bstnode r){
        if (r ==null){
            return;
        }
        postorder(r.left);
        postorder(r.right);
        System.out.println(r.data+" ");
        
    }
     public static void preorder(bstnode r){
        if (r ==null){
            return;
        }
        
        System.out.println(r.data+" ");
        preorder(r.left);
        preorder(r.right);
        
    }
}