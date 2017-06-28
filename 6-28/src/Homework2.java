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
		//		Listnode<String> chain1 = new Listnode(); //we will come back to see how we could completely destroy the pointer
		//		Listnode<String> chain2 = new Listnode();
		//		Listnode <String> chain3 = new Listnode();
		//		//	chain1 = null;
		//		//	System.out.println(chain1 == null);
		//		String [] friends = {"Aiden", "Bob", "Cindy","David",
		//				"Emily","Frank","Gabby","Hannah", "Ingraham","Jacky"};
		//
		//		chain1.setData("Aiden");
		//		chain1.setNext(chain2);
		//		chain2.setData("Bob");
		//		chain3.setData("Cindy");
		//		chain3.setNext(null);

//		ArrayList<Integer> data1 = new ArrayList<>(Arrays.asList(11,22,33));
//		ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(33,22,11));
//		Listnode<ArrayList<Integer>> chain1 =  new Listnode<> (data1);
//		Listnode<ArrayList<Integer>> chain2 = new Listnode<> (data2);
//		Listnode<Integer> list1 = new Listnode<>(10,new Listnode<Integer>(20, new 
//				Listnode<Integer>(30,new Listnode<Integer>(40,new Listnode<Integer>(50)))));
//		System.out.println(findKthToLastItem(list1,2));
//		Listnode<Integer> list2 = new Listnode<>(10,new Listnode<Integer>(40));
//		System.out.println(findKthToLastItem(list2, 3));
//		Listnode<Integer> firstNull = new Listnode<>(null, new Listnode<Integer>(20, new 
//				Listnode<Integer>(30,new Listnode<Integer>(40,new Listnode<Integer>(50)))));
//		System.out.println("If the first one is Null, the 2nd to last element in the list is " 
//				+ findKthToLastItem(firstNull, 2));
//		Listnode<Integer> secondNull = new Listnode<>(10,new Listnode<Integer>(null, new 
//				Listnode<Integer>(30,new Listnode<Integer>(40,new Listnode<Integer>(50)))));
//		System.out.println("If the second item is Null, the 2nd to last element in the list is " +
//				findKthToLastItem(secondNull,2));
//		System.out.println("If you are trying to reach the same thing but out of bound, then"
//				+ "you will get " + findKthToLastItem(secondNull, 7));
		Listnode<Integer> allNull = new Listnode<>(null,new Listnode<Integer>(null, new 
				Listnode<Integer>(null,new Listnode<Integer>(null,new Listnode<Integer>(null)))));
		System.out.println("If you are trying to access the second element in a list that are all null"
				+ " you will get " + findKthToLastItem(allNull, 2));
		Listnode<Integer> head = new Listnode<Integer>(10);
		System.out.println(findKthToLastItem(head, 1));
	}	



	public static <E> E findKthToLastItem(Listnode<E> head, int k) {


		int count = 0;
		Listnode<E> curr = head;
		try{
			while(true){
				curr = curr.getNext();
				count++;
			}
		}catch(NullPointerException e){
		}
		try{
			if(k <= count){
				Listnode<E> newCurr = head;
				for(int i =0; i<count-k;i++){
					newCurr = newCurr.getNext();
				}
				return newCurr.getData();
			}
			else{
				throw new IndexOutOfBoundsException();
			}
		}catch(IndexOutOfBoundsException e){
			System.out.println("There are not enough elements" );
		}


		return null; 

	}

}
