import java.util.*;
public class SimpleArrayList<E> implements ListADT {

	private E[] items;
	private int numItems;
	
	
	
	public SimpleArrayList(){
	
		this.items = (E[]) new Object[10];
		numItems = 0;
	}
	
	public int size (){
		return this.numItems;
	}
	
	public E get (int pos){
		if(pos ==0 || pos >numItems){
			throw new IndexOutOfBoundsException();
			
		}
		return items[pos];
		
	}
	
	public Iterator<E> iterator(){
		return new SimpleArrayListIterator<E>(this);
	}
	
	

	//Driver class
	public static void main(String[] args) {
		ListADT<Object> myBrandNewList = new SimpleArrayList<Object>();
		Iterator<Object> itr = myBrandNewList.iterator();
		//notice that the iterator return new SimpleArrayListIterator with the 
		//parameter this. This signals the indirect access of the list. "this" refers
		//to the current object, in this case is myBrandNewList object. 
	}

}
