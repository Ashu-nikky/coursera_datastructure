package ownStack.com;

public class Stack
{
   private Object elements[];
   private int capacity;
   private int size;
   
   public Stack()
   {
	this.capacity=10;
	elements=new Object[capacity];
   }
   
   public void add(Object obj){
	   if(capacity == size){
		   alterCapacity();
	   }
	   elements[size++]=obj;
   }
   private void alterCapacity()
   {
	   capacity = 2*capacity;
	   Object temp = new Object[capacity];
	   for (Object object : elements)
	   {
		temp=elements;
	   }
   }
   public int size(){
	   return size;
   }
   //function is not known
   public Object process()
   {
	 if(size == 0)
	 {
		 throw new IndexOutOfBoundsException("INFO:no element available");
	 }
	 System.out.println(size);
	 Object obj = elements[--size];
	 elements[size]=null;
	 return obj;
   }
   
   public Object[] toArray()
   {
	   Object temp[]= new Object[size];
	   for (int i = 0; i < size; i++)
	{
		temp[i]=elements[i];
	}
	   return temp;
   }
   
   public String toString(){
	   StringBuffer sb = new StringBuffer("[");
	   for (int i = 0; i < size; i++)
	{
		sb.append(elements[i]+",");
		
	}
	   String S1 = sb.substring(0,sb.length()-1) + "]";
	   return S1;
   }
   
}// end of stack class
