package pack;


import java.util.HashMap;

public class linkedlistpairwisereverse {
	int data;
	linkedlistpairwisereverse Next;
	public linkedlistpairwisereverse(int d){
		data=d;
		Next=null;
		
		
	}
	public static void linkedlistpairwisereverssal(linkedlistpairwisereverse li){
		linkedlistpairwisereverse  temp1=null;
		linkedlistpairwisereverse  temp2=null;
		linkedlistpairwisereverse  current=li ;
		
		while(current!=null && current.Next!=null){
			
		if(temp1!=null){
			temp1.Next.Next = current.Next;
		}
			temp1=current.Next;
			current.Next=current.Next.Next ;
			temp1.Next=current;
		
			if(temp2==null){
				temp2=temp1;
			}
			current=current.Next;
			
		}

	while(temp2!=null){
		System.out.println(temp2.data);
		temp2=temp2.Next;
	}
		 
	}

	
	public static void main(String args[]){
		linkedlistpairwisereverse li = new linkedlistpairwisereverse(5);
		
		li.Next=new  linkedlistpairwisereverse(8);
		
		(li.Next).Next=new  linkedlistpairwisereverse(9);
		((li.Next).Next).Next=new  linkedlistpairwisereverse(10);
		(((li.Next).Next).Next).Next=new  linkedlistpairwisereverse(11);
		((((li.Next).Next).Next).Next).Next = 	new  linkedlistpairwisereverse(13);
		
	/*	linkedlistpairwisereverse lin = new linkedlistpairwisereverse(6) ;
		lin.Next=new  linkedlistpairwisereverse(7);
		(lin.Next).Next=new  linkedlistpairwisereverse(12);
		((lin.Next).Next).Next=new  linkedlistpairwisereverse(14);
		(((lin.Next).Next).Next).Next=new  linkedlistpairwisereverse(15);
		((((lin.Next).Next).Next).Next).Next =null;
		linkedlistpairwisereverse temp= ((lin.Next).Next).Next ;
		//((((lin.Next).Next).Next).Next).Next = 	temp;*/
		linkedlistpairwisereverssal(li);
	}
}







