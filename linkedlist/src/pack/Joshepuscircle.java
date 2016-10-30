
package pack;

public class Joshepuscircle {
	
	private Joshepuscircle next;
	private int data;

	public Joshepuscircle(int i) {
		// TODO Auto-generated constructor stub
		data=i;
		next=null;
	}
public static void josephus(Joshepuscircle li,int data){
	

	Joshepuscircle no =li;
	int count=1;
	while(no.next!=li){
		count++;
		no=no.next;
		
		
	}
	System.out.println(count);
	for(int N=count;N>1;N--){
		for(int i=1;i<data;i++){
			li=li.next;}
			li.next=li.next.next;

			//.out.println("jh"+li.data);
		
	
	}

	System.out.println(li.data);
}

	



	public static void main(String args[]){
	
		Joshepuscircle n = new Joshepuscircle(1);
		Joshepuscircle temp=n;
		Joshepuscircle te=n;
			n.next=new Joshepuscircle(2);
			(n.next).next=new Joshepuscircle(3);
			((n.next).next).next=new Joshepuscircle(4);
			(((n.next).next).next).next=new Joshepuscircle(5);
			((((n.next).next).next).next).next=new Joshepuscircle(6);
	     	(((((n.next).next).next).next).next).next = new Joshepuscircle(7);
	    	(((((n.next).next).next).next).next).next .next =temp;
			Joshepuscircle last=		(((((n.next).next).next).next).next).next;
			josephus(last,3);
		
	}

}
