
import java.util.*;


public class List101 {

	public Object items;
	public int numItems;
	private static final int INTSIZE = 10;
	
	public List101 () {
		numItems = 0;
		items = new Object [INTSIZE];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	}

	
	private void expandArray() {
		if (numItems != 0) {
		Object [] newArray = new Object [numItems *2];
		}
		else{
		Object [] newArray = new Object [1];
		}
		
	}
	
	
		
}
