
public class heightoftreeusingrecursion {
	
	public int calc(TreeNode n){
		TreeNode root = n;
		if(root == null){
			return 0 ;
		}
		int lheight = calc(n.left);
		int rheight = calc(n.right);
		if(lheight > rheight){return lheight+1;}
		else{return rheight+1; }
		//return 0;
		
		
	}
public static void main(String[] args) {
	
	TreeNode tn = new TreeNode(1);
    tn.left=new TreeNode(2);
    tn.left.left=new TreeNode(4);
    tn.left.left.right=new TreeNode(40);
    tn.left.right= new TreeNode(5) ;
    
    tn.right = new TreeNode(3);
    tn.right.right = new TreeNode(7);
  tn.right.left = new TreeNode(6);
  tn.right.left.right = new TreeNode(60);
  tn.right.left.right.right = new TreeNode(603);


  heightoftreeusingrecursion n =new heightoftreeusingrecursion();
 int height = n.calc(tn);
 System.out.println(height);
}
	
}
