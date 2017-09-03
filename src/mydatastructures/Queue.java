/**
 * @author fritzgeraldsantos
 */

package mydatastructures;

import java.util.Arrays;

public class Queue<T> implements QueueInterface<T>{

	private T[] queue;
	private int size;
	private int total;
	private int front; 	//the first in
	private int rear;	// the last in
	
	@SuppressWarnings("unchecked")
	public Queue()
	{
		total = 0;
		size = 10;
		front = 0;
		rear = 0;
		queue = (T[]) new Object[size];
	}
	
	
	@Override
	public boolean add(T element) {
		if(isFull())
		{
			addSize();
			total++;
			queue[rear] = element;
			rear++;
			return true;
		}
		else
		{
			total++;
			queue[rear] = element;
			rear++;
			return true;
		}
	}

	@Override
	public T peek() {
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			throw new IllegalStateException();
		}
		else
			 return queue[front];
	}

	@Override
	public T remove() {
		T item = queue[front];
		total--;
		front++; //incrememnt the index so that the next item will be the next to be dequeue.
		return item;
	}

	@Override
	public boolean isFull() {
		if(size == total)
			return true;
		else 
			return false;
	}

	@Override
	public void addSize() {
		size += 2;
		queue = Arrays.copyOf(queue, size);
		
	}

	@Override
	public boolean isEmpty() {
		if(total == 0)
		{
			return true;
		}
		else 
			return false;
	}
	
	public int size()
	{
		return size;
	}

}
