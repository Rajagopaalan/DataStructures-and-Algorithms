
package pack;

import java.util.LinkedList;

public class evenandodd {
	
evenandodd next;
 int data;

	public evenandodd(int i) {
		// TODO Auto-generated constructor stub
		data=i;
		next=null;
	}


	

public static void reverse(evenandodd n){
		
evenandodd end=n ;
evenandodd evenlist=n;
evenandodd evennodes=null;
evenandodd prev=n;

LinkedList<evenandodd> evennos = new LinkedList();
LinkedList<evenandodd> oddnos = new LinkedList();
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
			evenandodd n = new evenandodd(0);
				n.next=new evenandodd(3);
			(n.next).next=new evenandodd(17);
			((n.next).next).next=new evenandodd(4);
			(((n.next).next).next).next=new evenandodd(6);
			//((((n.next).next).next).next).next = null;
			((((n.next).next).next).next).next=new evenandodd(11);
			(((((n.next).next).next).next).next).next = new evenandodd(12);
			((((((n.next).next).next).next).next).next).next = new evenandodd(19);
		  reverse(n);
		
			
		
	}

}
