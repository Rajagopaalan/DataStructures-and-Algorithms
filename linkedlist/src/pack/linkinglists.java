
package pack;

import java.util.LinkedList;

public class linkinglists {
	
linkinglists next;
 int data;

	public linkinglists(int i) {
		// TODO Auto-generated constructor stub
		data=i;
		next=null;
	}


	

public static void link(linkinglists n,linkinglists m){
	
LinkedList<linkinglists> temp=new LinkedList<linkinglists>() ;
	
	while(n!=null && m!=null){
		temp.add(n);
		temp.add(m);
		n=n.next;
		m=m.next ;
	}
	while(n!=null)
		{temp.add(n) ;
		n=n.next;}
	while(m!=null)
	{	temp.add(m) ;
	m=m.next;}
	
	
	temp.add(null);
	int i=0;
	
	while(temp.get(i)!=null){
		System.out.print(temp.get(i).data+"->");
		i++ ;
	}
}
	
	public static void main(String args[]){
			linkinglists n = new linkinglists(0);
				n.next=new linkinglists(2);
			(n.next).next=new linkinglists(4);
			((n.next).next).next=new linkinglists(6);
		(((n.next).next).next).next=new linkinglists(8);
			//((((n.next).next).next).next).next = null;
			((((n.next).next).next).next).next=new linkinglists(10);
			(((((n.next).next).next).next).next).next = new linkinglists(12);
			((((((n.next).next).next).next).next).next).next = new linkinglists(14);
			
			linkinglists m = new linkinglists(1);
			m.next=new linkinglists(3);
	//	(m.next).next=new linkinglists(5);
	//	((m.next).next).next=new linkinglists(7);
	//	(((m.next).next).next).next=new linkinglists(9);
		//((((n.next).next).next).next).next = null;
	//	((((m.next).next).next).next).next=new linkinglists(11);
	//	(((((m.next).next).next).next).next).next = new linkinglists(13);
	//	((((((m.next).next).next).next).next).next).next = new linkinglists(15);
		

		 link(n,m);
		
			
		
	}

}
