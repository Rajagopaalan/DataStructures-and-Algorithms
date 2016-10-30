import java.util.LinkedList;
import java.util.Queue;

public class insertelement {
    int data;
    TreeNode foundinsertpos;
    
	insertelement(int t){
		data =t;
		
	}
	public void insert(TreeNode tn){
		TreeNode root = tn;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty())
				{
			
			root = q.peek();
			
			if(root.left!=null){q.add(root.left);}
			else{root.left=new TreeNode(data);
		//	System.out.println("inserted");
			break;}
			if(root.right!=null){q.add(root.right);}
			else{root.right=new TreeNode(data);
		//	System.out.println("inserted");
			break;
			
			}
			
		q.poll();
			
		}
			
		
	}
	
	public void print(TreeNode t){
		
	 TreeNode root = t;
	 Queue<TreeNode>  q = new LinkedList<TreeNode>();
	 q.add(root);
		while(!q.isEmpty()){
		 root=q.peek();
		 if(root.left!=null){q.add(root.left);}
		 if(root.right!=null){q.add(root.right);}
		 TreeNode r= q.poll();
		 System.out.print("  "+ r.data);
		
	 }

	 
	}



public static void main(String args[]){
	
	TreeNode tn = new TreeNode(1);
    tn.left=new TreeNode(2);
    tn.right = new TreeNode(3);
    tn.left.left = new TreeNode(4);
    tn.left.right= new TreeNode(5);
    tn.left.left.left = new TreeNode(40);
    tn.left.left.right = new TreeNode(41);
    
    insertelement ie= new insertelement(50);
   ie.print(tn);
   ie.insert(tn);

    System.out.println(" ");
    ie.print(tn);
    
    
}
}
