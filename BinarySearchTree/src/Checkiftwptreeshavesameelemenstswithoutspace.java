
public class Checkiftwptreeshavesameelemenstswithoutspace {

	public Checkiftwptreeshavesameelemenstswithoutspace() {
		// TODO Auto-generated constructor stub
	}
	//Convert tree to DLL through inorder traversal and check if elements in likedlist are same
	public static Bstlink converttoDLL(Bstlink bst){
	//	Bstlink prev = bst;
		
		if(bst==null){return null ;}
		//while(bst.right!=null){bst = bst.right ;}
		if(bst.left!=null){
			Bstlink prev = converttoDLL(bst.left); 
			while(prev.right!=null){prev = prev.right ;}
			bst.left=prev ;
			prev.right = bst ;
		
		}
		
		if(bst.right!=null){
			Bstlink prev1 = converttoDLL(bst.right); 
			while(prev1.left!=null){prev1 = prev1.left;}
			bst.right=prev1 ;
			prev1.left = bst ;
		
		}
		
		return bst;
		
	}
	public static void print(Bstlink bst){
		
	while(bst.left!=null){bst = bst.left;}
	while(bst!=null){System.out.print(" "+bst.data);bst=bst.right;}
		
	}
	
	static boolean check(Bstlink bs , Bstlink bs1){
		while(bs.left!=null){bs = bs.left;}
		while(bs1.left!=null){bs1 = bs1.left;}
		while(bs!=null && bs1!=null){
			System.out.println(bs.data +" " +bs1.data);
			if(bs.data != bs1.data){return false;}
			bs =bs.right ;
			bs1 =  bs1.right ;
		}
	
		if(bs==null && bs1==null){return true;}
	//	if(bst==null || bst1==null){return false;}
		return false;
		
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
	   bst.right.right = new Bstlink(12) ;
	   bst.right.right.right = new Bstlink(14) ;
	   bst.right.right.right.left = new Bstlink(13) ;
	   bst.right.right.right.right = new Bstlink(16) ;
	   
	   Bstlink bst1 = new Bstlink(12);
		 bst1.left =new Bstlink(6) ;
		 bst1.left.left =new Bstlink(4) ;
		 bst1.left.left.left =new Bstlink(3) ;
		 bst1.left.left.left.left =new Bstlink(2) ;
		 bst1.left.left.left.left.left =new Bstlink(1) ;
		 
		 bst1.left.left.right =new Bstlink(5) ;
		 bst1.left.right =new Bstlink(8) ;
		 bst1.left.right.left =new Bstlink(7) ;
		 bst1.left.right.right =new Bstlink(11) ;
		 bst1.left.right.right.left =new Bstlink(10) ;
		// bst1.right = new Bstlink(14) ;
		// bst1.right.left = new Bstlink(13) ;
	//	 bst1.right.right = new Bstlink(16) ;
		 
		 
		 
	  Bstlink b= converttoDLL(bst);
		 
	  Bstlink b1= converttoDLL(bst1);
		// converttoDLL(bst);
	   print(b);
		 System.out.println(" ");
	//   converttoDLL(bst1);
	//   print(b1);
	   System.out.println(" ");
 boolean chk = check(b,b1);
 System.out.println(" ");
 System.out.println(chk);

	}

}
