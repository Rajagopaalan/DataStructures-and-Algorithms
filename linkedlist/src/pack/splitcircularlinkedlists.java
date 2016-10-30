package pack;


import java.util.HashMap;
import java.util.HashSet;

public class splitcircularlinkedlists{
	int data;
	splitcircularlinkedlists Next;
	public splitcircularlinkedlists (int d){
		data=d;
		Next=null;
		
		
	}
public static void findcircle(splitcircularlinkedlists li){
	splitcircularlinkedlists fptr=li;
	splitcircularlinkedlists  sptr=li;
	splitcircularlinkedlists  head2 = null;
	splitcircularlinkedlists  head1 = null;
	while(fptr.Next.Next!=li  && fptr.Next!=li){
		fptr=fptr.Next.Next;
		sptr=sptr.Next;
		
	}
	
if(fptr.Next.Next==li){
	fptr=fptr.Next ;
}

head1=li;
if(li.Next!=li){
	head2=sptr.Next ;}

fptr.Next=sptr.Next;
sptr.Next=head1;

System.out.println(head2.data);
System.out.println(head2.Next.data);
System.out.println(head2.Next.Next.data);
System.out.println(head2.Next.Next.Next.data);
System.out.println(head2.Next.Next.Next.Next.data);
System.out.println(head2.Next.Next.Next.Next.Next.data);
}
	
	public static void main(String args[]){
		splitcircularlinkedlists li = new 	splitcircularlinkedlists(5);
		splitcircularlinkedlists temp= li;
		li.Next=new  	splitcircularlinkedlists(8);
	
		(li.Next).Next=new  	splitcircularlinkedlists(9);
		((li.Next).Next).Next=new  	splitcircularlinkedlists(10);
		(((li.Next).Next).Next).Next=new  	splitcircularlinkedlists(11);
		//((((li.Next).Next).Next).Next).Next = 	new  	splitcircularlinkedlists(13);
		(((((li.Next).Next).Next).Next).Next) = temp;
		
	findcircle(li);
	//	linkedlistpairwisereverssal(li);
	}
}







