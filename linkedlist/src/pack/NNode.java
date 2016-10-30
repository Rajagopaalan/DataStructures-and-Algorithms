package pack;
import java.util.*;


public class NNode {
	int data;
	NNode next ;
	public NNode(int i) {
		data =i;
		next=null;
		// TODO Auto-generated constructor stub
	}

public static void display(NNode n,int no){
	
	HashMap<Integer,NNode> addr= new HashMap<Integer,NNode>();
	int count=0;
	NNode m=n;
	while(n.next!=null){
  
   count+=1;
   addr.put(count, n);
		n=n.next;
	}
	if(count==0){System.out.println("Linkedlist desnot exits");
		
	
		}
	if(count<no){System.out.println("Node does not exist");}
	System.out.println(count-no+1);
	int c=count-no+1;
	int x=1;
	while(x<c){m=m.next;
	x++;
	}
	System.out.println("d"+m.data);
	
}
public static void dispdata(NNode n){System.out.println(n.data);}
public static void disp(NNode n,int x) {
	// TODO Auto-generated method stub
	NNode temp1=n;
	NNode temp2=n;


	try{
	for(int s=1;s<x;s++){

		if(temp1.next!=null)
		{temp1=temp1.next;
	
		
		}
		
		
	}
	while(temp1.next!=null){
		//temp2=temp2.next;
		temp2=temp2.next;
		temp1=temp1.next;
	//	n=n.next ;
	}
	System.out.println(temp2.data);
	
	
}
	catch(Exception e){e.printStackTrace();}
	}

	
	public static void main(String args[]){
		NNode n = new NNode(5);
		NNode temp=n;
		NNode te=n;
		n.next=new NNode(1);
		(n.next).next=new NNode(17);
		((n.next).next).next=new NNode(4);
		(((n.next).next).next).next=new NNode(9);
		((((n.next).next).next).next).next=new NNode(10);
		(((((n.next).next).next).next).next).next = new NNode(12);
		//display(temp,1);
		disp(te,4);
		
		
	}

	
	
	
}
