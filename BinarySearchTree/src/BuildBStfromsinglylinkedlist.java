import java.util.LinkedList;
import java.util.Queue;

class Linkedlist{
	int data;
	Linkedlist next =null ;
	Linkedlist(int d){data = d;}
}
public class BuildBStfromsinglylinkedlist {
   // BuildBStfromDLL bst = new BuildBStfromDLL();
	//naive solution O(nlogn)
	
	
	public static BuildBStfromDLL buildtree(Linkedlist l) {
	
		// TODO Auto-generated constructor stub
	 //   System.out.println("ji");
		BuildBStfromDLL bst  ;
		if(l==null){bst=null;return bst;}
		if(l.next==null){	bst = new BuildBStfromDLL(l.data);return bst;}
		
		//if(l==null || l.next==null){return bst;}
		//System.out.println(bst.data);
	//	BuildBStfromDLL bst  = new BuildBStfromDLL(l.data);
	//	if(l.next==null){return bst;}
	
		Linkedlist middle = findmiddle(l);
		bst = new BuildBStfromDLL(middle.data) ;
		Linkedlist middlenext = middle.next ;
		middle.next = null;
		
		//Linkedlist middle = middleprevious.next ;
	//	System.out.println(middle.data);
		Linkedlist prev = findprevmiddle(l,middle);
		//System.out.println(prev.data);
	    prev.next = null;
	  //  if(l!=null && middlenext!=null){
	 //   System.out.println(l.data+"-"+ middlenext.data) ;}
		bst.prev =   buildtree(l) ;
		bst.Next =   buildtree(middlenext) ;
	
		return bst;
	}

	public static Linkedlist findmiddle(Linkedlist l){
	Linkedlist fastptr =l ,slowptr =l;
	Linkedlist prevmiddle=slowptr;
	
		while(fastptr!=null && fastptr.next!=null){
			prevmiddle=slowptr;
			fastptr = fastptr.next.next ;
			slowptr = slowptr.next ;
			
		}
		return  slowptr;
		
		
	}
	
	
	public static Linkedlist findprevmiddle(Linkedlist prev,Linkedlist curr ){
		while(prev!=curr && prev.next!=curr){prev=prev.next;}
		return prev;
		
		
	}
	public static void printlevelorder(BuildBStfromDLL head){
		if(head==null){return ;}
		printlevelorder(head.prev);
		System.out.println(head.data);
		printlevelorder(head.Next);
	/*	Queue<BuildBStfromDLL> level = new LinkedList<BuildBStfromDLL>();
		level.add(head);
		while(!level.isEmpty())		{
			BuildBStfromDLL temp =level.peek() ;
			System.out.println(temp.data);
			if(temp.prev!=null){level.add(temp.prev);}
			if(temp.Next!=null){level.add(temp.Next);}
		    level.poll() ;
			
		}
		*/
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Linkedlist l = new Linkedlist(1);
		l.next =new Linkedlist(2);
		l.next.next =new Linkedlist(3);
		l.next.next.next =new Linkedlist(4);
		l.next.next.next.next =new Linkedlist(5);
		l.next.next.next.next.next =new Linkedlist(6);
		l.next.next.next.next.next.next =new Linkedlist(7);
		l.next.next.next.next.next.next.next =new Linkedlist(8);
		//l.next.next.next.next.next.next.next.next =new Linkedlist(9);
		//l.next.next.next.next.next.next.next.next.next =new Linkedlist(10);
		l.next.next.next.next.next.next.next.next =null;
		//l.next.next.next.next.next.next.next.next.next.next =new Linkedlist(11);
		
		//l.next.next.next.next.next.next.next.next.next.next.next = null ;
		
		
		
		BuildBStfromDLL bst  = buildtree(l);
printlevelorder(bst) ;
	//	LinkedList li = new LinkedList(1);
		
	//	BuildBStfromDLL bst = new BuildBStfromDLL();

	}

}
