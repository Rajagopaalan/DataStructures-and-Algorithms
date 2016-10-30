
public class LCAofBST {
	Bstlink lca =null; 
	public  Bstlink findLCA(Bstlink a , int x,int y){
		if(a.data==x){if(x>y){lca=find(a.left,y);if(lca!=null){return  a;}}
		if(x<y){lca=find(a.right,y);if(lca!=null){return  a;}}
		}
		else if(a.data==y){if(y>x){lca=find(a.left,x);if(lca!=null){return  a;}}
		if(y<x){lca=find(a.right,x);if(lca!=null){return  a;}}
		}
		
		else if((a.data < x) && (a.data <y)){findLCA( a.right , x,y);} 
		else if((a.data > x) && (a.data >y)){findLCA( a.left , x,y);} 
		else if((a.data > x) && (a.data <y)){
			if(a.data>x){lca=find(a.left,x);if(lca!=null){return  a;}}
			if(y<x){lca=find(a.right,x);if(lca!=null){return  a;}}
			
			lca = a;} 
		return lca;
	}
	public Bstlink find(Bstlink b,int data){
	while(b!=null){if(b.data < data){ b=b.right;}
	else if(b.data > data){b=b.left;}
	else if(b==null){return null;}
	else if(b.data==data){return b;}
		}	
return null;
	}

	public static void main(String[] args) {
		
		Bstlink bst = new Bstlink(7);
		 bst.left =new Bstlink(4) ;
	   bst.right = new Bstlink(10) ;
	   bst.right.left = new Bstlink(11) ;
	   bst.right.right = new Bstlink(12) ;
	/*	bst.left.left = new Bstlink(2);
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
		// bst.right.right.right.right.left.right.left.left=new Bstlink(100);
		 bst.right.right.right.right.left.right.right=new Bstlink(106);
		 bst.right.right.right.right.right =  new Bstlink(108);*/
		 LCAofBST lbt = new  LCAofBST();
		Bstlink z =  lbt.findLCA(bst, 11, 12) ;
		 System.out.println(z.data);
	}
	
	
}
