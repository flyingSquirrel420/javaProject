/*
 * A list is a general container storing a contiguous collection of items, that is position-oriented using zero-based indexing 
 * and where duplicates are allowed.
 * 
 */


public interface ListADT <E> {

	
	void add (E item) throws IllegalArgumentException ; //add at the end of the list
	void add (int pos, E item) throws IllegalArgumentException,IndexOutOfBoundsException; //insert item at position pos, shift the rest of list to the right
	boolean contains (E item) throws IllegalArgumentException;//return true if item is in the list
	int size();  //return the size of the list
	boolean isEmpty(); //return true if list has 0 item
	E get(int pos) throws IndexOutOfBoundsException; //return type E
	E remove(int pos) throws IndexOutOfBoundsException;
	void print();
	
}
