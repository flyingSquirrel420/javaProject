import java.util.*;


public class SimpleArrayListIterator <E> implements Iterator<E>{
	
	private SimpleArrayList<E> myList; //this signaling that we are access it indirectly
	private int currPos;
	
	public SimpleArrayListIterator(SimpleArrayList<E> theirCurrentListObject){
		this.myList = theirCurrentListObject; //myList is now has a copy of their list, but I 
		//am not risking myself of changing the content of their list, everything is safe.
		this.currPos = 0;
	}
	

	@Override
	public boolean hasNext() {
		return currPos < myList.size();
	}

	@Override
	public E next() {
		if(!hasNext()){
			throw new NoSuchElementException();
		}
		E item = myList.get(currPos); //if it has an item, then we could get it first.
		currPos++; //then we increment the currentPosition. The pointer is now points to the next item in the list.
		return item;
	}
	
	public void remove(){
		throw new UnsupportedOperationException();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
