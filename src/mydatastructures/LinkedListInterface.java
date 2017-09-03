package mydatastructures;

//import java.util.Collection;

public interface LinkedListInterface<T> {
	
	/**
	 * 	Adds to the end of the list by default.
	 * @param item
	 * @return
	 */
	public boolean add(T item);
	
	/**
	 * Insert the item to the beginning of the list.
	 * @param item
	 */
	public void addFirst(T item);
	
	/**
	 * Insert the item to the end of the list.
	 * @param item
	 */
	public void addLast(T item);
	
	/**
	 * Removes all the elements from the list.
	 */
	public void clear();
	
	/**
	 * Returns true if the item is in the list.
	 * @param item
	 * @return
	 */
	public boolean contains(T item);
	
	/**
	 * 
	 * @param index
	 * @return the element at the specified index.
	 */
	public T get(int index);
	
	/**
	 * 
	 * @return the first element in the list.
	 */
	public T getFirst();
	
	/**
	 * 
	 * @return last element in the list.
	 */
	public T getLast();
	
	/**
	 * 
	 * @param index
	 * @return remove item from the specified position.
	 */
	public T remove(int index);
	
	/**
	 * Removes the head.
	 * @return head
	 */
	public T removeHead();
	
	/**
	 * 
	 * @return size of the list.
	 */
	public int size();
	
	
//	public void addSpecific(int index, T element);
//	
//	public boolean addAll(Collection<? extends T> collection);
//	
//	public boolean addAllSpecific(int index, Collection<? extends T> collection);

}
