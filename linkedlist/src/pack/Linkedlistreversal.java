package pack;

import java.util.HashMap;

public class Linkedlistreversal {
	int data;
	Linkedlistreversal Next;
	public Linkedlistreversal(int d){
		data=d;
		Next=null;
		
		
	}
	public static void printreverse(Linkedlistreversal li){
		int count=0;
		int count1=0;
		Linkedlistreversal start=li;
		Linkedlistreversal startdouble=li;
	//	HashMap<Integer,Integer> hash= new HashMap<Integer,Integer>();
		
	if(li== null){return;}
	printreverse(li.Next)	;
	System.out.print(" " +li.data);
	
/*		while(startdouble!=null && startdouble.Next!=null){
			System.out.print(" "+li.data);
		//	hash.put(count,li.data) ;
			
			li=li.Next; 
			startdouble=(startdouble.Next).Next ;
			//count++;
			
		}
/*		while(count1!=count/2){
			start=start.Next;
			count1++;
			
		}*/
	//	System.out.println("");
	//	System.out.println("middle"+li.data);
		
	}

	
	public static void main(String args[]){
		Linkedlistreversal li = new Linkedlistreversal(5);
		
		li.Next=new  Linkedlistreversal(8);
		
		(li.Next).Next=new  Linkedlistreversal(9);
		((li.Next).Next).Next=new  Linkedlistreversal(10);
		(((li.Next).Next).Next).Next=new  Linkedlistreversal(11);
		((((li.Next).Next).Next).Next).Next = 	new  Linkedlistreversal(13);
		
		
		printreverse(li);
	}
}


