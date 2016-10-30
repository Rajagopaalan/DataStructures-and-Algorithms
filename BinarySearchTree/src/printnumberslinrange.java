
public class printnumberslinrange {

	public printnumberslinrange() {
		// TODO Auto-generated constructor stub
	}
    public static void print(Bstlink bst , int k1 ,int k2){
    	
    	if(bst==null){return ;}
    	if(bst.data >= k1){print(bst.left , k1 , k2) ;} // print in ascending order 
    	if(k1 <= bst.data  && bst.data<= k2){System.out.println(bst.data); }
        
    	
    	if(bst.data <=k2 ){print(bst.right , k1 , k2) ; }
    	
    	/*
    	 * To print in descinding order
    	 * 
    	 * 
    	 * if(bst.data >= k1){print(bst.left , k1 , k2) ;} // print in ascending order 
    	if(k1 <= bst.data  && bst.data<= k2){System.out.println(bst.data); }
        
    	
    	if(bst.data <=k2 ){print(bst.right , k1 , k2) ; }
    	*/
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Bstlink bst = new Bstlink(6);
			bst.left = new Bstlink(4);
			 bst.left.left =new Bstlink(3) ;
		 bst.right = new Bstlink(9) ;
		bst.left.left.left = new Bstlink(2);
	//	 bst.left.left.right = new Bstlink(4);
			 bst.right.left  =new Bstlink(8);
		 bst.right.right  =new Bstlink(10);
		 print(bst,1,6);
		 

	}

}
