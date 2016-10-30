
package pack;

import java.util.LinkedList;

public class modularnode {
	
modularnode next;
 int data;

	public modularnode(int i) {
		// TODO Auto-generated constructor stub
		data=i;
		next=null;
	}


	

public static void reverse(modularnode n,int k){
	modularnode e=n;
	while(e!=null){
		System.out.print(e.data+"->");
		e=e.next;
	}
		
modularnode mod=n;
int count =1;
while(n!=null ){
	if(count%k==0){mod=n;}
	count++;
	n=n.next;
	
}
	System.out.println("mod"+mod.data);
}

	public static void main(String args[]){
			modularnode n = new modularnode(0);
				n.next=new modularnode(3);
			(n.next).next=new modularnode(17);
			((n.next).next).next=new modularnode(4);
			(((n.next).next).next).next=new modularnode(6);
			//((((n.next).next).next).next).next = null;
			((((n.next).next).next).next).next=new modularnode(11);
			(((((n.next).next).next).next).next).next = new modularnode(12);
			((((((n.next).next).next).next).next).next).next = new modularnode(19);
			(((((((n.next).next).next).next).next).next).next).next = new modularnode(22);
			((((((((n.next).next).next).next).next).next).next).next).next = new modularnode(24);
			(((((((((n.next).next).next).next).next).next).next).next).next).next = new modularnode(29);
						
		
			
		  reverse(n,5);
		
			
		
	}

}
