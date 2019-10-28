package com.google;

import java.util.NoSuchElementException;
import java.util.Stack;

public class Queue1
{
	static Stack<Integer> mainStack = new Stack<Integer>();
	static Stack<Integer> auxillaryStack = new Stack<Integer>();
	static Stack<Integer> getMax = new Stack<Integer>();
	static Stack<Integer> getMin = new Stack<Integer>();
	
	static void Enqueue(Integer item){
		mainStack.push(item);
		if (mainStack.size() == 1){
			getMax.push(item);
			getMin.push(item);
			return;
		}
		
		if (item > getMax.peek()){
			getMax.push(item);
		} 
		else if (item < getMin.peek()){
			getMin.push(item);
		}
		else {
			getMax.push(getMax.peek());
			getMin.push(getMin.peek());
		}
			
	}
	
	static int getMax(){
		if (getMax.isEmpty()) throw new NoSuchElementException("INFO: No Elements Found Stack is empty");
		else
		return getMax.peek();
		}
	
	static int getMin(){
		if (getMin.isEmpty()) throw new NoSuchElementException("INFO: No Elements Found Stack is empty");
		else
		return getMin.peek();
		}
	
	static int size(){
		return mainStack.size() + auxillaryStack.size();
	}
	
	static boolean isEmpty(){
		return mainStack.isEmpty() && auxillaryStack.isEmpty();
	}
	
	static Integer Dequeue(){
		if (!auxillaryStack.isEmpty())
			auxillaryStack.pop();
		else 
			auxillaryStack.push(mainStack.pop());
		return auxillaryStack.pop();
	}
	
	public static void main(String[] args)
	{
		System.out.println(Queue1.isEmpty());
		System.out.println(Queue1.size());
		//System.out.println(Queue1.getMin());
		//System.out.println(Queue1.getMax());
		// Expected output true,0,0,0
		Queue1.Enqueue(2);
		System.out.println(Queue1.isEmpty());
		System.out.println(Queue1.size());
		System.out.println(Queue1.getMin());
		System.out.println(Queue1.getMax());
		Queue1.Enqueue(4);
		System.out.println(Queue1.isEmpty());
		System.out.println(Queue1.size());
		System.out.println(Queue1.getMin());
		System.out.println(Queue1.getMax());
		Queue1.Enqueue(1);
		System.out.println(Queue1.isEmpty());
		System.out.println(Queue1.size());
		System.out.println(Queue1.getMin());
		System.out.println(Queue1.getMax());
		Queue1.Enqueue(10);
		System.out.println(Queue1.isEmpty());
		System.out.println(Queue1.size());
		System.out.println(Queue1.getMin());
		System.out.println(Queue1.getMax());
		Queue1.Enqueue(8);
		System.out.println(Queue1.isEmpty());
		System.out.println(Queue1.size());
		System.out.println(Queue1.getMin());
		System.out.println(Queue1.getMax());
	}
}
											