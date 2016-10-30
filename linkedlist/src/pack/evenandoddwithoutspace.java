
package pack;

import java.util.LinkedList;

public class evenandoddwithoutspace {
	
evenandoddwithoutspace next;
 int data;

	public evenandoddwithoutspace(int i) {
		// TODO Auto-generated constructor stub
		data=i;
		next=null;
	}


	

public static void reverse(evenandoddwithoutspace n){
		
	evenandoddwithoutspace end=n ;

	evenandoddwithoutspace prev=n;
	evenandoddwithoutspace curr=prev.next;
	evenandoddwithoutspace head=n;
	evenandoddwithoutspace nbefore=n;
	
	System.out.println("before " );
	while(nbefore!=null){
		System.out.print(nbefore.data+"-> ");
		nbefore=nbefore.next;
	}
		
	

while(end.next!=null){
	end=end.next;}
evenandoddwithoutspace endinitial=end;
if(head.data%2==0){
	
}
while(head.data%2!=0){
	end.next=head;
	head=head.next ;
	prev=head;
	curr=prev.next;
	n=head;
	end.next.next=null;
	end=end.next;
	
}
while(curr!=endinitial){

	if(curr.data%2!=0 ){
		
prev.next=curr.next;
end.next=curr;
end.next.next=null;
end=end.next;
curr=prev.next;

	

	}
	else {
   curr= curr.next;
   prev=prev.next;
	
	}


}

System.out.println("");

System.out.println("after " );
while(n!=null){
	System.out.print(n.data+"-> ");
	n=n.next;
}
	
}

	public static void main(String args[]){
			evenandoddwithoutspace n = new evenandoddwithoutspace(0);
				n.next=new evenandoddwithoutspace(2);
			(n.next).next=new evenandoddwithoutspace(7);
			((n.next).next).next=new evenandoddwithoutspace(8);
			(((n.next).next).next).next=new evenandoddwithoutspace(9);
			//((((n.next).next).next).next).next = null;
			((((n.next).next).next).next).next=new evenandoddwithoutspace(18);
			(((((n.next).next).next).next).next).next = new evenandoddwithoutspace(17);
			((((((n.next).next).next).next).next).next).next = new evenandoddwithoutspace(19);
		

		  reverse(n);
		
			
		
	}

}
