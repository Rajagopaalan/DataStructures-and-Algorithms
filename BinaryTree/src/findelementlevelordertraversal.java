import java.util.LinkedList;
import java.util.Queue;

public class findelementlevelordertraversal {
	int data;
	Integer found ;
	findelementlevelordertraversal(int d){data=d;}
	
	public void search(TreeNode d){
		
		Queue<TreeNode> q = new LinkedList<TreeNode>() ;
		TreeNode root = d;
		q.add(root) ;
		
		while(!q.isEmpty()){
			  root= q.peek();
			  if(root.data==data){found=root.data;}
			  
			if(root.left!=null){q.add(root.left);}
			if(root.right!=null){q.add(root.right);}
			q.poll();
			
		}
		
		if(found!=null){System.out.println(found);}
		else{System.out.println("not found");}
		
		
	}
	

	
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
	    
	    findelementlevelordertraversal f = new findelementlevelordertraversal(6290);
	    f.search(tn);
	    
		
	}
}
