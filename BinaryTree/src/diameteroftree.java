/*works well , but complexity O(n^2)*/
public class diameteroftree {   
	int finalheight = 0;
	public int finddiameter(TreeNode n){
		
	if(n==null){return 1;}
	int lheight= finddiameter(n.left) ;
	int rheight = finddiameter(n.right) ;
	if(lheight  > rheight){return lheight+1 ;}
	else{return rheight+1 ;}
				
	}
	public int totaldiameter(TreeNode tn){
		
		if(tn==null){return 1;}
		int lheight = finddiameter(tn.left) ;
		int rheight  = finddiameter(tn.right) ;

		int totalheight = lheight + rheight -1;
		if(totalheight > finalheight){finalheight=totalheight ;}
		
		int sublheight = totaldiameter(tn.left) ;
		if(sublheight > finalheight){finalheight=sublheight ;}
		int subrheight = totaldiameter(tn.right) ;
		if(subrheight > finalheight){finalheight=subrheight ;}
		return finalheight;
		
	}
	
	public static  void main(String args[]){
		
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
	
		
		/*	TreeNode tn = new TreeNode(1);
		  tn.left=new TreeNode(2);
		    tn.right = new TreeNode(3);
		 //   tn.right.right = new TreeNode(30);
		    tn.left.left = new TreeNode(4) ;
		    tn.left.right = new TreeNode(5) ;
		    tn.left.left.left = new TreeNode(60);
		    tn.left.left.right = new TreeNode(51) ;
		    tn.left.left.right.left = new TreeNode(52) ;
		    tn.left.left.right.left.left = new TreeNode(514) ;
		    tn.left.left.right.left.left = new TreeNode(5141) ;
		    tn.left.right=new TreeNode(22);  /* Diameter thrugh subtrees*/
		
/*		TreeNode tn = new TreeNode(1);
		  tn.left=new TreeNode(2);
		  tn.right=new TreeNode(2);
		  tn.left.left=new TreeNode(2);
		 // tn.left.left=new TreeNode(2);
		  tn.left.right=new TreeNode(2);
		  tn.left.right.right=new TreeNode(2);
		  tn.left.right.left=new TreeNode(2);
			
		  tn.right.right=new TreeNode(2);
		  tn.right.right.right=new TreeNode(2);
		  tn.right.right.right.right=new TreeNode(2);
		  tn.right.right.right.left =  new TreeNode(2);
		//  tn.right.right.right.left.left =  new TreeNode(2);
		//  tn.right.right.right.left.right =  new TreeNode(2);
		//    tn.left.right.right=new TreeNode(2);
		 //   tn.left.right.right.left = new TreeNode(290);
		//    tn.left.right.right.right=new TreeNode(20);
		  //  tn.left.right.right.right.right=new TreeNode(25);*/
		diameteroftree dt = new diameteroftree();
	//	int lheight =  dt.finddiameter(tn.left) ;
	//	int rheight =  dt.finddiameter(tn.right) ;

	//	int totalheight = lheight + rheight -1;
	//	int lheight =  dt.totaldiameter(tn) ;
			int finheight =  dt.totaldiameter(tn) ;

			//int totalheight = lheight + rheight -1;
		System.out.println("ji"+finheight);
		
	}
}
