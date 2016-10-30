

public class Findelementintree {
	int d;
	Integer found=null;
	Findelementintree(int data){
		d=data;
	}
	public void search(TreeNode tn){
		
		TreeNode root = tn ;
		if(root==null){return;}
		if(tn.data == d){found=d;}
		search(tn.left);
		search(tn.right);
		
	}
	public void print(){
		if(found!=null)
		System.out.println(found);
		else
			System.out.println("not found");
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
	    Findelementintree  f  = new Findelementintree (123434
	    		) ;
	    f.search(tn);
	    f.print();
		
		
		
	}
	

}
