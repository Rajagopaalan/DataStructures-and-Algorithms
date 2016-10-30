/**
 * 
 */

/**
 * @author Rajagopaalan
 *
 */
public class checkTreeisBSTnonoptimal {

	/**
	 * 
	 */
	public checkTreeisBSTnonoptimal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static Bstlink Findmax(Bstlink b){
	
	   b=b.left ;
		while(b.right!=null){b=b.right ;}
		return b;
		
	}
	public static Bstlink Findmin(Bstlink b){
		
		   b=b.right ;
		while(b.left!=null){b=b.left ;}
		return b;
		
	}
	public static boolean checkBSt(Bstlink b){
		
		if(b==null){System.out.println("ctrue");return true;}
		else if(b.left!=null && b.data < Findmax(b).data ){System.out.println("atrue");return false ;}
		else if(b.right!=null && b.data > Findmin(b).data ){System.out.println("btrue");return false ;}

		else if(!(checkBSt(b.left)) || !(checkBSt(b.right))){System.out.println("dtrue");return false ;}
		else{
			return true;}
		
	/*	else if(b.left!=null && b.data > Findmax(b).data ){System.out.println("atrue");return true ;}
		else if(b.right!=null && b.data < Findmin(b).data ){System.out.println("btrue");return true ;}

		else if((checkBSt(b.left)) && (checkBSt(b.right))){System.out.println("dtrue");return true ;}
		else{
		return false;}*/
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
	   bst.right.right = new Bstlink(11) ;
	   bst.right.right.right = new Bstlink(14) ;
	   bst.right.right.right.left = new Bstlink(13) ;
	   bst.right.right.right.right = new Bstlink(16) ;
	   boolean ch = checkBSt(bst);
	   System.out.println(ch);
	   
	}
}
