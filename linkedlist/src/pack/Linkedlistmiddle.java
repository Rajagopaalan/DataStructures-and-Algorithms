package pack;

import java.util.HashMap;

public class Linkedlistmiddle {
	int data;
	Linkedlistmiddle Next;
	public Linkedlistmiddle(int d){
		data=d;
		Next=null;
		
		
	}
	public static void findmiddle(Linkedlistmiddle li){
		int count=0;
		int count1=0;
		Linkedlistmiddle start=li;
		Linkedlistmiddle startdouble=li;
	//	HashMap<Integer,Integer> hash= new HashMap<Integer,Integer>();
/*		
	if(li== null){return;}
	findmiddle(li.Next)	;
	System.out.print(" " +li.data);
	*/
	while(startdouble!=null && startdouble.Next!=null){
		//	System.out.print(" "+li.data);
		//	hash.put(count,li.data) ;
			
			//li=li.Next; 
			startdouble=(startdouble.Next).Next ;
			if(startdouble==null){System.out.println("even");}
			//else{System.out.println("odd");
			//}
			if(startdouble!=null && startdouble.Next==null )
			{System.out.println("odd");}
			//count++;
			
		}
	if(start!=null && start.Next==null ){
		System.out.println("only one odd");
	}
	


/*		while(count1!=count/2){
			start=start.Next;
			count1++;
			
		}*/
	//	System.out.println("");
	//	System.out.println("middle"+li.data);
		
	}

	
	public static void main(String args[]){
		Linkedlistmiddle li = new Linkedlistmiddle(5);
		
		li.Next=null;
	//	li.Next=new  Linkedlistmiddle(8);
		
		//(li.Next).Next=new  Linkedlistmiddle(9);
	//	((li.Next).Next).Next=new  Linkedlistmiddle(10);
		//(((li.Next).Next).Next).Next=new  Linkedlistmiddle(11);
	//	((((li.Next).Next).Next).Next).Next = 	new  Linkedlistmiddle(13);
		
		
		findmiddle(li);
	}
}


