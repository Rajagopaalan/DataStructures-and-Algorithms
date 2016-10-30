import java.util.LinkedList;
import java.util.Queue;

public class BuildBStfromDLL {

	int data;
	BuildBStfromDLL Next;
	BuildBStfromDLL prev;
	public BuildBStfromDLL(int d){
		data=d;
		Next=null;
	    prev = null ;
		
	}
	
	//complexity O(nlogn)
	//BSt build from tree Karyumanchi solution 
	public static BuildBStfromDLL buildtree(BuildBStfromDLL head){
		if(head==null || head.Next==null){return head;}
		BuildBStfromDLL temp = returnmiddle(head);
	//	System.out.println(middle.data);
		//BuildBStfromDLL middleNext = temp.Next ;
		BuildBStfromDLL p =head;
		while(p.Next!=temp){p= p.Next;}
		BuildBStfromDLL q = temp.Next; 
		if(q!=null){q.prev=null;}
		p.Next = null ;
		temp.Next = null ;
		temp.prev = buildtree(head) ;
		temp.Next = buildtree(q ) ;
		
		return temp;
		
		
		
	}
	public static BuildBStfromDLL returnmiddle(BuildBStfromDLL head){// getting middle of linkedlist
		BuildBStfromDLL fastptr=head,slowptr=head;
		if(head!=null){
		while(fastptr!=null && fastptr.Next!=null){
			fastptr = fastptr.Next.Next ;
			slowptr = slowptr.Next ;
			
		}}
		return slowptr;
	}

	public static void printinorder(BuildBStfromDLL  head){
		if(head==null){return ;}
		printinorder(head.prev);
		System.out.println(head.data);
		printinorder(head.Next);
	}
	
	public static void printlevelorder(BuildBStfromDLL head){
		Queue<BuildBStfromDLL> level = new LinkedList<BuildBStfromDLL>();
		level.add(head);
		while(!level.isEmpty())		{
			BuildBStfromDLL temp =level.peek() ;
			System.out.println(temp.data);
			if(temp.prev!=null){level.add(temp.prev);}
			if(temp.Next!=null){level.add(temp.Next);}
		    level.poll() ;
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BuildBStfromDLL b = new BuildBStfromDLL (1);
		b.Next = new BuildBStfromDLL(2);
	    b.prev = null;
	    b.Next.Next =  new 	BuildBStfromDLL(3);
	    b.Next.prev = b ;
	    b.Next.Next.Next = new 	BuildBStfromDLL(4);
	    b.Next.Next.prev = b.Next ;
	    b.Next.Next.Next.Next = new 	BuildBStfromDLL(5);
	    b.Next.Next.Next.prev =  b.Next.Next ;
	    b.Next.Next.Next.Next.Next =  new 	BuildBStfromDLL(6);
	    b.Next.Next.Next.Next.prev = b.Next.Next.Next ;
	    b.Next.Next.Next.Next.Next.Next =  new 	BuildBStfromDLL(7);
	    b.Next.Next.Next.Next.Next.prev = b.Next.Next.Next.Next ;
	    b.Next.Next.Next.Next.Next.Next.Next =  new 	BuildBStfromDLL(8);
	    b.Next.Next.Next.Next.Next.Next.prev = b.Next.Next.Next.Next.Next ;
	    b.Next.Next.Next.Next.Next.Next.Next.Next =  new 	BuildBStfromDLL(9);
	    b.Next.Next.Next.Next.Next.Next.Next.prev = b.Next.Next.Next.Next.Next.Next ;
	    b.Next.Next.Next.Next.Next.Next.Next.Next.Next =  new 	BuildBStfromDLL(10);
	    b.Next.Next.Next.Next.Next.Next.Next.Next.prev = b.Next.Next.Next.Next.Next.Next.Next ;
	    b.Next.Next.Next.Next.Next.Next.Next.Next.Next.Next = new BuildBStfromDLL(11); 
	    b.Next.Next.Next.Next.Next.Next.Next.Next.Next.prev = b.Next.Next.Next.Next.Next.Next.Next.Next ;
	    b.Next.Next.Next.Next.Next.Next.Next.Next.Next.Next.Next = null;
	    b.Next.Next.Next.Next.Next.Next.Next.Next.Next.Next.prev =  b.Next.Next.Next.Next.Next.Next.Next.Next.Next ;

	  //  while(b!=null){System.out.println(b.data);b=b.Next;}

		BuildBStfromDLL root = buildtree(b);
//	System.out.println(root.prev.data);
//	printlevelorder(root);
		printinorder(root);
	}

}
