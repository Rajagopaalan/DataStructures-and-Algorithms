import java.util.Iterator;
import java.util.LinkedList;

public class UnionandIntersectionBstusinglinkedlist { // Inefficient Method assuming no duplicates 

	public UnionandIntersectionBstusinglinkedlist() {
		// TODO Auto-generated constructor stub
	}

	static LinkedList<Bstlink> l1 = new LinkedList<Bstlink>();
	static LinkedList<Bstlink> l2 = new LinkedList<Bstlink>();
	static LinkedList<Bstlink> union = new LinkedList<Bstlink>();
	static LinkedList<Bstlink> intersection = new LinkedList<Bstlink>();
	
	public static void union(Bstlink bt,LinkedList l ){
		
		if(bt == null){return ;}
		union(bt.left,l);
		if(ispresent(bt,l)==0){l.add(bt);}
		union(bt.right,l);
		
	}
	
	public static int ispresent(Bstlink b,LinkedList li){
		
		Iterator<Bstlink> itr = li.iterator();
		while(itr.hasNext()){
			Bstlink tempe = itr.next();
			if(tempe.data == b.data){return 1;}
		}
		
		return 0;
		}
	
	public static void unionlist(LinkedList l ){
		Iterator itr = l.iterator() ;
		while(itr.hasNext()){
			 Bstlink b = (Bstlink) itr.next();
			int found = isfound(union , b.data) ;
			if(found==0){union.add(b) ; }
			
		
		}
		
		
		
	
		
	}
	public static void  intersectionlist(LinkedList l,LinkedList l1 ){
		Iterator itr = l.iterator() ;
		while(itr.hasNext()){
			 Bstlink b = (Bstlink) itr.next();
			int found = isfound( l1, b.data) ;
			if(found==1){intersection.add(b) ; }
		}
		
		}
	public static int isfound(LinkedList l,int data){
       Iterator i = l.iterator();
       while(i.hasNext()){
    	   Bstlink b = (Bstlink) i.next();
    	   if(b.data==data){return 1;}
       
       }
       return 0;
	}
	public static void print(LinkedList l){
		 Iterator i = l.iterator();
	       while(i.hasNext()){
	    	   Bstlink b = (Bstlink) i.next();
	    	 System.out.print(" "+b.data) ;
	       
	       }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bstlink bst = new Bstlink(6);
			bst.left = new Bstlink(4);
			 bst.left.left =new Bstlink(3) ;
		 bst.right = new Bstlink(9) ;
	//	bst.left.left.left = new Bstlink(2);
	//	 bst.left.left.right = new Bstlink(4);
			 bst.right.left  =new Bstlink(8);
		// bst.right.right  =new Bstlink(10);
		 
		 Bstlink bst1 = new Bstlink(6);
		 bst1.left =new Bstlink(4) ;
	// bst1.right = new Bstlink(9) ;
	//bst1.left.left = new Bstlink(2);
	 bst1.left.right = new Bstlink(5);
//		 bst1.right.left  =new Bstlink(8);
	// bst1.right.right  =new Bstlink(15);
	// bst1.right.right.right  =new Bstlink(18);
     union(bst,l1);
     union(bst1,l2);
     unionlist(l1);
     unionlist(l2);
     print(union);
     intersectionlist(l1,l2) ;
     System.out.println("");
     print(intersection);
     

	}

}
