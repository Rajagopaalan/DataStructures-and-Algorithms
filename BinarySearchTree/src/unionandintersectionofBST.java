import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class unionandintersectionofBST {

	public unionandintersectionofBST() {
		//Efficient implementation with complexity O(mn)
		// TODO Auto-generated constructor stub
	}
	static HashMap<Integer,Bstlink> h1 = new HashMap<Integer,Bstlink>();
	static HashMap<Integer,Bstlink> list1 = new HashMap<Integer,Bstlink>();
	static LinkedList<Bstlink> resultintersection= new LinkedList<Bstlink>() ;
	static LinkedList<Bstlink> resultunion= new LinkedList<Bstlink>() ;
	
	public static void Union(Bstlink b ){
		if(b==null ){return; }
	    Union(b.left);
	    if(h1.get(b.data)==null){
	    h1.put(b.data, b);}
	    else{resultintersection.add(b);}
	    Union(b.right);
	    
		
		
	} 

	

	    
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	 Bstlink bst = new Bstlink(7);
		bst.left = new Bstlink(6);
		 bst.left.left =new Bstlink(3) ;
	 bst.right = new Bstlink(9) ;
	bst.left.left.left = new Bstlink(2);
	 bst.left.left.right = new Bstlink(4);
		 bst.right.left  =new Bstlink(8);
	// bst.right.right  =new Bstlink(10);
	 
	 Bstlink bst1 = new Bstlink(6);
	 bst1.left =new Bstlink(4) ;
 bst1.right = new Bstlink(9) ;
bst1.left.left = new Bstlink(2);
 bst1.left.right = new Bstlink(5);
//	 bst1.right.left  =new Bstlink(8);
 bst1.right.right  =new Bstlink(15);
 bst1.right.right.right  =new Bstlink(18);*/
		
		Bstlink bst = new Bstlink(7);
		bst.left = new Bstlink(6);
		 bst.left.left =new Bstlink(3) ;
	 bst.right = new Bstlink(9) ;
	bst.left.left.left = new Bstlink(2);
	 bst.left.left.right = new Bstlink(4);
		 bst.right.left  =new Bstlink(8);
	// bst.right.right  =new Bstlink(10);
	 
	 Bstlink bst1 = new Bstlink(6);
	 bst1.left =new Bstlink(4) ;
 bst1.right = new Bstlink(9) ;
bst1.left.left = new Bstlink(2);
 bst1.left.right = new Bstlink(5);
//	 bst1.right.left  =new Bstlink(8);
 bst1.right.right  =new Bstlink(15);
 bst1.right.right.right  =new Bstlink(18);
	 
 Union(bst);
 Union(bst1);
 System.out.println("union : ");
 System.out.println(h1.keySet());
 System.out.println();
 System.out.println("INtersection : ");
 Iterator itr = resultintersection.iterator();

 while(itr.hasNext()){
		Bstlink x = (Bstlink) itr.next();
		System.out.print(" "+x.data);}
/*Intersection(bst1);
Iterator itr = resultintersection.iterator();

while(itr.hasNext()){
	Bstlink x = (Bstlink) itr.next();
	System.out.print(" "+x.data);}

*/
	}

}
