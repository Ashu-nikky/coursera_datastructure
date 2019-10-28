package com.google;

import java.util.Iterator;

/**
 * @author Aashish
 *
 */
public class Deque implements dequeMethods
{
	private Object Deque[];
	private int capacity;
	private int size;
	private int front;
	private int rear;
	
	public Deque(){
		this.capacity=10;
		Deque= new Object[capacity];
		this.front=front;
		this.rear=rear;
		
	}
	
	public void addFirst(Object elments){
		System.out.println("INFO: Rear pointer"+ ":"+rear);
		System.out.println("INFO: Size pointer"+ ":"+size);
		System.out.println("INFO: Front pointer"+ ":"+front);
		System.out.println("INFO: Capacity pointer"+ ":"+capacity);
		for(int i=rear;i>front;i--)
		{
			Deque[i]=Deque[i-1];
		}
		Deque[front]= elments;
		rear = rear + 1;
		size = size + 1;
	}
	
	
	public void addLast(Object element){
		System.out.println("INFO: Before Adding Element Pointers");
		System.out.println("INFO: Rear:"+rear);
		System.out.println("INFO: Size:"+size);
		System.out.println("INFO: Capacity:"+capacity);
		System.out.println("INFO: Front:"+front);
		
		if( (rear == size) && (capacity == size)) {
			System.out.println("INFO: Queue Full/ Over Flow");
		}
		// Adding element to the Deqeue array and incrementing rear and size 
		Deque[rear++]= element;
		size ++;
	}

	@Override
	public Object removeLast()
	{
		if(rear == front){
			System.out.println("WARN:Deque Empty");
			return null;
		}
		else
		System.out.println("INFO: Rear pointer"+ "-"+rear);
		System.out.println("INFO: Size pointer"+ "-"+size);
		System.out.println("INFO: Front pointer"+ "-"+front);
		Object obj= Deque[size-1];
		Deque[size-1]= null;
		rear--;
		size--;
		System.out.println("INFO: Last removed element::"+ obj +" Index-"+ rear);
		return obj;
		
	}
	
	public Object removeFirst(){
		if((size == 0) && (rear == front)){
			System.out.println("INFO: Queue Empty/ Under Flow");
		}
			Object obj = Deque[0];
			for (int i = 0; i < size; i++){
				Deque[i]= Deque[i + 1];
			}
			rear--;
			size--;
			return obj;
			
	}
	public int getFront(){
		return front;
	}
	public int getSize(){
		if (rear - front >= 0){
		return rear - front;
		}
		else 
		return 0;
	}
	public int getRear(){
		if (rear >= 0 ){
		return rear;
		}
		else
			return 0;
	}
	public boolean isEmpty(){
		return (rear == front);
	}
	public int size(){
		if (size >= 0 ){
			return size;
			}
			else
				return 0;
	}
	public void alterCapacity(){
		capacity= 2*capacity;
		Object temp[] = Deque;
		Deque = new Object[capacity];
		for (int i = 0; i < temp.length; i++)
		{
			Deque[i]= temp[i];
		}
		System.out.println("INFO: Array Size Altered");
	}
	public String toString(){
		StringBuffer sb = new StringBuffer("[");
		int i=0;
		   while(i < size){
			sb.append(Deque[i]+",");   
			   i++;
		   }
		   String s1 = sb.substring(0, sb.length()-1)+"]";
		   return s1;
	  }
	public Object toArray(){
		Object temp[] = new Object[size];
		for (int i = 0; i < size; i++)
		{
			temp[i]=Deque[i];
		}
		return temp;
	}
}
