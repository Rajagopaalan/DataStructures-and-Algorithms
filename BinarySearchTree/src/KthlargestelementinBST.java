
public class KthlargestelementinBST {

	public KthlargestelementinBST() {
		// TODO Auto-generated constructor stub
	}
	static int curr =0 ; //do not pass curr as parametr to every iteration, as it will cause problem0oikm8ju777777777777777777unn8
public static Bstlink kthlargest(Bstlink bst,int k){
	// this is actually Kth smaleest element ;
	if(bst==null){return null;}
	
	Bstlink btleft = kthlargest(bst.left,k);

	if(btleft !=null){return btleft;}
//	System.out.println("here"+curr);
	curr=curr+1;
	if(curr==k){	;return bst;}
	//System.out.println("here"+curr+bst.data);
	return kthlargest(bst.right,k);

	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bstlink bst = new Bstlink(7);
		 bst.left =new Bstlink(4) ;
	    bst.right = new Bstlink(10) ;
		bst.left.left = new Bstlink(2);
	    bst.left.right = new Bstlink(5);
		 bst.right.left  =new Bstlink(8);
	 bst.right.right  =new Bstlink(11);
		 bst.right.right.right  =new Bstlink(101);
		 Bstlink kthlargest = kthlargest(bst,8);
		 System.out.println("k"+kthlargest.data);

	}

}
