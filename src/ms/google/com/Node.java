package ms.google.com;

public class Node
{
  private Object data;
  private Node next;
  
  
  public Node(Object data){
	  this(data,null);
  }
  
  public Node(Object data,Node n){
	  this.data=data;
	  next=n;
  }
  
  public Object getData(){
	  return this.data;
  }
  
  public Node getNext(){
	  return this.next;
  }
  
  public void setData(Object data){
	  this.data=data;
  }
  
  public void setNext(Node n){
	  this.next=n;
  }
}
