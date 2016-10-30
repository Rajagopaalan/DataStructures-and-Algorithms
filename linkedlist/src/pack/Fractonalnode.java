
package pack;

import java.util.LinkedList;

public class Fractonalnode {
	
Fractonalnode next;
 int data;

	public Fractonalnode(int i) {
		// TODO Auto-generated constructor stub
		data=i;
		next=null;
	}


	

public static void reverse(Fractonalnode n,int k){
	Fractonalnode e=n;
	Fractonalnode head=n;
	while(e!=null){
		System.out.print(e.data+"->");
		e=e.next;
	}
		
Fractonalnode mod=null;
int count =1;
while(n!=null ){
	if(count%k==0){if(mod==null){mod=head;}
	else{mod=mod.next;}}
	count++;
	n=n.next;
	
}
	System.out.println("mod"+mod.data);
}

	public static void main(String args[]){
			Fractonalnode n = new Fractonalnode(0);
				n.next=new Fractonalnode(3);
			(n.next).next=new Fractonalnode(17);
			((n.next).next).next=new Fractonalnode(4);
			(((n.next).next).next).next=new Fractonalnode(6);
			//((((n.next).next).next).next).next = null;
			((((n.next).next).next).next).next=new Fractonalnode(11);
			(((((n.next).next).next).next).next).next = new Fractonalnode(12);
			((((((n.next).next).next).next).next).next).next = new Fractonalnode(19);
			(((((((n.next).next).next).next).next).next).next).next = new Fractonalnode(22);
			((((((((n.next).next).next).next).next).next).next).next).next = new Fractonalnode(24);
		//	(((((((((n.next).next).next).next).next).next).next).next).next).next = new Fractonalnode(29);
						
		
			
		  reverse(n,50);
		
			
		
	}

}
