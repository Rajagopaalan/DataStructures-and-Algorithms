
package pack;

import java.util.LinkedList;
import java.util.Stack;

public class additionoflinkedlists {
	
additionoflinkedlists next;
 int data;

	public additionoflinkedlists(int i) {
		// TODO Auto-generated constructor stub
		data=i;
		next=null;
	}


	

public static void add(additionoflinkedlists n,additionoflinkedlists m){
	Stack<Integer> st = new 	Stack<Integer>();
	Stack<Integer> stk = new 	Stack<Integer>();
	Stack<Integer> res = new 	Stack<Integer>();
	LinkedList<Integer> li =new LinkedList<Integer>();
	
	additionoflinkedlists nt=n;
	additionoflinkedlists mt=m;
	
	
	while(n!=null){
		st.push(n.data);
		n=n.next;
		
	}
	//System.out.println(st.pop());
	while(m!=null){
		stk.push(m.data);
		m=m.next;
		
	}
	int sum=0;
	int carry=0;
	while(!st.isEmpty() && !stk.isEmpty()){
		sum =  carry+  st.pop() + stk.pop() ;
	//	if(sum <10){carry=0;}
	//	else{carry=1 ;}
		 carry=sum/10;
		sum=sum%10;
		res.push(sum) ;
		
	}
	while(!stk.isEmpty()){
		sum=carry+stk.pop() ;
		carry=0;
		res.push(sum);
	}
	while(!st.isEmpty()){
		sum=carry+st.pop() ;
		carry=0;
		res.push(sum);
	}
	
	while(!res.isEmpty()){
		li.add(res.pop());
	}
	//int i=0;

	while(mt!=null){
		System.out.print(mt.data+"->");
		mt=mt.next;
	}
	System.out.println("");
	while(nt!=null){
		System.out.print(nt.data+"->");
		nt=nt.next;
	}
	System.out.println("");
	for(int i=0;i<li.size();i++){
		System.out.print(li.get(i)+"->");
	
	}
}

	public static void main(String args[]){
			additionoflinkedlists n = new additionoflinkedlists(1);
		n.next=new additionoflinkedlists(2);
			(n.next).next=new additionoflinkedlists(3);
			((n.next).next).next=new additionoflinkedlists(5);
			(((n.next).next).next).next=new additionoflinkedlists(6);
			//((((n.next).next).next).next).next = null;
			((((n.next).next).next).next).next=new additionoflinkedlists(7);
			(((((n.next).next).next).next).next).next = new additionoflinkedlists(8);
			((((((n.next).next).next).next).next).next).next = new additionoflinkedlists(9);
			(((((((n.next).next).next).next).next).next).next).next = new additionoflinkedlists(2);
			((((((((n.next).next).next).next).next).next).next).next).next = new additionoflinkedlists(3);
			(((((((((n.next).next).next).next).next).next).next).next).next).next = new additionoflinkedlists(1);
			
			additionoflinkedlists m = new additionoflinkedlists(2);
			m.next=new additionoflinkedlists(3);
	(m.next).next=new additionoflinkedlists(5);
		((m.next).next).next=new additionoflinkedlists(4);
		(((m.next).next).next).next=new additionoflinkedlists(6);
		//((((n.next).next).next).next).next = null;
		((((m.next).next).next).next).next=new additionoflinkedlists(7);
		(((((m.next).next).next).next).next).next = new additionoflinkedlists(8);
		((((((m.next).next).next).next).next).next).next = new additionoflinkedlists(9);
		(((((((m.next).next).next).next).next).next).next).next = new additionoflinkedlists(2);
		((((((((m.next).next).next).next).next).next).next).next).next = new additionoflinkedlists(4);
		(((((((((m.next).next).next).next).next).next).next).next).next).next = new additionoflinkedlists(9);
						
		
			
		  add(n,m);
		
			
		
	}

}
