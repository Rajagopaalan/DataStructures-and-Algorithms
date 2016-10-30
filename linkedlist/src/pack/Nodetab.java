package pack;

import java.util.Hashtable;

public class Nodetab {
	int data;
	Nodetab next;
	int start;
	static Nodetab initial;
	boolean isvisited;
	public  Nodetab(int d){
		data=d;
		
		next = null;
	}
	public void startnode(Nodetab n){
		initial=n;
	}
	public  Nodetab(int d,int start){
		data=d;
		start=1;
		next = null;
	}
	
	
	
	public static void display(Nodetab n){
		int terminate=1;
		int isloop=0;
		
		Nodetab head=n;
		Nodetab fptr = n;
		Nodetab sptr =n;
		int begin=0;

		
		
		begin=1;
		while(fptr!=null && sptr!=null && fptr.next!=null ){
		
			
		begin++;
		System.out.println(" "+n.data+" "+fptr.data+" "+sptr.data);
		if(fptr.next==null || (fptr.next).next == null){break;}
				fptr=(fptr.next).next;
				sptr=sptr.next;
				
			
				if(fptr==sptr  ){
					
				
					isloop=1;
						break;}
			}
		System.out.println(n.data);
		if(fptr==sptr  ){
			int count=0;
			fptr=fptr.next;
			count++;
			while(fptr!=sptr){
				fptr=fptr.next;
				count++;
			}
			System.out.println("length of loop"+count);
			
			System.out.println(fptr+" "+sptr+" "+"this loop exists");
			isloop=1;
				//break;
		}
		else{
			System.out.println(" "+fptr+" "+sptr);
			System.out.println(" No loop exists");
			
			
			
		}
		 if(isloop==1){
			 
			 sptr=head;
			 System.out.println("dd"+sptr+""+fptr);
			 while(fptr!=sptr){
				 fptr=fptr.next;
				 sptr=sptr.next;
				 
			 }

			 
		 }
	
		}
//	
	public static  void display1(Nodetab n){
		int terminate=1;
		//while(terminate==1){
		//while(n.isvisited!=true)
		while(n!=null){
			if(n.isvisited==true){
				System.out.println("loop exists");
				break;}
			else{
			System.out.println(n.data);
		
		
			n.isvisited =true;
			n=n.next ;}
			}
		
		}
//		terminate=0;
		
	//	}
	//	System.out.println(n.data);
	
	public static void main(String args[]){
	//	Hashtable<> = new HashTable();
		Nodetab n = new Nodetab(1);
		Nodetab st=n;
		n.startnode(n);
		n.next=new Nodetab(2);
	//	Nodetab temp=n.next;
		
		(n.next).next=new Nodetab(3);	
		((n.next).next).next=new Nodetab(4);
	//	(((n.next).next).next).next=temp ;
		((((n.next).next).next).next)= new Nodetab(5);
		Nodetab temp=((((n.next).next).next).next);
		(((((n.next).next).next).next).next) = new Nodetab(6);
		(((((n.next).next).next).next).next).next = new Nodetab(7);
		((((((n.next).next).next).next).next).next).next= new Nodetab(8);
		(((((((n.next).next).next).next).next).next).next).next= new Nodetab(9);
		((((((((n.next).next).next).next).next).next).next).next).next= new Nodetab(10);
		(((((((((n.next).next).next).next).next).next).next).next).next).next = new Nodetab(11);
	
		((((((((n.next).next).next).next).next).next).next).next).next = temp;
		display(st);
	//	display1(st);
		//n.show(n);
	}
	
	

}
