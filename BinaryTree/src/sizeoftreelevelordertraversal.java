import java.util.LinkedList;
import java.util.Queue;

public class sizeoftreelevelordertraversal {
	
	public void count(TreeNode tn){
		int i=0 ;
		Queue<TreeNode> q= new LinkedList<TreeNode>() ;
		TreeNode root =tn;
		q.add(root) ;
		
		while(!q.isEmpty()){
			 root = q.peek() ;
			 
			 if(root.left!=null)
			q.add(root.left);
			 if(root.right!=null)
			q.add(root.right);
			q.poll();
			i++;
			
		}
		System.out.println(i);
		
		
	}
	

	public static void main(String[] args) {
		
		TreeNode tn = new TreeNode(1);
	    tn.left=new TreeNode(2);
	    tn.left.left=new TreeNode(3);
	    tn.left.left.left = new TreeNode(4) ;
	    
	    tn.right = new TreeNode(5);
	    tn.right.right = new TreeNode(6);
	  tn.right.left = new TreeNode(7);
	    tn.right.right.left= new TreeNode(8);
	//    tn.left.left = new TreeNode(51);
	    tn.left.left.right = new TreeNode(9);
	  
	    tn.left.left.right.left = new TreeNode(10);
	  //  tn.left.left.right.left.right =new TreeNode(3);
	    tn.left.left.right.left.right = new TreeNode(11);
	    tn.left.left.right.left.right.right =new TreeNode(3);
	    sizeoftreelevelordertraversal s = new  sizeoftreelevelordertraversal() ;
	    s.count(tn);
	    
	    
	}
}
