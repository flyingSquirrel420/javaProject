import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Duck {
	private int size; //size could vary from one object to another.
	private static int numOfDucks;  // it keep counting for the whole class
	private String category;
	private static final String LAKE = "Mendota";    //static constant, it stays the same for all object.
													 // All the Ducks will swim in the same lake
	private final String GENDER;   //instant variable, it differ from object to object, but it is a constant

	
	
	public Duck(String gender){
		numOfDucks++;  // to keep count of how many objects been created. 
		GENDER = gender;
		System.out.println(GENDER);
	}
	
	private static int changeNumOfSticks(){
		return 50000;
	}
	
	private int getSize() {
		return this.size;
	}
	
	private int setSize(int duckSize){
		this.size = duckSize;
		return this.size;
	}
	
	private String getCatogory (){
		return this.category;
	}
	
	private void setCategory(String category){
		this.category = category;
	}
	
	static void createBoard(int [][] board) {
		board = new int[3][3];
		}

	
	public static void main(String[] args) {
//		Scanner scnr = new Scanner(System.in);
//		numOfDucks = Duck.changeNumOfSticks();  // this is how you called a static method
//		Duck d = new Duck("Female");  // this is how you create an object
//		Duck b = new Duck ("Male");
//		b.setSize(4);   // this is how you mutator the information in your object
//		b.setCategory("stupid");
//		d.setCategory("Beautiful one");
//		System.out.println("Test: " + d.setSize(13));
//		int beautiful =d.getSize() + b.getSize();  // this is how you access the information in your class since it's private
//		//ArrayList <Integer> list = new ArrayList <Integer>();
//		List <Integer> list1 = new ArrayList <Integer> ();
//		List <Integer> list2 = new ArrayList <Integer>();
//		System.out.print("How many integers? ");
//		int length = scnr.nextInt();
//		for(int i =0; i<length; i++){
//			int newNum = (int) (Math.random()*101);
//			list1.add ( newNum);
//			list2.add(((int)(Math.random()*105)));
//			
//		}
//		System.out.println(list1);
//		System.out.println(list2);
		
		String[] list = new String [] {"null"};
		System.out.println(list.length); 
		
		
	}

}
