package pack;

public class Nodes {
	int data;
	Nodes next;
	boolean isvisited;
	public  Nodes(int d){
		data=d;
		isvisited = false;
		next = null;
	}
	public static void display(Nodes n){
		int terminate=1;
		//while(terminate==1){
		//while(n.isvisited!=true)
		while(n!=null){
			if(n.isvisited==true){
				System.out.println("loop exists");
				break;}
			else{
			System.out.println(n.data);
		
		
			n.isvisited =true;
			n=n.next ;}
			}
		}
//		terminate=0;
		
	//	}
	//	System.out.println(n.data);
		
	
	public static void main(String args[]){
		Nodes n = new Nodes(5);
		n.next=new Nodes(6);
		Nodes temp=n.next;
		
		(n.next).next=new Nodes(7);	
		((n.next).next).next=new Nodes(8);
		(((n.next).next).next).next=temp ;
		display(n);
	}

}
