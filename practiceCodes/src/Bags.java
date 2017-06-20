import java.util.*;



public class Bags implements IntegerBagADT {

	
	//Instance Field
	
	private Object [] items;
	private int numItems;
	
	//Constructor
	
	
	public Bags () {
		this.items = new Object [10];
		this.numItems = 0;
		
	}
	
	public Bags (String s){
		System.out.println(s);
	}
	
	
	//Static class
	
	/*This method will print whatever is in the bag as long as the bag is not empty */
//	public void printBag (IntegerBagADT bag){
//		while(!bag.isEmpty()){
//			System.out.println(bag.remove()); //this will destructed whatever being removed. We will come back to this and use the clone method.
//			
//		}
//			
//	}
//	
	//Instance class
	
	
	/*Add class, if an item is null, throw nullpointerexception, if the item is full, then expand it. If it's okay, then go ahead and add it. */
	
	@Override
	public void print (IntegerBagADT bag){
		
			System.out.println("There are currently " +items.length +" items in the container");
			for (int i=0; i<items.length; i++){
				System.out.print(items[i]);
			}
			System.out.println();
		
	}

	
	@Override
	public void add(Object item) throws NullPointerException {
		if (item == null){
			throw new NullPointerException("Cannot add a null item");
			
		}
		else if(items.length == numItems){
			expandArray();
		}
		
			items [numItems] = item;
			numItems ++;
	}



	/*remove an item, but if the array is empty then we want to throw a noSuchElementException */
	
	@Override
	public Object remove (int removeIndex) throws NoSuchElementException,IndexOutOfBoundsException {
		if(isEmpty()){
			throw new NoSuchElementException("There is no element here");
		}
		if (removeIndex >= numItems){
			throw new IndexOutOfBoundsException("Index Out of bound");
		}
		Object temp = items.clone();
		System.out.println(temp);
		items[removeIndex] = null;
		return temp;
	}



	@Override
	public boolean isEmpty() {
		return numItems <= 0;
	}

	
	

	public void expandArray (){
		Object [] newItems = new Object [items.length * 2];
		for (int i =0; i<items.length;i++){
			newItems[i] = items[i];
		}
		items = newItems;

	}


//	@Override
//	public String toString(){
//		for (int i = 0; i<items.length; i++){
//			return "" + items[i];
//		}
//		return "";
//		
//	}

	
}
