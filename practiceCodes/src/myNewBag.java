import java.util.*;
public class myNewBag {

	public static void main(String[] args) {

		IntegerBagADT myNewBags = new Bags();
		
		ArrayList<Integer> newItem = new ArrayList<Integer>();
		
		for (int i = 0; i<11; i++) {
			myNewBags.add(new ArrayList <Integer>(Arrays.asList(i)));
			
		}
		System.out.println("This is the list that you have before: ");
		myNewBags.print(myNewBags);
		//Object newObject = myNewBags.remove();
		//System.out.println(newObject);
		
//		ArrayList <Integer> removeItem = new ArrayList<Integer> ();
//		removeItem.add(3);
//		//System.out.println(removeItem);
//		Object newObject = myNewBags.remove(removeItem);
//		System.out.println(newObject); //did not return anything, type mismatch, one is of type Array and this one is of type ArrayList
		

		try{
			Object newObject = myNewBags.remove(5);
			System.out.println(newObject.toString());
			myNewBags.print(myNewBags);
		}catch (Exception e){
			System.out.println(e.getMessage());
		}

		
		
		String [] newArrayList = new String [] {"Aiden Song", "Hello World"};
		System.out.println(Arrays.toString(newArrayList));
		newArrayList[newArrayList.length -1 ] = "new item";
		System.out.println(Arrays.toString(newArrayList));
		ArrayList<String> newList = new ArrayList <>(Arrays.asList("Hello World","Hello Aiden"));
		Iterator <String> itr = newList.iterator();
				while(itr.hasNext()){
					System.out.println(itr.next());
				}
		
		
		
		
	}

}
