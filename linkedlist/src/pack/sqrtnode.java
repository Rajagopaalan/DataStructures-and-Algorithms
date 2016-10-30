
package pack;

import java.util.LinkedList;

public class sqrtnode {
	
sqrtnode next;
 int data;

	public sqrtnode(int i) {
		// TODO Auto-generated constructor stub
		data=i;
		next=null;
	}


	

public static void reverse(sqrtnode n){
	sqrtnode e=n;
	sqrtnode head=n;
	while(e!=null){
		System.out.print(e.data+"->");
		e=e.next;
	}
		
sqrtnode sqrt=null;
int count =1;
int i=1;
int j=1;
while(n!=null ){
	if(i==j*j){if(sqrt==null){sqrt=head;}
	else{sqrt=sqrt.next;}
	j++;}
	i++;
	n=n.next;
	
}
	System.out.println("mod"+sqrt.data);
}

	public static void main(String args[]){
			sqrtnode n = new sqrtnode(0);
				n.next=new sqrtnode(3);
			(n.next).next=new sqrtnode(17);
			((n.next).next).next=new sqrtnode(4);
			(((n.next).next).next).next=new sqrtnode(6);
			//((((n.next).next).next).next).next = null;
			((((n.next).next).next).next).next=new sqrtnode(11);
			(((((n.next).next).next).next).next).next = new sqrtnode(12);
			((((((n.next).next).next).next).next).next).next = new sqrtnode(19);
		//	(((((((n.next).next).next).next).next).next).next).next = new sqrtnode(22);
		//	((((((((n.next).next).next).next).next).next).next).next).next = new sqrtnode(24);
		//	(((((((((n.next).next).next).next).next).next).next).next).next).next = new sqrtnode(29);
						
		
			
		  reverse(n);
		
			
		
	}

}
