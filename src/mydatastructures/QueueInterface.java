/**
 * @author fritzgeraldsantos
 */

package mydatastructures;

public interface QueueInterface<T> {
	
	/**
	 * 
	 * @param element
	 * @return true if added successfully, else return IllegalStateException if no space is available.
	 */
	public boolean add(T element);
	
	/**
	 * 
	 * @return rear but does not remove, else null if the queue is empty.
	 */
	public T peek();
	
	/**
	 * 
	 * @return rear/head of queue 
	 */ 
	public T remove(); 
	
	/**
	 * 
	 * @return true if the queue is full, else false.
	 */
	public boolean isFull();
	
	/**
	 * adds to the size of the queue by 1.
	 */
	public void addSize();
	
	/**
	 * 
	 * @return true if the queue is empty, else false.
	 */
	public boolean isEmpty();

}
