
public class FindMininBST {
	
	public static Bstlink returnmin(Bstlink bst){
		if(bst==null){return null;}
	else if(bst.left==null){return bst;}
	else return returnmin(bst.left);
		
		
	}
	public static Bstlink returnminiterative(Bstlink bst){
		System.out.println("here");
		while(bst.left!=null){bst=bst.left ;	}
	
		return bst;
	}
	
public static Bstlink returnmax(Bstlink bst){
	if(bst==null){return null;}
	while(bst.right!=null){bst=bst.right;	}
	return bst;
	
}
public static Bstlink returnmaxrecursion(Bstlink bst){
	if(bst==null){return null;}
	else if(bst.right==null){return bst;}
	
	else return returnmaxrecursion(bst.right);
}	
	public static void main(String[] args) {
		 Bstlink bst = new Bstlink(7);
		 bst.left =new Bstlink(4) ;
	 bst.right = new Bstlink(9) ;
	bst.left.left = new Bstlink(2);
	 bst.left.right = new Bstlink(5);
		 bst.right.left  =new Bstlink(8);
	 bst.right.right  =new Bstlink(10);
		 Bstlink blink = returnmin(bst);
		 if(blink!=null){System.out.println(blink.data);
		 
			 }
		 Bstlink blink1 = returnminiterative(bst);
		 if(blink1!=null){System.out.println(blink1.data);
		 
			 }
		 
		 Bstlink blink2 = returnmax(bst);
		 if(blink2!=null){System.out.println(blink2.data);
		 
			 }
		 Bstlink blink3 = returnmaxrecursion(bst);
		 if(blink3!=null){System.out.println(blink3.data);
		 
			 }
	}
}
