import java.util.*;


public interface IntegerBagADT {

	public void add(Object item) throws NullPointerException; //if a method is not public 
	
	public Object remove (int removeIndex) throws NoSuchElementException;
	
	public boolean isEmpty() ;
	
	public void print (IntegerBagADT bag);
	
}
