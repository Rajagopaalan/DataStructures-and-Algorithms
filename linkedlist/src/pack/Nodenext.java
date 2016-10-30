package pack;

public class Nodenext {
	int data;
    Nodenext next;
	public Nodenext(int d){
		data=d;
		next=null;
		
		
	}
public Nodenext(){
	next=null;
}
	public static void insert(int n,Nodenext next){
		Nodenext prev=null;
		Nodenext temp=null;
		while(next.next!=null){
			if(n> next.data){
				prev=next;
				next=next.next;
				  System.out.println(next.data);   
			}
			else{
				Nodenext ne = new Nodenext(n);
			   temp= prev.next;
			   prev.next=next;
			   next.next=temp;
			   System.out.println(next.data);   
		//	ne.next= 
			}
			//System.out.println(next.data);
		}
		
		
	
		
	}
	public static void display(Nodenext n){
		while((n.next)!=null){
			
			System.out.println(n.data);
			n=n.next;
		}
	}
	public static void main(String args[]){
		Nodenext ni= new Nodenext();
		Nodenext n= new Nodenext(1);
		Nodenext head=n;
		ni.next=n;
		n.next= new Nodenext(3);
		(n.next).next = new Nodenext(4);
		
	     ((n.next).next).next = new Nodenext(5);
	     (((n.next).next).next).next = new Nodenext(6);
	     ((((n.next).next).next).next).next = new Nodenext(9);
	     (((((n.next).next).next).next).next).next =new Nodenext();
	     insert(7,n) ;
	     display(n);
	}
}
