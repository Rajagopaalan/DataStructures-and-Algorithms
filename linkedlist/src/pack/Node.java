package pack;
import java.io.*;

class Node{
    
    Node next=null;
    Node head=null;
    int data;
 /* public Node(int d){
        data=d;}
  */
        public void insertnode(int d){
        	
            Node end = new Node(d);
            Node n=this;
            if(head==null){
        		head.next=end;
        	}
            while(n.next!=null){
                n=n.next;
            }
            n.next=end;
        }
  public void printelements(){
	  Node n = null;
	  n=head;
	  while(n.next!=null){
		  System.out.println(n.data);
	  }
  }
        
    
    public static void main(String args[]){
     //   Node n = new Node(5);
    	Node n  = new Node(5);
        //n.insertnode(6);
        
        
    }
}