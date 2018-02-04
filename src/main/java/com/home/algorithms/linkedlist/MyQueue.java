package com.home.algorithms.linkedlist;

public class MyQueue<T> {
	
	class LLNode<T>{
		private T data;
		private LLNode<T> next;
		
		public LLNode(T data){
			this.data = data;
		}
	}
	private LLNode<T> front,rear;
	public void enqueue(T item){
		LLNode<T> newnode = new LLNode<T>(item);
		if(front ==null){
			front = newnode;
			rear = front;
			return;
		}
		rear.next = newnode;
		rear = newnode;				
	}
	
	public T dequeue(){
		if(front == null){
			System.out.println("NTR");
			throw new RuntimeException();
		}
		T returnvalue = front.data;
		front=front.next;
		if(front == null){
			rear = null;
		}
		return returnvalue;
	}
	public T poll(){
		return front.data;
	}
	
	public static void main(String args[]){
		MyQueue<Integer> queue = new MyQueue<Integer>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		System.out.println("item =>"+queue.dequeue());
		System.out.println("item =>"+queue.poll());
	}

}
