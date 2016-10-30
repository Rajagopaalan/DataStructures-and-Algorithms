
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


	

public static void reverse(modularnode n){
		
modularnode end=n ;
modularnode evenlist=n;
modularnode evennodes=null;
modularnode prev=n;

LinkedList<modularnode> evennos = new LinkedList();
LinkedList<modularnode> oddnos = new LinkedList();
while(end!=null){
	System.out.print(end.data+"->");
	end=end.next;
}
System.out.println("");

while(n!=null ){
		if(n.next!=null && n.next.data%2==0){
		evennos.add(n.next);
		evennodes=n.next;
	evennodes=evennodes.next ;
	n.next=n.next.next ;
	}
	else{
		oddnos.add(n);
	n=n.next;}	
}
while(evennodes!=null){
	evennodes=evennodes.next;
}
for(int x=0;x<oddnos.size();x++){
evennos.addLast(oddnos.get(x));}

for(int y=0;y<evennos.size();y++){
	System.out.print( evennos.get(y).data+ " ->");
}

	
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
		  reverse(n);
		
			
		
	}

}
