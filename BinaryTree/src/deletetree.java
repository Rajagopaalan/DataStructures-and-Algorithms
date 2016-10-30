import java.util.LinkedList;
import java.util.Queue;

public class deletetree { 
	
	public void delete(TreeNode tn){
		
		TreeNode root=tn ;
		
		if(root==null){return ;}
		delete(tn.left) ;
		delete(tn.right) ;
		System.out.println("deleteing "+ tn.data);
		int x=tn.data ;
	tn = null ;


	  // this.delete(tn);
	if(tn==null){System.out.println("deleted"+x+"tn"+tn);
		}
	//System.out.println("deleteing "+ tn.data);
		
	}
	public void print(TreeNode tn){
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		TreeNode root = tn ;
		q.add(root);
		while(!q.isEmpty()){
			if(tn==null){System.out.println("deleted tree");break;}
			root = q.peek() ;
			if(root.left!=null)
				q.add(root.left) ;
			if(root.right!=null)
				q.add(root.right) ;
			
			System.out.print(" "+q.poll().data);
					
			
		}
		
		
	}

	public static void main(String[] args) {
		
		TreeNode tn = new TreeNode(1);
	    tn.left=new TreeNode(2);
	    tn.left.left=new TreeNode(4);
	    tn.left.right= new TreeNode(5) ;
	    
	    tn.right = new TreeNode(3);
	    tn.right.right = new TreeNode(7);
	  tn.right.left = new TreeNode(6);
		
	  deletetree  dt = new deletetree ();
	  dt.print(tn); ;
  dt.delete(tn);
  System.out.println("after delete ");
	  dt.print(tn); 
	}
}
