
public class checkBSTBinarytreeinorder {

	public checkBSTBinarytreeinorder() {
		// TODO Auto-generated constructor stub
	}
	static Bstlink prev=null;
	public static boolean  checkBst(Bstlink b){
		

	if(b!=null){
		
		if(!checkBst(b.left)){
		
			return false ;}
		
			if(prev!=null && prev.data>=b.data){	return false ;}
			if(prev!=null){
		//	System.out.println(prev.data+"-"+b.data);
				}
	//	prev = new Bstlink(b.data);
			prev= b;
		//	System.out.println("here"+prev.data+"-");
		
		return checkBst(b.right) ;
	}
	return true;
		
	
	}

	
	public static void main(String args[]){
		
		
		/*Bstlink bst = new Bstlink(5);
		 bst.left =new Bstlink(2) ;
		 bst.left.left =new Bstlink(1) ;
		 bst.left.right =new Bstlink(3) ;
		 
		 bst.right =new Bstlink(8) ;
		 bst.right.left =new Bstlink(6) ;
		 bst.right.right =new Bstlink(9) ;
		 bst.right.right.right =new Bstlink(11) ;*/
		 Bstlink bst = new Bstlink(8);
		 bst.left =new Bstlink(4) ;
		 bst.left.left =new Bstlink(2) ;
		 bst.left.right =new Bstlink(6) ;
		 bst.left.right.right =new Bstlink(7) ;
		 bst.left.right.left =new Bstlink(5) ;
		 bst.left.left.right =new Bstlink(3) ;
		 bst.left.left.left =new Bstlink(1) ;
	   bst.right = new Bstlink(11) ;
	   bst.right.left = new Bstlink(10) ;
	   bst.right.right = new Bstlink(12) ;
	   bst.right.right.right = new Bstlink(14) ;
	   bst.right.right.right.left = new Bstlink(13) ;
	   bst.right.right.right.right = new Bstlink(16) ;
		
		
		boolean ch=checkBst(bst);
	System.out.println(ch);
	}
}
