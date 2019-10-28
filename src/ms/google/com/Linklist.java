package ms.google.com;

public class Linklist
{
    private Node head;
    
    public Linklist()
	{
		head=null;
	}
    
    public void setHead(Node n){
    	head=n;
    }
    
    public Node getHead(){
    	return head;
    }
    
    public void insert(Object obj){
    Node node = new Node(obj);
    node.setNext(null);
    
    if(getHead()==null){
    	setHead(node);
    }
    else {
    	Node n = getHead();
    	while(n.getNext()!=null){
    		n=n.getNext();
    	}
    	n.setNext(node);
    	}
    }
    
    public void insertAtFirst( Object obj){
        Node node = new Node(obj);
        node.setNext(null);
        node.setNext(getHead());
        setHead(node);
    }
    
    public void insertAt(int index, Object obj){
    	if( index ==0)
    	{
    		insertAtFirst(obj);
    	}
    	else{
    	Node node = new Node(obj);
    	node.setNext(null);
    	Node n = getHead();
    	for(int i=0;i<index-1;i++){
    		n=n.getNext();
    	}
    	node.setNext(n.getNext());
    	n.setNext(node);
    	}
    }
    
    public void deleteAt(int index){
    	if( index== 0){
    		setHead(getHead().getNext());
    	}
    	else {
    		
    		Node n = getHead();
    		for(int i = 0; i< index-1; i++){
    			n=n.getNext();
    		}
    		Node n1 = n.getNext();
    		 n.setNext(n1.getNext());
    		 n1=null;
    	}
    	
    }
    
    public void show(){
    	Node n = getHead();
    	while(n.getNext()!=null){
    		System.out.println(n.getData());
    		n=n.getNext();
    	}
    		System.out.println(n.getData());
    }
    
}
