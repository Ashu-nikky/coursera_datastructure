package ownLList.com;

public class LinkedList{
   Node front,back;
   
   public void add(Object val){
	   Node node = new Node();
	   node.data=val;
	   node.next=null;
	   
	   if (front == null){
		   front=node;
	   }
	   else {
		   back.next=node;
		   
	   }
	   back=node;
   }
   
   public void iterator(){
	   Node node = front;
	   while(node!=null){
		   System.out.println(node.data);
		   node=node.next;
	   }
   }
}

