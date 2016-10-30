package linkedlist;

import java.util.HashMap;

public class Linkedlistrecursionmerge {
	int data;
	Linkedlistrecursionmerge Next;
	public Linkedlistrecursionmerge(int d){
		data=d;
		Next=null;
		
		
	}
	public static  Linkedlistrecursionmerge Linkedlistrecursion(Linkedlistrecursionmerge li, Linkedlistrecursionmerge lin){
		Linkedlistrecursionmerge res=null;
		
	
		if(li==null){
			
			return lin;}
		
		if(lin==null){
			
			
			return li;
			}
		
		
		if(li.data<=lin.data){
			res=li;
			Linkedlistrecursion(li.Next,lin);
		}
		else{
			res=lin;
			Linkedlistrecursion(li,lin.Next);
			
		}

		System.out.println(res.data);
		return res;
		
	}

	
	public static void main(String args[]){
		
		Linkedlistrecursionmerge li = new Linkedlistrecursionmerge(7);
		
		li.Next=new  Linkedlistrecursionmerge(8);
		
		(li.Next).Next=new  Linkedlistrecursionmerge(9);
		((li.Next).Next).Next=new  Linkedlistrecursionmerge(10);
		(((li.Next).Next).Next).Next=new  Linkedlistrecursionmerge(13);
		((((li.Next).Next).Next).Next).Next = 	new  Linkedlistrecursionmerge(17);
		
		Linkedlistrecursionmerge lin = new Linkedlistrecursionmerge(6) ;
		lin.Next=new  Linkedlistrecursionmerge(7);
		(lin.Next).Next=new  Linkedlistrecursionmerge(16);
		((lin.Next).Next).Next=new  Linkedlistrecursionmerge(19);
		(((lin.Next).Next).Next).Next=new  Linkedlistrecursionmerge(20);
		((((lin.Next).Next).Next).Next).Next =null;
		Linkedlistrecursionmerge temp= ((lin.Next).Next).Next ;
		//((((lin.Next).Next).Next).Next).Next = 	temp;
		Linkedlistrecursionmerge  finalans =		Linkedlistrecursion(li,lin);
	//	System.out.println(finalans.data);
		
	}
}


