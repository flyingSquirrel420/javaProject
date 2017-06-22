import java.util.*;
public class ArrayBag <E> implements BagADT<E> {
	

	// *** Data Members (fields)   ***
	private E[] items;
	private int numItems;
	private static final int INIT_SIZE =100;
	
	

	@Override
	public void add(E item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		return new ArrayBagIterator<E> (items,numItems);
	}
	
	
	public static void main(String[] args) {
		BagADT<Object> myNewBag = new ArrayBag<Object>();
		Iterator<Object> itr = myNewBag.iterator();
		
	}

}
