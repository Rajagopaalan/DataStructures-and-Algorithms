import java.util.LinkedList;

import java.util.Queue;

public class heightlevelorderoptimalsolution {
	
public void compute(TreeNode tn){
	
	
	Queue<TreeNode> q = new LinkedList<TreeNode>();
	
	q.add(tn);
	TreeNode root = tn;
	q.add(null) ;
	int level=0;
	TreeNode prev=null ;
	while(!q.isEmpty()){                       //optimal solution O(n)
		root = q.peek() ;
		if(root==null &&  prev==null  && root==prev){break;}
		if(root==null){level++ ;//q.poll() ;
	q.add(null);
	//	if(!q.isEmpty()){q.add(null);}
		}
		else{
		 if(root.left!=null)
			 q.add(root.left);
		 if(root.right!=null)
			 q.add(root.right);
		}
		
	
prev =q.poll() ;
	}
	
	System.out.println(level);
}
	

	public static void main(String[] args) {
		
		TreeNode tn = new TreeNode(1);
	    tn.left=new TreeNode(2);
	    tn.left.left=new TreeNode(4);
	    tn.left.left.right=new TreeNode(40);
	    tn.left.left.left=new TreeNode(405);
	    tn.left.right= new TreeNode(5) ;
	 
	    tn.right = new TreeNode(3);
	    tn.right.right = new TreeNode(7);
	  tn.right.left = new TreeNode(6);
	  tn.right.left.left = new TreeNode(605);

	  tn.right.left.right = new TreeNode(60);
	  tn.right.left.right.right = new TreeNode(603);
	  tn.right.left.right.right.right = new TreeNode(6033);
	 tn.right.left.right.right.right.left = new TreeNode(6033);
	 tn.right.left.right.right.right.right = new TreeNode(6053);
	  tn.right.left.right.right.right.right.left = new TreeNode(6053);
	  tn.right.left.right.right.right.right.right = new TreeNode(6053);
	  
	  heightlevelorderoptimalsolution  ho = new heightlevelorderoptimalsolution ();
		ho.compute(tn);
	}
}
