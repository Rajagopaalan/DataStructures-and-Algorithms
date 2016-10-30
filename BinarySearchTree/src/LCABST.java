
public class LCABST {

	public LCABST() {
		// TODO Auto-generated constructor stub
	}

	 public static void returnlca(Bstlink a ,int x,int y){
		
		 if((x>a.data && y<a.data) || (x<a.data && y>a.data)){System.out.println(a.data);
		 return ;}
		// if((y>a.data && x<a.data) || (y<a.data && x>a.data)){//System.out.println(a.data);
		 //return ;}
		 if(a.data ==x || a.data==y){System.out.println(a.data);}
		  if(a.data<x && a.data <y){ // System.out.println(a.data);
		 returnlca(a.right , x,y) ; }
		 if(a.data>x && a.data >y){ returnlca(a.left , x,y) ; }
		
		
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
	   
    returnlca(bst,7,5);
    // System.out.println(as.data);
     
     
     
     
	}

}
