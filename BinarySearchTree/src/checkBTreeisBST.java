public class checkBTreeisBST {  //Wrong solution

	public checkBTreeisBST() {
		// TODO Auto-generated constructor stub
	}

	public  boolean  check(Bstlink b){
		if(b==null){return true;}
		
	//	if(check(b.left) && check(b.right)){System.out.println("here:true");return true;}
	// if(b.data > b.left.data && b.data < b.right.data){System.out.println("true");return true;}
	
	//	if((b.left!=null && b.data < b.left.data) || (b.right!=null && b.data > b.right.data)){System.out.println("flase");return false;}
		 if(b.left!=null && b.data < b.left.data){return false;}
		if(b.right!=null && b.data > b.right.data){return false;}
	
		if(!check(b.left) || !check(b.right)){//System.out.println("here:true");
			return false;
			
		}
		
			
			
			else{return true;}
		//else{return false;}
      
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bstlink bst = new Bstlink(6);
		bst.left = new Bstlink(2);
		bst.right = new Bstlink(8);
		bst.left.left = new Bstlink(1);
		bst.left.right = new Bstlink(9);
		/* Bstlink bst = new Bstlink(8);
		 bst.left =new Bstlink(4) ;
		 bst.left.left =new Bstlink(2) ;
		 bst.left.right =new Bstlink(60) ;
		 bst.left.right.right =new Bstlink(7) ;
		 bst.left.right.left =new Bstlink(5) ;
		 bst.left.left.right =new Bstlink(3) ;
		 bst.left.left.left =new Bstlink(1) ;
	   bst.right = new Bstlink(11) ;
	   bst.right.left = new Bstlink(10) ;
	   bst.right.right = new Bstlink(12) ;
	   bst.right.right.right = new Bstlink(14) ;
	   bst.right.right.right.left = new Bstlink(1300) ;
	   bst.right.right.right.right = new Bstlink(16) ;*/
	   checkBTreeisBST cbt = new checkBTreeisBST();
		boolean  ch = cbt.check(bst);
		System.out.println("res:"+ch);

	}

}
