
public class Recursion {

	public static void main(String[] args) {

	
	Recursion.printTwonInts(3);
	
	
	}

	
	public static void printTwonInts(int k){
		if(k == 0) return;
		System.out.println("From before recursion: "+ k);
		printTwonInts(k - 1);
		System.out.println("From after recursion: " + k);
	}
	
}
