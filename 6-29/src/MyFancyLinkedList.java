import java.util.*;
public class MyFancyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("My original list: ");
//		ListADT fancyLinked = new LinkedList(new Listnode<String>("Hello Aiden",new 
//				Listnode<String>("Hello Bob")));
//		fancyLinked.print();
//		System.out.println();
		//This method perform add to the end of the list
		ListADT fancyLinked = new LinkedList();
		System.out.println("List after I performed add:");
		fancyLinked.add("Hello Aiden");
		fancyLinked.add("Hello Bob");
		fancyLinked.add("Hello Cindy");
		fancyLinked.add("Hello David");
		fancyLinked.add("Hello Emily");
		fancyLinked.print();
		System.out.println(fancyLinked.size());
		System.out.println();
		
		//Perform removed Method
		System.out.println("After removed: ");
		System.out.println("Trying to remove the third item " + fancyLinked.remove(3));
		System.out.println("Trying to remove the second item " +fancyLinked.remove(2));
		fancyLinked.print();
		System.out.println();
		
		//Perform get method
		System.out.println("trying to get the FIRST element in the list "+ fancyLinked.get(1));
		System.out.println("trying to get the SECOND element in the list "+ fancyLinked.get(2));
		System.out.println("trying to get the THIRD element in the list " + fancyLinked.get(3));
		System.out.print("My list: ");fancyLinked.print();
		System.out.println();
		
		//Perform isEmpty() method
		System.out.println("Is fancyLinked list empty? "+ fancyLinked.isEmpty());
		ListADT EmptyLinked = new LinkedList();
		System.out.println("Is EmptyLinked empty? " + EmptyLinked.isEmpty());
		System.out.println(fancyLinked.size());
		
		
		//Testing contains method
		System.out.print("My list: ");fancyLinked.print();
		System.out.println("Is Hello David in the List? "+ fancyLinked.contains("Hello David"));
		System.out.println("Is Hello Emily in the list? "+ fancyLinked.contains("Hello Emily"));
		System.out.println("Is Hello Aiden in the List? "+ fancyLinked.contains("Hello Aiden"));
		System.out.println("Is Hello Zeo in the List? "+ fancyLinked.contains("Hello Zeo"));
		System.out.println();
		
		
		//testing add item at position
		System.out.print("My list: ");fancyLinked.print();
		fancyLinked.add(4,"Hello Frank");
		fancyLinked.print();
		fancyLinked.add(2,"Hello Bob");
		fancyLinked.print();
		 fancyLinked.add(3,"Hello Cindy");
		 fancyLinked.print();
		fancyLinked.add(7,"hello Gabby");
		fancyLinked.print();
		System.out.println("The size of the list is now " +fancyLinked.size());
		
		
		
		
		
		
	}

}
