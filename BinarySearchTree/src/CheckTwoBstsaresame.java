import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CheckTwoBstsaresame {

	static HashMap<Integer,Integer> hset = new HashMap<Integer,Integer>();
	static int check =1;
	public  static void  CheckTwoBsts(Bstlink bst) {
		// TODO Auto-generated constructor stub
		if(bst == null ){ return ;}
		CheckTwoBsts(bst.left);
		
	    hset.put(bst.data , -1) ;	    
		
		CheckTwoBsts(bst.right);
		
		
		
	}

	public  static void Check(Bstlink bst1, Bstlink bst2) {
		// TODO Auto-generated constructor stub
		if(bst2 == null ){ return ;}
		Check(bst1,bst2.left);
		
	//   if(hset.contains(bst2.data)==false){check=0;}    
		if(hset.containsKey(bst2.data) == false){check =0;}
		else {hset.put(bst2.data, 1);}
	   
	 Check(bst1,bst2.right);
	
		
		
		
	}
	public  static int Checks(Bstlink bst1, Bstlink bst2) {
		// TODO Auto-generated constructor stub
		if(bst2 == null ){ return 0;}
		Checks(bst1,bst2.left);
		
	   if(hset.containsKey(bst2.data)){ return 1;}    
	   
	return  Checks(bst1,bst2.right);
	
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Bstlink bst = new Bstlink(4);
		
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
		 bst1.right = new Bstlink(14) ;
		 bst1.right.left = new Bstlink(13) ;
		 bst1.right.right = new Bstlink(16) ;
		 
		 CheckTwoBsts(bst);
	  Check(bst,bst1);
	  
	  int x =  Checks(bst,bst1);
	  if(hset.containsValue(-1)){check=0;}
		
		if(check ==0 ){System.out.println("no");}
		else{System.out.println("yes");}
	//	System.out.println(x);
	//	System.out.println(hset);
	  
		
		System.out.println(check);
			 
		 
	}

}
