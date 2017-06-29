import java.util.*;
import java.lang.*;
import java.io.*;



public class Homework2<E> {

	private static boolean condForEx1 = true;
	private static boolean condForEx2 = false;
	private static boolean condForEx3 = true;


	public static <E> void main(String[] args) throws Ex2 {
		// TODO Auto-generated method stub

		//The following codes create a new file for us to use 
		//		File file = new File("homework#1.txt");
		//		try{
		//			PrintWriter pr = new PrintWriter(file);
		//			pr.println("Hello World");
		//			pr.println("Hello Aiden");
		//			pr.close();  //DONT FORGET TO CLOSE YOUR FILE!
		//		}catch(FileNotFoundException e){
		//			System.out.println("Cannot find such file");
		//		}catch(IOException e){
		//			System.out.println(e.getMessage());
		//		}
		//		
		//		
		//		try {
		//			Scanner scr = new Scanner(file);
		//			while(scr.hasNext()){
		//				System.out.print(scr.next() +"\n");
		//			}
		//		} catch (FileNotFoundException e) {
		//			e.printStackTrace();
		//		} catch(NoSuchElementException e){
		//			
		//		}


		/*Homework question #1
		System.out.println("main begins");
		try {
			a();
			b();
		} catch (Ex1 ex) {
			System.out.println("main caught Ex1");
		} catch (Ex3 ex) {
			System.out.println("main caught Ex3");
		}finally {
			System.out.println("main finally");
		}
		System.out.println("main completes");
	}


	private static void a() {
		System.out.println("a begins");
		try {
			if (condForEx1) {
				b();
			} else {
				throw new Ex1();
			}
		} catch (Ex2 ex) {
			System.out.println("a caught Ex2");
		}
		System.out.println("a completes");
	}


	private static void b() throws Ex2{
		System.out.println("b begins");
		try {
			if (condForEx2) throw new Ex2();
			if (condForEx3) throw new Ex3();
		} catch (Ex3 ex) {
			System.out.println("b caught ex3");
		} finally {
			System.out.println("b finally");
		}
		System.out.println("b completes");

	}
// */
		//	public static <E> boolean secret(Listnode <E> chain1, Listnode<E> chain2) {
		//
		//		while(chain1 != null && chain2 != null) {
		//			if(chain1.getData().equals(chain2.getData())){
		//				chain1 = chain1.getNext();
		//				chain2 = chain2.getNext();
		//			}
		//			else return false;
		//		}
		//
		//		if(chain1 == null && chain2 == null) return true;
		//
		//		return false;
		//
		//	}


//
//		public static void main(String[] args){
//			Integer [] data1 = {33,22,11};
//			Integer [] data2 = {33,22,11};
//
////			Listnode<Integer[]> chain1 =  new Listnode<> (data1);
////			Listnode<Integer[]> chain2 = new Listnode<> (data2);
//			Listnode<Integer> chain1 = new Listnode<>(33,new Listnode<Integer>
//			(22,new Listnode<Integer>(11,null)));
//			Listnode<Integer> chain2 = new Listnode<>(11,new Listnode<Integer>
//			(22,new Listnode<Integer>(33,null)));
//			Listnode<Integer> chain3 = new Listnode<>(null);
//			Listnode<String> chain4 = new Listnode<>("hello", new Listnode<String>("from", new
//					Listnode<String>("the", new Listnode<String>("outside"))));
//			Listnode<String> chain5 = new Listnode<>("hello", new Listnode<String>("from", new
//					Listnode<String>("the", new Listnode<String>("outside"))));
//					
//			
//			System.out.println(secret(chain4,chain5));
//
//
//
//		}
//
//		public static <E> boolean secret(Listnode <E> chain1, Listnode<E> chain2) {
//			
//			while(chain1 != null && chain2 != null) {
//				if(chain1.getData().equals(chain2.getData())){
//					System.out.println(chain1.getData());
//					chain1 = chain1.getNext();
//					System.out.println(chain2.getData());
//					chain2 = chain2.getNext();
//				}
//				else return false;
//			}
//			
//			if(chain1 == null && chain2 == null) {System.out.println("Enter if");return true;}
//			
//			return false;
//			
//		}


		Listnode<Integer> list1 = new Listnode<>(10,new Listnode<Integer>(20, new 
				Listnode<Integer>(30,new Listnode<Integer>(40,new Listnode<Integer>(50)))));
		System.out.println(findKthToLastItem(list1,2));
		Listnode<Integer> list2 = new Listnode<>(10,new Listnode<Integer>(40));
		System.out.println(findKthToLastItem(list2, 3));
		Listnode<Integer> firstNull = new Listnode<>(null, new Listnode<Integer>(20, new 
				Listnode<Integer>(30,new Listnode<Integer>(40,new Listnode<Integer>(50)))));
		System.out.println("If the first one is Null, the 2nd to last element in the list is " 
				+ findKthToLastItem(firstNull, 2));
		Listnode<Integer> secondNull = new Listnode<>(10,new Listnode<Integer>(null, new 
				Listnode<Integer>(30,new Listnode<Integer>(40,new Listnode<Integer>(50)))));
		System.out.println("If the second item is Null, the 2nd to last element in the list is " +
				findKthToLastItem(secondNull,2));
		System.out.println("If you are trying to reach the same thing but out of bound, then"
				+ "you will get " + findKthToLastItem(secondNull, 7));
		Listnode<Integer> allNull = new Listnode<>(null,new Listnode<Integer>(null, new 
				Listnode<Integer>(null,new Listnode<Integer>(null,new Listnode<Integer>(null)))));
		System.out.println("If you are trying to access the second element in a list that are all null"
				+ " you will get " + findKthToLastItem(allNull, 2));
	
		Listnode<String> chain5 = new Listnode<>("hello", new Listnode<String>("from", new
				Listnode<String>("the", new Listnode<String>("outside"))));
		System.out.println("If you are trying to find a list of string hello from the outside, "
				+ "the second to last element would be " + findKthToLastItem(chain5, 1));
		System.out.println("Null cases " + findKthToLastItem(null,1));
	}	
	





	public static <E> E findKthToLastItem(Listnode<E> head, int k) {
		//If 
		try{
			if (head == null)
				throw new IllegalArgumentException();
		}catch(IllegalArgumentException e){
			System.out.println("Head node cannot be null");
			return null;
		}
		
		//this variable will keep count of nodes in the linked list.
		int count = 0;
		//Create another current reference that reference to the start of the list.
		Listnode<E> curr = head;
		//This try catch block will count all the elements in the linked list, until it refers to the last element, then it will catch the Exception, and break out of the while loop.
		try{
			while(true){
				curr = curr.getNext();
				count++;
			}
		}catch(NullPointerException e){
		}
		//This try catch block will prevent user from enter a number that is greater than the length of the linked list.
		try{
			//This conditional statement will check if the integer k that the user passed in is greater than or equal to the amount of nodes in the linked list, if so, we will create another current variable that reference to the beginning of the list.
			//Through the for loop, it will traverse through the list for count-k times. And store the value to newCurr.
			if(k>0 && k <= count){
				Listnode<E> newCurr = head;
				for(int i =0; i<count-k;i++)
					newCurr = newCurr.getNext();
				return newCurr.getData();
			}
			else throw new IndexOutOfBoundsException();
		}catch(IndexOutOfBoundsException e){
			System.out.println("Number should be between 0 and the length of the list" );
		}
		return null; 
	}


}
