/**
 * @author fritzgeraldsantos
 */

package datastructures;

import mydatastructures.Stack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StackTest {
	
	private Stack<Integer> stack = new Stack();



	int test1 = 10;
	int test2 = 2;
	int test3 = 124;
	
	@Test
	public void testPush() {
		stack.push(test1);
		stack.push(test2);
		stack.push(test3);
		stack.push(test3);
		stack.push(test3);
		stack.push(test3);
		stack.push(test3);
		stack.push(test3);
		stack.push(test3);
		stack.push(test3);
		stack.push(8353);
		stack.push(12412);
		stack.push(325234);
	}
	
	@Test
	public void testPop()
	{
		testPush();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
	}
	
	@Test
	public void testIsEmpty()
	{
		testPush();

		System.out.println("Size: " + stack.size());
		if(stack.isEmpty())
		{
			System.out.println("Empty");
		}
		else
		{
			System.out.println("Not Empty");
		}
	}
	
	@Test
	public void testSearch()
	{
		testPush();
		System.out.println(stack.search(2));
	}

}
