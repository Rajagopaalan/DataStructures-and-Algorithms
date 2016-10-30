/**
 * 
 */

/**
 * @author Rajagopaalan
 *
 */
public class checkBStBtreeoptimalsolution {

	/**
	 * 
	 */
	public checkBStBtreeoptimalsolution() {
		// TODO Auto-generated constructor stub
	}
public static boolean ischeckBSt(Bstlink cbt,int min,int max){

	if(cbt==null){return true;}
	if((cbt.data < min) ||(cbt.data >max)){return false;}
	
	return(ischeckBSt(cbt.left,min,(cbt.data)-1)) && ischeckBSt(cbt.right,cbt.data+1,max) ;
	//return false;
	
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 checkBStBtreeoptimalsolution  cbstopt = new  checkBStBtreeoptimalsolution();
			
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
		
	  boolean ch =  ischeckBSt(bst,Integer.MIN_VALUE,Integer.MAX_VALUE);
	  System.out.println(ch);
	}

}
