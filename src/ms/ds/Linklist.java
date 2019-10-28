package ms.ds;

public class Linklist 
{
	Node head;

	public void insert(Object data){
		Node node = new Node();
		node.data=data;
		node.next=null;

		if(head== null)
		{
			head = node;
		}
		else 
		{
			Node n = head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next = node;
		}
	}
	
	
	public void deleteAt(int index){
		
		if(index == 0){
			head=head.next;
		}
		
		else {
			Node n = head;
			for(int i=0; i<index-1; i++){
				n=n.next;
			}
			Node n1 = n.next;
			n.next=n1.next;
			//System.out.println("INFO:Deleted Data at index "+index+"-"+n1.data);
			n1=null;
		}
		
	}
	public void insertatStart(Object data){
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		node.next=head;
		head = node;
	}
	
	public void insertAt(int index,Object data){
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		if(index == 0){
		 insertatStart(data);	
		}
		
		else{
		Node n = head;
		for(int i=0; i<index-1; i++){
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
		}
	}

	public void show(){

		Node n = head;
		while(n.next!=null)
		{
			System.out.println(n.data);
			n=n.next;

		}
	}
}