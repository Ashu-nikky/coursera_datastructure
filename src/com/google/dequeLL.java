package com.google;

import java.util.Iterator;

/**
 * Implementation of a deque, double-ended queue
 * Supports inserting and removing items from either front or back
 *
 * Node first   always has prev = null
 * Node last    always has next = null
 */

public class dequeLL<Item> implements Iterable<Item>
{
	private Node first;
	private Node last;
	private int numberOfItems;
	
	 /**
     * private inner Node class
     * Has next and prev pointers to 
     * implement constant worst time operations
     */
	private class Node{
		private Item item;
		private Node next;
		private Node prev;
		
		public Node(Item item)
		{
			this.item=item;
			this.next=null;
			this.prev=null;
		}
		
	}
	
	 /**
     * private inner class that defines the DequeIterator
     * and implements hasNext(), remove() and next()
     */
	
	private class DequeIterator implements Iterator<Item>{
		private Node current;

		
		public DequeIterator()
		{
			this.current=first;
		}
		@Override
		public boolean hasNext()
		{
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Item next()
		{
			// TODO Auto-generated method stub
			return null;
		}
		
		
	}
	public dequeLL()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public Iterator<Item> iterator()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
