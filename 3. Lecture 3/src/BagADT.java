import java.util.*;

/*
 * Keep in mind that an interface cannot implement another interface. In this
 * case, you are not allowed to do implements Iterator<E>. But remember Iterable
 * is a class and therefore can be extended (inherited). In the Iterable class,
 * there is a method called Iterator that you can use. 
 */
public interface BagADT<E> extends Iterable<E> {
	void add(E item);
	E remove() throws NoSuchElementException;
	boolean isEmpty();
	Iterator <E> iterator (); 
	//Iterable<E> is a class, you need to extend it.
	//YOU EITHER EXTEND A CLASS OR IMPLEMENT AN INTERFACE
	//In the iterable class, there is a method Iterator<E> that you can use, but
	//you have to declare it first. Like the line above. 

}
