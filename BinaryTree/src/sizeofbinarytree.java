
public class sizeofbinarytree 
	{
	int i=0;
	
	public void findsize(TreeNode t){
		 TreeNode root =t;
		 if(root==null){
			// i--; 
			 return ;}
		 i++;
				findsize(t.left);
			
			findsize(t.right);
			

			
	
			
					
		
	}
	public void print(){System.out.println(i);}

	
public static void main(String[] args) {
	
	TreeNode tn = new TreeNode(1);
    tn.left=new TreeNode(2);
    tn.right = new TreeNode(3);
    tn.right.right = new TreeNode(39);
  tn.right.left = new TreeNode(4);
    tn.right.right.left= new TreeNode(5);
    tn.left.left = new TreeNode(51);
  /*  tn.right.left.left = new TreeNode(40);
    tn.right.left.right = new TreeNode(41);*/
    sizeofbinarytree sizeofbinarytree = new sizeofbinarytree ();
    sizeofbinarytree.findsize(tn);
    sizeofbinarytree.print();
	
}

}
