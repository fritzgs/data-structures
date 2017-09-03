/**
 * @author fritzgeraldsantos
 */

package datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

import mydatastructures.Queue;

public class QueueTest {

	private Queue<Integer> q = new Queue<>();
	
	@Test
	public void testEnqueue()
	{
		q.add(3);
		q.add(6);
		q.add(9);
		q.add(2);
		q.add(4);
		q.add(13);
		q.add(535);
		q.add(56);
		q.add(15);
	}
	
	
	@Test
	public void testDequeueAndEmpty()
	{
		q.add(123);
		q.add(1534);
		q.add(686);
		System.out.println("Is it empty? - " + q.isEmpty());

		System.out.println(q.peek()); //should be 123
		System.out.println(q.remove()); //removes 123 
		System.out.println(q.peek()); //answer should be 1534
	}
	
	@Test
	public void testCapacity()
	{
		testEnqueue(); 	// 9 total
		q.add(1000); 
		q.add(2000);	// will add more slots after this.
		q.add(3000);
		q.add(4000);
		q.add(5000);	// 14 total 
		
		System.out.println("Size: " + q.size()); //results = 14.
	}
	
	
	

}
