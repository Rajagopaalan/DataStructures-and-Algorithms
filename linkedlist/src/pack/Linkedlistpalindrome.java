
package pack;

public class Linkedlistpalindrome {
	
	private Linkedlistpalindrome next;
	private int data;

	public Linkedlistpalindrome(int i) {
		// TODO Auto-generated constructor stub
		data=i;
		next=null;
	}

public static void display(Linkedlistpalindrome n){
	while(n!=null){
		System.out.println(n.data);
		n=n.next;
	}
	
}
public static void reverse(Linkedlistpalindrome n){
	
	Linkedlistpalindrome head=n;
	Linkedlistpalindrome fastptr=n;
	Linkedlistpalindrome slowptr=n;
	Linkedlistpalindrome temp=null;
	Linkedlistpalindrome nextnode=null;
	Linkedlistpalindrome midptr=null;
	
	while(fastptr.next!=null &&  fastptr.next.next!=null   ){
		
		fastptr=fastptr.next.next;
		slowptr=slowptr.next;
		//System.out.println("fast"+slowptr.data);
		
	}
	//head=slowptr;
	if(fastptr.next!=null &&  fastptr.next.next==null){
		fastptr=fastptr.next;
	}
	
	head=slowptr.next;
	while(head!=null){
		nextnode=head.next;
		head.next=temp;
		temp=head;
		head=nextnode;
		
	}
	slowptr.next=temp;
	fastptr=slowptr.next;
	midptr=slowptr;
	slowptr=n;
	while(fastptr!=null ){
		if(fastptr.data == slowptr.data){
			fastptr=fastptr.next;
			slowptr=slowptr.next;
		}
		else{
			break;
		}
	}
		if(fastptr==null ){
			System.out.println("palindrome");
		}
		else{
			System.out.println("Not palindrome");
		}
		
//	System.out.println("k"+slowptr.data);
	

	
	

		
	}


	public static void main(String args[]){
	
		Linkedlistpalindrome n = new Linkedlistpalindrome(1);
		Linkedlistpalindrome temp=n;
		Linkedlistpalindrome te=n;
			n.next=new Linkedlistpalindrome(2);
			(n.next).next=new Linkedlistpalindrome(3);
			((n.next).next).next=new Linkedlistpalindrome(3);
			(((n.next).next).next).next=new Linkedlistpalindrome(5);
			((((n.next).next).next).next).next=new Linkedlistpalindrome(1);
			//(((((n.next).next).next).next).next).next = new Linkedlistpalindrome(1);
          Linkedlistpalindrome g= (((((n.next).next).next).next).next).next  ;
			display(temp );
			reverse(n);
			System.out.println("after reversal");
			display(n );
			
		
	}

}
