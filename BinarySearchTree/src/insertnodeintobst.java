

public class insertnodeintobst {
	
	public static Bstlink insert(Bstlink t,int data){
	if(t==null){t=new Bstlink(data);//System.out.println(t.data);r
	return t;
	
	
	
}
		
	if(t.data < data){ t.right=insert( t.right,data ) ;}
	if(t.data > data){t.left=insert( t.left,data ) ;}
	return t;
	}
	
	public static void print(Bstlink t){
		if(t==null){return;}
		print(t.left) ;
	System.out.print(" "+t.data);
	print(t.right) ;
		
		
	}
	public static void main(String[] args) {
		Bstlink bst = new Bstlink(7);
		 bst.left =new Bstlink(4) ;
	    bst.right = new Bstlink(9) ;
		bst.left.left = new Bstlink(2);
	 //   bst.left.right = new Bstlink(5);
	//	 bst.right.left  =new Bstlink(8);
	//	 bst.right.right  =new Bstlink(10);
		 print(bst);
		 insert(bst, 6);
		 System.out.println("" );
		 print(bst);
			//System.out.print(" "+	bst.left.left.left.data);
	}
	
}
