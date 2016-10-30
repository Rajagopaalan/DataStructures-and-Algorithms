class Bstlink{
	int data;
	Bstlink left;
	Bstlink right;
	Bstlink nextsibling ;
	Bstlink(int x){
		data=x;
		left=null;
		right=null;
	
	}
	
	
}


public class BinarySearchTrees {
	static int founddata;
	public static Bstlink findnode(Bstlink a,int x){
		if(a==null){return null;}
		
		if(a.data > x){
		return findnode(a.left,x);}
		else if(a.data < x){
		return findnode(a.right,x);}
		
		return a;
	}
	
 public static void main(String args[]){
	 
	 Bstlink bst = new Bstlink(7);
	 bst.left =new Bstlink(4) ;
	 bst.right = new Bstlink(9) ;
	 bst.left.left = new Bstlink(2);
	 bst.left.right = new Bstlink(5);
	 bst.right.left  =new Bstlink(8);
	 bst.right.right  =new Bstlink(10);
	 
	Bstlink bt =  findnode(bst,10);
	if(bt!=null)
	System.out.println(bt.data);
	else{System.out.println("Not possible");}
 }
 
}
