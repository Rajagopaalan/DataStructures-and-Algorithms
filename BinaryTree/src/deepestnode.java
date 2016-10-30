import java.util.LinkedList;

import java.util.Queue;
import java.util.Stack;

public class deepestnode {
	
	public void printlevelorder(TreeNode t){
		Queue<TreeNode> q = new LinkedList<TreeNode>();
	//	Stack<TreeNode> S= new Stack<TreeNode>();
		TreeNode root = t;
		TreeNode end =null;
		q.add(t);
		int count=0;
		while(!q.isEmpty()){
			root = q.peek() ;
			
			
			
			
			if(root.left!=null)
				q.add(root.left) ;
			if(root.right!=null)
				q.add(root.right);
			//Nodes m = q.poll() ;
			//S.add(q.poll()) ;
		//	if(root.left!= null && root.right!= null){count++;}
			if((root.left!= null &&  root.right== null) || (root.left== null &&  root.right!= null)) {count++;}
			end=q.poll();
		//	System.out.println("gi");
			
		}
		System.out.println(count);
	
	}
	  
	public static void main(String[] args) {
		
	/*	TreeNode tn = new TreeNode(1);
	    tn.left=new TreeNode(2);
	    tn.right= new TreeNode(3) ;*/
	   
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
	 tn.right.left.right.right.right.right = new TreeNode(605389);
	  tn.right.left.right.right.right.right.left = new TreeNode(6053);
	 tn.right.left.right.right.right.right.right = new TreeNode(60539);
	 tn.right.left.right.right.right.right.right.right = new TreeNode(6999999);
	  deepestnode  dn = new deepestnode();
	  dn.printlevelorder(tn);
	}
	
	
}
