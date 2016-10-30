package pack;

public class Nodeinsert {
	
	int data;
	Nodeinsert next;
	static Nodeinsert start;
	static Nodeinsert last;
	public Nodeinsert(int x){
		data=x;
		next=null;	
		
	}

	public static void insert(int d,Nodeinsert n,Nodeinsert last){
		Nodeinsert prev = null;
	while(n!=null){
		if(n.data <d && n.next!=null){
			prev=n;
			n=n.next;
		}
		else{
			
	
			
		//	else{
		//	System.out.println(n.next);
			if(prev==null){
				
				Nodeinsert temp = new Nodeinsert(d);
				start=temp;
				temp.next=n;
			}
			/*else if(n.data==last.data){

				System.out.println("here"+n.data);
				Nodeinsert temp = new Nodeinsert(d);
				n.next=temp;
				n=n.next;
				last=temp;
			//	last=n;
			//	n.next=last;
			//	n=temp;
				

				
			}*/
			
			else{
			Nodeinsert temp = new Nodeinsert(d);
			Nodeinsert inter=prev.next;
			prev.next=temp;
			temp.next=inter;
			}
			break;
		}
	
		
	}

		
	}
	public static void display(Nodeinsert dd){
		while(dd.next!=null){
			System.out.println(dd.data);
			dd=dd.next;
		}
	}
	public static void main(String args[]){
		Nodeinsert n = new Nodeinsert(1);
	
		n.next=new Nodeinsert(2);
		(n.next).next=new Nodeinsert(3);
		((n.next).next).next=new Nodeinsert(7);
		(((n.next).next).next).next=new Nodeinsert(8);
		((((n.next).next).next).next).next=new Nodeinsert(20);
		//(((((n.next).next).next).next).next).next = new Nodeinsert(10);
		 last=((((n.next).next).next).next).next ;
		start=n;
		display(n);
		//insert(0,n,last);
	//	insert(4,n,last);
	//	insert(21,n,last);
		insert(6,n,last);
	//	insert(15,n,last);
	//	insert(-1,n,last);
		System.out.println("After insert");
		display(start);
	}
	
}
