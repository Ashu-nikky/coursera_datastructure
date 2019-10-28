package com.google;

import java.util.Iterator;

public class dequeDriver
{
	public static void main(String[] args){
	Deque dq = new Deque();
	System.out.println("---------------------addLast ELEMENT 2-------------------------");
	dq.addLast(2);
	System.out.println("INFO:<After Adding Element at the Last");
	System.out.println("INFO: Queue Empty"+ "-"+dq.isEmpty());
	System.out.println("INFO: Size of queue"+"-"+dq.size());
	System.out.println("INFO: Front of queue"+"-"+dq.getFront());
	System.out.println("INFO: Rear of queue"+"-"+dq.getRear());
	System.out.println(dq.toString());
	System.out.println("---------------------addLast ELEMENT 4-------------------------");
	dq.addLast(4);
	System.out.println("INFO: Queue Empty"+ "-"+dq.isEmpty());
	System.out.println("INFO: Size of queue"+"-"+dq.size());
	System.out.println("INFO: Front of queue"+"-"+dq.getFront());
	System.out.println("INFO: Rear of queue"+"-"+dq.getRear());
	System.out.println(dq.toString());
	System.out.println("---------------------addLast ELEMENT 8-------------------------");
	dq.addLast(8);
	System.out.println("INFO: Queue Empty"+ "-"+dq.isEmpty());
	System.out.println("INFO: Size of queue"+"-"+dq.size());
	System.out.println("INFO: Front of queue"+"-"+dq.getFront());
	System.out.println("INFO: Rear of queue"+"-"+dq.getRear());
	System.out.println(dq.toString());
	//System.out.println(dq.toArray());
	
	System.out.println("--------------------- Remove First-------------------------");
	System.out.println("First remove :"+dq.removeFirst());
	System.out.println("Second Dequeued :"+dq.removeFirst());
	System.out.println("Third Dequeued :"+dq.removeFirst());
	System.out.println("Fourth Dequeued :"+dq.removeFirst());
	System.out.println("Queue Empty"+ "-"+dq.isEmpty());
	System.out.println("Size of queue"+"-"+dq.size());
	System.out.println("Front of queue"+"-"+dq.getFront());
	System.out.println("Rear of queue"+"-"+dq.getRear());
	System.out.println(dq.toString());

	System.out.println("--------------------- Remove from Last 8-------------------------");
	System.out.println("INFO: Last remove :"+dq.removeLast());
	System.out.println("INFO: Queue Empty"+ "-"+dq.isEmpty());
	System.out.println("INFO: Size of queue"+"-"+dq.size());
	System.out.println("INFO: Front of queue"+"-"+dq.getFront());
	System.out.println("INFO: Rear of queue"+"-"+dq.getRear());
	System.out.println(dq.toString());
	
	System.out.println("--------------------- Remove from last 4-------------------------");
	System.out.println("INFO: Last remove :"+dq.removeLast());
	System.out.println("INFO: Queue Empty"+ "-"+dq.isEmpty());
	System.out.println("INFO: Size of queue"+"-"+dq.size());
	System.out.println("INFO: Front of queue"+"-"+dq.getFront());
	System.out.println("INFO: Rear of queue"+"-"+dq.getRear());
	System.out.println(dq.toString());
	System.out.println("--------------------- Remove from last 2-------------------------");
	System.out.println("INFO: Last remove :"+dq.removeLast());
	System.out.println("INFO: Queue Empty"+ "-"+dq.isEmpty());
	System.out.println("INFO: Size of queue"+"-"+dq.size());
	System.out.println("INFO: Front of queue"+"-"+dq.getFront());
	System.out.println("INFO: Rear of queue"+"-"+dq.getRear());
	System.out.println(dq.toString());
	
	System.out.println("--------------------- Add to first -------------------------");
	dq.addFirst(10);
	dq.addFirst(11);
	System.out.println("INFO: Queue Empty"+ "-"+dq.isEmpty());
	System.out.println("INFO: Size of queue"+"-"+dq.size());
	System.out.println("INFO: Front of queue"+"-"+dq.getFront());
	System.out.println("INFO: Rear of queue"+"-"+dq.getRear());
	System.out.println(dq.toString());
	}
}