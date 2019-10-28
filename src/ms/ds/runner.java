package ms.ds;

public class runner
{
	public static void main(String[] args)
	{
		Linklist ll = new Linklist();
		ll.insert("18");
		ll.insert("19");
		ll.insert("20");
		ll.insertatStart("21");
		ll.insertAt(2,22);
		ll.insertAt(0,23);
		ll.deleteAt(2);
		//ll.deleteAt(2);
		ll.show();
		
	}

}
