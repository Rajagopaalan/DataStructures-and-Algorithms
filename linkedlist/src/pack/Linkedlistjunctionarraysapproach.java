package pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Linkedlistjunctionarraysapproach {
	int data;
	Linkedlistjunctionarraysapproach  Next;
	public Linkedlistjunctionarraysapproach (int d){
		data=d;
	Next =null;
		
	}

	private static void findcommonhash(Linkedlistjunctionarraysapproach li, Linkedlistjunctionarraysapproach lin) {
		// TODO Auto-generated method stub
		Linkedlistjunctionarraysapproach repeat=null;
		Linkedlistjunctionarraysapproach listart=li;
		Linkedlistjunctionarraysapproach linstart=lin;
		HashSet<Linkedlistjunctionarraysapproach > add= new HashSet<Linkedlistjunctionarraysapproach >();
	//	ArrayList<Linkedlistjunctionarraysapproach> addr = new ArrayList<Linkedlistjunctionarraysapproach>();
		
		int l1=0;
		int l2=0;
		
		while(li !=null){
		//	addr.add(li);
		
			System.out.print(" "+ li.data);
			l1++;
			li=li.Next;
		
		}
		System.out.println("");
		while(lin !=null){
		//	addr.add(lin);
			l2++;
			System.out.print( " " +lin.data);
			lin=lin.Next;
			
		}
		System.out.println("junction");
	
		if(l1>l2){
			listart=listart.Next;
		}
		else{linstart=linstart.Next;}
		
		while(listart!=null && linstart!=null){
			if(listart.Next==linstart.Next){
				break;
			}
			listart=listart.Next;
			linstart=linstart.Next;
		}
		System.out.println(" "+listart.data);
		
	//	Collections.sort(addr
		
		/*for(int x=(addr.size()-1);x>=0;x--){
			if(add.contains(addr.get(x))){
				repeat=addr.get(x) ;
			}
			else{add.add(addr.get(x));}
		}
	//	while(li.next)
		System.out.println(repeat.data);
		while(listart!=null){
			System.out.print(" " +listart.data);
			listart=listart.Next;
		}
		System.out.println(" ");
		while(linstart!=null){
			System.out.print(" " +linstart.data);
			linstart=linstart.Next;
		}*/
	}
	
	public static void main(String args[]){
		Linkedlistjunctionarraysapproach li = new Linkedlistjunctionarraysapproach(5) ;
		li.Next=new  Linkedlistjunctionarraysapproach(8);
		(li.Next).Next=new  Linkedlistjunctionarraysapproach(9);
		((li.Next).Next).Next=new  Linkedlistjunctionarraysapproach(10);
		(((li.Next).Next).Next).Next=new  Linkedlistjunctionarraysapproach(11);
		((((li.Next).Next).Next).Next).Next = 	new  Linkedlistjunctionarraysapproach(13);
		
		
	//	Linkedlistjunctionarraysapproach temp=	((li.Next).Next).Next;
//		(((((li.Next).Next).Next).Next).Next).Next =null; 
		
		Linkedlistjunctionarraysapproach lin = new Linkedlistjunctionarraysapproach(6) ;
		lin.Next=new  Linkedlistjunctionarraysapproach(7);
		(lin.Next).Next=new  Linkedlistjunctionarraysapproach(12);
		((lin.Next).Next).Next=new  Linkedlistjunctionarraysapproach(14);
		(((lin.Next).Next).Next).Next=new  Linkedlistjunctionarraysapproach(15);
		((((lin.Next).Next).Next).Next).Next =null;
		Linkedlistjunctionarraysapproach temp= ((lin.Next).Next).Next ;
		(((((li.Next).Next).Next).Next).Next).Next = 	temp;
	//	(((((li.Next).Next).Next).Next).Next).Next=  temp;
		findcommonhash(li,lin);
				
	}


}
