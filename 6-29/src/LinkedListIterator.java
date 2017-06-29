import java.util.*;


public class LinkedListIterator<E> implements Iterator<E> {
	private Listnode<E> curr;
	
	
	public LinkedListIterator(Listnode<E> head){
		this.curr = head;
	}
	
	@Override
	public boolean hasNext() {
		return curr!=null;
	}

	@Override
	public E next() {
		if (curr== null) throw new NoSuchElementException();
		E item = curr.getData();
		curr = curr.getNext();
		return item;
	}
	
	@Override
	public void remove(){
		throw new UnsupportedOperationException(); //this is an uncheck exception
	}

}
