package com.google;

import java.util.Iterator;
import java.util.Stack;

public class Queue
{
	Stack<String> s1 = new Stack<String>();
	Stack<String> s2 = new Stack<String>();
	
	public void Enqueue(String item){
		s1.push(item);
		//System.out.println("INFO: Elements are saved successfully");
	}
	
	public String Dequeue(){
		if (!s2.isEmpty())
			s2.pop();
		else 
			s2.push(s1.pop());
		return s2.pop();
	}
	
	public static void main(String[] args)
	{
		Queue q1 = new Queue();
		q1.Enqueue("a");
		q1.Enqueue("b");
		q1.Enqueue("c");
		q1.Enqueue("d");
		//q1.Enqueue("e");
		System.out.println(q1.s1.toString());
		System.out.println(q1.Dequeue().toString());
		System.out.println(q1.s1.toString());
		System.out.println(q1.s2.toString());
		//q1.Dequeue();
		//q1.Dequeue();
		
		
		
		
	}
}
