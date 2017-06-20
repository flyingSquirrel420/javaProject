import java.util.*;



public class SimpleArrayList <E> implements ListADT <E>{


	//Instance field
	private E[] items;
	private int numItems; 
	private static final int INITIAL_NUM = 10;



	//Constructor
	public SimpleArrayList (){
		this.items = (E[]) new Object [INITIAL_NUM];
		numItems = 0;

	}



	//All the override method
	
	
	
	/*
	 * Add item to the end of the list, expand the list if the list is too small. 
	 * 
	 * @param item you want to add
	 * @throws IllegalArgumentException if item is null
	 * 
	 */
	@Override
	public void add(E item) throws IllegalArgumentException {
		try{
			if(item == null){
				throw new IllegalArgumentException();
			}
			if(items.length == numItems) {
				expandArray();
			}
			items[numItems] = item;
			numItems ++;
			
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}	
	}

	

	/*
	 * Add item at position pos in the List, moving the items originally in positions pos through size()-1 one place to 
	 * the right to make room
	 * 
	 * @param pos the position at which to add the item
	 * @param item the item to add
	 * @throws IllegalArgumentException if the item is null
	 * @throws IndexOutOfBoundException if pos is less than 0
	 */
	@Override
	public void add(int pos, E item) throws IllegalArgumentException,IndexOutOfBoundsException{
		try{
			if(item == null){
				throw new IllegalArgumentException();
			}
			if(pos <= 0){
				throw new IndexOutOfBoundsException();
			}
			if(items.length == numItems){
				expandArray();
			}
			for(int i=numItems-1; i>=pos; i--){
				items[i+1] = items[i];
			}
			items[pos] = item;
			
			
		}catch(IllegalArgumentException | IndexOutOfBoundsException E){
			System.out.println(E.getMessage());
			
		}
		
	}

	/*
	 * Return true iff item is in the List(i.e., there is an item x in the List such that x.equals(item))
	 * 
	 * @parma item the item to check
	 * @return true if item is in the List, false otherwise
	 */
	@Override
	public boolean contains(E item) throws IllegalArgumentException {
		try{
			if (item == null){
				throw new IllegalArgumentException();
			}
			for(int i =0; i<items.length; i++){
				if(items[i] == null)
					throw new IllegalArgumentException();
				else if (items[i].equals(item))
					return true;
			}
		}catch (IllegalArgumentException E){
			System.out.println(E.getMessage());
		}
		return false;
	}

	
	/*
	 * This method will return the number of items in the list.
	 * 
	 * @return the number of items in the list
	 */
	@Override
	public int size() {
		return this.numItems;
	}

	/*
	 * Return true iff the list is empty
	 * 
	 * @return true if the list is empty, false otherwise
	 */
	@Override
	public boolean isEmpty() {
		return numItems == 0;
	}

	
	/*
	 * REturn the item at position pos in the List.
	 * @param pos the position of the item to return
	 * @return the item at position pos
	 * @throws IndexOutOfBoundsExceptioon if pos is less than 0 or greater than or equal to size()
	 */
	@Override
	public E get(int pos) throws IndexOutOfBoundsException {
		try{
			if(pos ==0 || pos >numItems){
				throw new IndexOutOfBoundsException();
			}
			return items[pos];
		}catch(IndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		return null;
	}

	/*
	 * Remove and return the item at position pos in the List, moving the items orginally in positions pos+1 through
	 * size() one place to the left to fill in the gap.
	 * 
	 * @param pos the position at which to remove the item
	 * @return E the item at position pos
	 * @throws IndexOutOfBoundsException if pos is less than 0 or greater than or equal to size()
	 */
	@Override
	public E remove(int pos) throws IndexOutOfBoundsException {
		try{
			if(pos == 0 || pos> numItems){
				throw new IndexOutOfBoundsException();
			}

			E temp = items[pos];
			for(int i = pos+1; i< numItems; i++){
				items[i-1] = items[i];
			}
			items[pos-1]= null;
			return temp;
		}catch(IndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		return null;
	}

	public void print (){
		for (int i=0; i<items.length; i++){
			System.out.print(items[i]);
		}
	}

	private void expandArray (){
		E [] newItems = (E[]) new Object [items.length * 2];
		for (int i =0; i<items.length;i++){
			newItems[i] = items[i];
		}
		items = newItems;
	}

}
