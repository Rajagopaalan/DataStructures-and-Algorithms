import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
	
	TreeNode left;
	TreeNode right;
	int data;
	TreeNode(int d){
		data = d;
		
	}
	
	
	public void printlevelorder(TreeNode t){
		
		TreeNode root = t;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(t);
		while(root!=null){
			  root= q.peek();
			
						if(q.isEmpty()){break;}
						  System.out.print(" "+root.data);
						if(root.left!=null){q.add(root.left);}
						if(root.right!=null){q.add(root.right);}
						
						
		 q.poll();
		   
		   
		   
			
			
		}
		
	
	}
}


public class levelordertraversal {
	
	
	
	
	public static void main(String args[]){
		 
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
	    tn.printlevelorder(tn);
		
		
	}

}
