 class BSTtoDLL{
	 BSTtoDLL next;
	 BSTtoDLL prev;
		int data ;
		BSTtoDLL(int x){
			
			data = x;
			next=null;
			prev=null;
		}
}



public class BuildBStfromdoublyLinkedList {

	
	
	
	public BuildBStfromdoublyLinkedList(int x) {
		// TODO Auto-generated constructor stub
		
		
	}
	
public static 	BSTtoDLL buildtree(	BSTtoDLL b){

	if(b==null ||  b.next==null){return b;}
	
	BSTtoDLL middle = returnmiddle(b);
	//System.out.println(middle.data);
	BSTtoDLL middlenext = middle.next ;
	middle.next = null;
	BSTtoDLL Lastprev = b;
	while(Lastprev.next!=middle){
		Lastprev = Lastprev.next ;	
	}
	Lastprev.next = null;
	
	middle.prev = buildtree(b) ;
	middle.next = buildtree(middlenext) ;
	
	return middle;
	
	
}
public static BSTtoDLL returnmiddle(	BSTtoDLL start){
	BSTtoDLL fastptr =  start;
	BSTtoDLL slowptr  = start;
	
//	System.out.println(start.data+"-"+ end.data);
//	while(fastptr!=null && fastptr.next!=null){
	while(fastptr!=null && fastptr.next!=null ){
		//System.out.println(slowptr.data +"-"+ fastptr.data) ;
		//if(slowptr!=null && slowptr.next==end){break;}
	
		slowptr= slowptr.next;
		fastptr = fastptr.next.next ;
		//System.out.print(slowptr);
		
	}
	//System.out.println("here");
	return slowptr ;
}

public static void print(BSTtoDLL b){
	
	while(b!=null){System.out.print(" "+b.data);b=b.next;}
	System.out.println();
	while(b!=null){System.out.print(" "+b.data);b=b.prev;}
}
	
public static void printinorder(	BSTtoDLL b){
	if(b==null){return ;}
	printinorder(b.prev);
	System.out.print(""+b.data);
	printinorder(b.next);
}	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTtoDLL b = new BSTtoDLL (1);
		b.next = new BSTtoDLL(2);
	 //   b.prev = null;
	    b.next.next =  new 	BSTtoDLL(3);
	    b.next.prev = b ;
	    b.next.next.next = new 	BSTtoDLL(4);
	    b.next.next.prev = b.next ;
	    b.next.next.next.next = new 	BSTtoDLL(5);
	    b.next.next.next.prev =  b.next.next ;
	    b.next.next.next.next.next =  new 	BSTtoDLL(6);
	    b.next.next.next.next.prev = b.next.next.next ;
	    b.next.next.next.next.next.next =  new 	BSTtoDLL(7);
	    b.next.next.next.next.next.prev = b.next.next.next.next ;
	    b.next.next.next.next.next.next.next =  new 	BSTtoDLL(8);
	    b.next.next.next.next.next.next.prev = b.next.next.next.next.next ;
	    b.next.next.next.next.next.next.next.next =  new 	BSTtoDLL(9);
	    b.next.next.next.next.next.next.next.prev = b.next.next.next.next.next.next ;
	    b.next.next.next.next.next.next.next.next.next =  new 	BSTtoDLL(10);
	    b.next.next.next.next.next.next.next.next.prev = b.next.next.next.next.next.next.next ;
	    b.next.next.next.next.next.next.next.next.next.next = new BSTtoDLL(11); 
	    b.next.next.next.next.next.next.next.next.next.prev = b.next.next.next.next.next.next.next.next ;
	    b.next.next.next.next.next.next.next.next.next.next.next = null;
	    b.next.next.next.next.next.next.next.next.next.next.prev =  b.next.next.next.next.next.next.next.next.next ;
	  //  BuildBStfromdoublyLinkedList start=b;
	 //   while(b.next!=null){b=b.next;}
	    
	//	BuildBStfromdoublyLinkedList end = b;
		//System.out.println(end.data); 
	  //  start = b;
	   
	   
	   // print(b);
	//  BuildBStfromdoublyLinkedList root =   buildtree(start,end);
	    //System.out.println(l);
	    BSTtoDLL root=   buildtree(b);
	    
		//System.out.println(root.data); 
 printinorder(root);
	//	 printl(b);
	}

}
