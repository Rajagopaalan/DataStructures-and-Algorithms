
public class dummytree {
	public int finddiameter(TreeNode n){
		
		if(n==null){return 1;}
		int lheight= finddiameter(n.left) ;
		int rheight = finddiameter(n.right) ;
		if(lheight  > rheight){return lheight+1 ;}
		else{return rheight+1 ;}
					
		}
		
		public void main(String args[]){
			
			TreeNode tn = new TreeNode(1);
		    tn.left=new TreeNode(2);
		    tn.right = new TreeNode(3);
		    tn.left.left = new TreeNode(4) ;
		    tn.left.right = new TreeNode(5) ;
		    tn.left.left.left = new TreeNode(60);
		    tn.left.left.right = new TreeNode(61);
		    tn.left.left.right.left = new TreeNode(62);
		    tn.right.left = new TreeNode(6) ; 
		    tn.right.right = new TreeNode(7) ;
		    tn.right.right.right = new TreeNode(9) ;
		    tn.right.right.left = new TreeNode(10) ;
		    tn.right.right.right.left = new TreeNode(11) ;
		    tn.right.right.right.right = new TreeNode(12) ;
					
			dummytree dt = new dummytree();
			int lheight =  dt.finddiameter(tn.left) ;
			int rheight =  dt.finddiameter(tn.right) ;

			int totalheight = lheight + rheight +1;
			System.out.println("ji"+totalheight);
			
		}
}
