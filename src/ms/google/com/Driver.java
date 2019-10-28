package ms.google.com;

public class Driver
{
	public static void main(String arg[]){
		Linklist ll = new Linklist();
		ll.insert("10");
		ll.insert("11");
		ll.insert("12");
		ll.insert("13");
		ll.insertAt(3, "15");
		ll.insertAtFirst("14");
		ll.show();
		ll.deleteAt(2);
		System.out.println("INFO:After Delete");
		ll.show();
	}

}
