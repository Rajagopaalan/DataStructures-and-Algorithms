package pack;

public class Linkedlistreverse {
	
	private Linkedlistreverse next;
	private int data;

	public Linkedlistreverse(int i) {
		// TODO Auto-generated constructor stub
		data=i;
		next=null;
	}

public static void display(Linkedlistreverse n){
	while(n!=null){
		System.out.println(n.data);
		n=n.next;
	}
	
}
public static void reverse(Linkedlistreverse n){
	
	Linkedlistreverse head=n;
	Linkedlistreverse temp=null;
	Linkedlistreverse nextnode=null;
	while(head!=null){
		nextnode=head.next;
		head.next=temp;
		temp=head;
		head=nextnode;
		
	}
}
	public static void main(String args[]){
	
		Linkedlistreverse n = new Linkedlistreverse(5);
		Linkedlistreverse temp=n;
		Linkedlistreverse te=n;
			n.next=new Linkedlistreverse(1);
			(n.next).next=new Linkedlistreverse(17);
			((n.next).next).next=new Linkedlistreverse(4);
			(((n.next).next).next).next=new Linkedlistreverse(9);
			((((n.next).next).next).next).next=new Linkedlistreverse(10);
			(((((n.next).next).next).next).next).next = new Linkedlistreverse(12);
Linkedlistreverse g= (((((n.next).next).next).next).next).next  ;
			display(temp );
			reverse(n);
			System.out.println("after reversal");
			display(g );
			
		
	}

}
