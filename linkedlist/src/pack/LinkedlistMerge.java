package pack;

import java.util.HashMap;
import java.util.LinkedList;

public class LinkedlistMerge {
	int data;
	LinkedlistMerge Next;
	public LinkedlistMerge(int d){
		data=d;
		Next=null;
		
		
	}
	public static void  linkedlistmerge(LinkedlistMerge li,LinkedlistMerge lin){
		int count=0;
		int count1=0;
		LinkedlistMerge lifirst=li;
		LinkedlistMerge linsecond=lin ;
	//	LinkedlistMerge startdouble=li;
		LinkedlistMerge Mergelist ;
		Mergelist=new LinkedlistMerge(-1);
		LinkedlistMerge start=Mergelist ;
		Mergelist=Mergelist.Next;
		int startnode=1;
		LinkedList<LinkedlistMerge> merge= new LinkedList<LinkedlistMerge>();
	
		 while(li!= null && lin!=null){
			 if(li.data <= lin.data){
				 Mergelist=new LinkedlistMerge(li.data);
				// Mergelist=Mergelist.Next;
			// System.out.println("dfD");
				 merge.add(li) ;
				 
				 if(startnode==0){
					 start=Mergelist;
					 startnode=1;
				 }
			//	 System.out.print( " " +Mergelist.data);
				 Mergelist=Mergelist.Next;
				 
				 li=li.Next;
				
			 }
			 else{
				 Mergelist=new LinkedlistMerge(lin.data);
				 merge.add(lin) ;
			 if(startnode==0){
					 start=Mergelist;
					 startnode=1;
				 }
		//	 System.out.print( " " +Mergelist.data);
				 Mergelist=Mergelist.Next;
				 lin=lin.Next;
			 }
			
			
		 }
		if(li!=null){
			 while(li!=null){
				 Mergelist=new LinkedlistMerge(li.data);
		//	 System.out.print( " " +Mergelist.data);
				 Mergelist=Mergelist.Next;
				 merge.add(li);
				 li=li.Next;
				 
			 }
		 }
		 if(lin!=null){
			 while(lin!=null){
				 Mergelist=new LinkedlistMerge(lin.data);
	///	System.out.print( " " +Mergelist.data);
			 Mergelist=Mergelist.Next;
			 merge.add(lin);
				 lin=lin.Next;
			
			 }
		 }
		//Mergelist.Next=null;
	//	start=start.Next;
		
	//	return  start;
		 
		/* while(start!=null)	{
				System.out.print(" "+start.data);
				start=start.Next;
			}*/
		for(int x=0;x<merge.size();x++){
			System.out.print(" "+(merge.get(x).data));
			 
		 }
	}
public static void print(LinkedlistMerge li){
	//System.out.print(" "+li.Next.data);
while(li!=null)	{
	System.out.print(" "+li.data);
	li=li.Next;
}
}
	
	public static void main(String args[]){
		LinkedlistMerge li = new LinkedlistMerge(5);
		
		li.Next=new  LinkedlistMerge(8);
		
		(li.Next).Next=new  LinkedlistMerge(9);
		((li.Next).Next).Next=new  LinkedlistMerge(10);
		(((li.Next).Next).Next).Next=new  LinkedlistMerge(11);
		((((li.Next).Next).Next).Next).Next = 	new  LinkedlistMerge(1);
		
		LinkedlistMerge lin = new LinkedlistMerge(4) ;
		lin.Next=new  LinkedlistMerge(7);
		(lin.Next).Next=new  LinkedlistMerge(12);
		((lin.Next).Next).Next=new  LinkedlistMerge(14);
		(((lin.Next).Next).Next).Next=new  LinkedlistMerge(15);
		((((lin.Next).Next).Next).Next).Next =null;
		LinkedlistMerge temp= ((lin.Next).Next).Next ;
		//((((lin.Next).Next).Next).Next).Next = 	temp;
		
		linkedlistmerge(li,lin);
//	print(t1);
	}
}


