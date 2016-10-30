
public class dummyBST {

	public dummyBST() {
		// TODO Auto-generated constructor stub
	}
	public static Bstlink gettree(Bstlink node){
		
		if(node==null){return node ;}
		node.left = gettree(node.left);
		System.out.println(node.data) ;
		node.right = gettree(node.right);
		return node ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bstlink bst = new Bstlink(7);
		 bst.left =new Bstlink(4) ;
	   bst.right = new Bstlink(10) ;
		bst.left.left = new Bstlink(2);
	   bst.left.right = new Bstlink(5);
		 bst.right.left  =new Bstlink(8);
		 bst.right.left.right  =new Bstlink(9);
		 bst.right.right  =new Bstlink(11);
		 bst.right.right.right  =new Bstlink(101);
		 bst.right.right.right.right  =new Bstlink(107);
		 bst.right.right.right.right.left  =new Bstlink(103);
		 bst.right.right.right.right.left.left  =new Bstlink(102);
		 bst.right.right.right.right.left.right=new Bstlink(105);
		 bst.right.right.right.right.left.right.left=new Bstlink(104);
		 Bstlink bsttree = gettree(bst);
		 
	}

}
