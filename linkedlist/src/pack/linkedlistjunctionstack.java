package pack;

import java.util.Stack;

public class linkedlistjunctionstack {
	
		int data;
		linkedlistjunctionstack  Next;
		int size=0;

		
		public linkedlistjunctionstack(int i){
			 data=i;
		    Next=null;
		    size++ ;
		}

public static void findcommon(linkedlistjunctionstack li,linkedlistjunctionstack lin){
	
	Stack<linkedlistjunctionstack> s= new Stack<linkedlistjunctionstack>();
	Stack<linkedlistjunctionstack> r= new Stack<linkedlistjunctionstack>();
	int tops=0;
	int topr=0;
	linkedlistjunctionstack temp = null ;
	
	
	linkedlistjunctionstack listart=li;
	linkedlistjunctionstack linstart=lin;
	//System.out.println("dfdf");
	
	while(li!=null){
		s.push(li);
		li=li.Next;
		tops++;
		
	}
	while(lin!=null){
		r.push(lin);
		lin=lin.Next;
		topr++;
	}
	topr--;
	tops--;
	System.out.println(tops+" "+topr);
	while(s!=null  && r!=null){
		if(s.get(tops).data == r.get(topr).data){
			temp=(s.get(tops));
			if(tops>0){
			tops--;}
			if(topr>0){
			topr--;}
		}
		else{break;}
		
	}
	while(listart!=null){
		System.out.print(" " +listart.data);
		listart=listart.Next;
	}
	System.out.println(" ");
	while(linstart!=null){
		System.out.print(" " +linstart.data);
		linstart=linstart.Next;
	}
	System.out.println("hi"+temp.data);
	
}

	
	public static void main(String args[]){
	//	System.out.println("df");
		
		linkedlistjunctionstack li = new linkedlistjunctionstack(5) ;
		li.Next=new  linkedlistjunctionstack(8);
	
		(li.Next).Next=new  linkedlistjunctionstack(9);
		((li.Next).Next).Next=new  linkedlistjunctionstack(10);
		(((li.Next).Next).Next).Next=new  linkedlistjunctionstack(11);
		((((li.Next).Next).Next).Next).Next = 	new  linkedlistjunctionstack(13);
		linkedlistjunctionstack temp=	((li.Next).Next).Next;
//		(((((li.Next).Next).Next).Next).Next).Next =null; 
		
		linkedlistjunctionstack lin = new linkedlistjunctionstack(6) ;
		lin.Next=new  linkedlistjunctionstack(7);
		(lin.Next).Next=new  linkedlistjunctionstack(12);
		((lin.Next).Next).Next=new  linkedlistjunctionstack(14);
		(((lin.Next).Next).Next).Next=new  linkedlistjunctionstack(15);
		((((lin.Next).Next).Next).Next).Next =null;
	//	linkedlistjunctionstack temp= ((lin.Next).Next).Next ;
		((((lin.Next).Next).Next).Next).Next = 	temp;
	//	(((((li.Next).Next).Next).Next).Next).Next=  temp;
		findcommon(li,lin);
		
		
	}

}
