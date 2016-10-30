package pack;


import java.util.HashMap;

public class linkedlistpairwisereverse_recurion{
	int data;
	linkedlistpairwisereverse_recurion Next;
	public linkedlistpairwisereverse_recurion(int d){
		data=d;
		Next=null;
		
		
	}
	public static  linkedlistpairwisereverse_recurion linkedlistpairwisereverssal(linkedlistpairwisereverse_recurion li){

		linkedlistpairwisereverse_recurion current=li;
		linkedlistpairwisereverse_recurion temp =null;
		if(li==null || li.Next ==null){return  li ;}
		
		temp = current.Next ;
		current.Next=current.Next.Next;
		temp.Next=current;
		current=temp;
		
		 current.Next.Next=linkedlistpairwisereverssal(current.Next.Next);

			//System.out.print(temp.data+" "+ current.data);
			
		

		return current;
		}
	public static void print(linkedlistpairwisereverse_recurion li){
		
		while(li !=null){
			System.out.println(li.data);
			li=li.Next;
		}
	}
	

	
	public static void main(String args[]){
		linkedlistpairwisereverse_recurion li = new linkedlistpairwisereverse_recurion(5);
		
		li.Next=new  linkedlistpairwisereverse_recurion(8);
		
		(li.Next).Next=new  linkedlistpairwisereverse_recurion(9);
		((li.Next).Next).Next=new  linkedlistpairwisereverse_recurion(10);
		(((li.Next).Next).Next).Next=new  linkedlistpairwisereverse_recurion(11);
		((((li.Next).Next).Next).Next).Next = 	new  linkedlistpairwisereverse_recurion(13);
		
	/*	linkedlistpairwisereverse_recurionlin = new linkedlistpairwisereverse(6) ;
		lin.Next=new  linkedlistpairwisereverse(7);
		(lin.Next).Next=new  linkedlistpairwisereverse(12);
		((lin.Next).Next).Next=new  linkedlistpairwisereverse(14);
		(((lin.Next).Next).Next).Next=new  linkedlistpairwisereverse(15);
		((((lin.Next).Next).Next).Next).Next =null;
		linkedlistpairwisereverse_recuriontemp= ((lin.Next).Next).Next ;
		//((((lin.Next).Next).Next).Next).Next = 	temp;*/
		linkedlistpairwisereverse_recurion st=linkedlistpairwisereverssal(li);
		print(st);
	}
}







