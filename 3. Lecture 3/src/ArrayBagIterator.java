import java.util.*;
public class ArrayBagIterator <E> implements Iterator<E> {

	
	//Instance field
	private int numItems;
	private E[] items;//this two signals that we are using direct access of the iterator.
	private int currPos; 

	
	public ArrayBagIterator (E[]items, int numItems) {
		this.items = items;
		this.numItems = numItems;
		this.currPos = 0;
	}
	
	
	@Override
	public boolean hasNext() {
		return currPos < numItems;
	}

	@Override
	public E next() {
		if(!hasNext()){
			throw new NoSuchElementException();
		}
		return items[currPos++];
		}

	@Override
	public void remove(){
		throw new UnsupportedOperationException();
	}
}
