import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class heightlevelorder {
	
	
	public void compute(TreeNode n){     /*  solution works well but O(n^2) complexity                     */
		TreeNode root = n;
		Queue<TreeNode> q = new LinkedList<TreeNode>() ;
		HashMap<Integer, Integer> hmap = new HashMap<Integer,Integer>();
		
		q.add(n)  ;
		int count=0; 
		int child=0;
		int countprevious=1;
		int level =0;
		while(!q.isEmpty()){
			count=0;
			child=0;
			while(count<countprevious){
			root = q.peek();
	
			if(root.left!=null){q.add(root.left);child++ ;}
			
			if(root.right !=null){q.add(root.right);child++ ;}
	
			
			q.poll();
		count++;
			}
			countprevious=child ;
			level++;
			
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
	  heightlevelorder lo = new heightlevelorder() ;	  lo.compute(tn);
		
	}

}
