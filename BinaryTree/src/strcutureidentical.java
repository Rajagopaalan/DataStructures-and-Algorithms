import java.util.*;

public class strcutureidentical {
	
	public boolean check(TreeNode tn1,TreeNode tn2){
		if(tn1==null && tn2==null)
		return	true;
		if(tn1!=null && tn2!=null){return(tn1.data==tn2.data) && check(tn1.left,tn2.left) && check(tn1.right ,tn2.right);}
		
		
		return false;
				
	}
	
	public static void main(String[] args) {
		TreeNode tn = new TreeNode(1);
		tn.left = new TreeNode(2);
		tn.right = new TreeNode(3) ;
		tn.left.left = new TreeNode(4) ;
		tn.left.right = new TreeNode(5) ;
		tn.right.left = new TreeNode(6) ;
		tn.right.right = new TreeNode(7) ;
		
		TreeNode tn1 = new TreeNode(1);
		tn1.left = new TreeNode(2);
		tn1.right = new TreeNode(3) ;
		tn1.left.left = new TreeNode(4) ;
		tn1.left.right = new TreeNode(5) ;
		tn1.right.left = new TreeNode(6) ;
		tn1.right.right = new TreeNode(7) ;
	//	tn1.right.right.right = new TreeNode(73) ;
		
		strcutureidentical si = new strcutureidentical();
		
boolean t = si.check(tn, tn1) ;
	if(t==true){System.out.println("identical");}
	else{System.out.println("Not");
		}
	}

}
