import java.util.LinkedList;
import java.util.Queue;

public class BuildBSTfromsinlylinkedlistoptimal {

static	Linkedlist l ; 
	
	public BuildBSTfromsinlylinkedlistoptimal() {
		// TODO Auto-generated constructor stub
	}
	//complexity O(n)
	//Assumption is sortedlinkedlinkedlist
	public static BuildBStfromDLL  BuildBSt(int n){
		if(n<=0){return null;}
		BuildBStfromDLL left = BuildBSt(n/2);
		BuildBStfromDLL root = new 	BuildBStfromDLL (l.data);
	
		root.prev =  left;
		l=l.next ;
		root.Next = BuildBSt(n-n/2-1) ;
		
		return root;
		}
	public static void printlevelorder(BuildBStfromDLL head){
	/*	if(head==null){return ;}
		printlevelorder(head.prev);
		System.out.println(head.data);
		printlevelorder(head.Next);
		*/
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
		 l = new Linkedlist(1);
		l.next =new Linkedlist(2);
		l.next.next =new Linkedlist(3);
		l.next.next.next =new Linkedlist(4);
		l.next.next.next.next =new Linkedlist(5);
		l.next.next.next.next.next =new Linkedlist(6);
		l.next.next.next.next.next.next =new Linkedlist(7);
		l.next.next.next.next.next.next.next =new Linkedlist(8);
		l.next.next.next.next.next.next.next.next =new Linkedlist(9);
		l.next.next.next.next.next.next.next.next.next =new Linkedlist(10);
		l.next.next.next.next.next.next.next.next.next.next=null;
		Linkedlist temp = l;
		 
		int count =0;
		while(temp!=null){
			temp=temp.next ;
			count++;
		}
		
		BuildBStfromDLL  n = BuildBSt(count);
		
printlevelorder(n);
	}

}
