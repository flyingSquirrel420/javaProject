import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class FUCKzybook {

	
		public static int employeeID = 0;
		public int zybookVersion;
		
		public FUCKzybook (int zybookVersion){
			employeeID ++;
			this.zybookVersion = zybookVersion;
			
		}
	
		public String myPassword () {
			System.out.println(FUCKzybook.employeeID);
			System.out.println("Your zybook version is: " + this.zybookVersion);
			return "Hello World is my password";
		}
		
		
		public static String myPasswordReturn() {
			FUCKzybook newAidenSong = new FUCKzybook(3);
			newAidenSong.myPassword();
			
			return "";
		}
		
		
		
	
	public static void main (String[] args) {
		List <String> birthday = new ArrayList<String>(Arrays.asList("happy","birthday","to","you"));
		for (int i=0; i<birthday.size();i = i + 2){
			birthday.add(i+1,birthday.get(i));
		}
		FUCKzybook aiden = new FUCKzybook (3);
		System.out.println(aiden.myPassword());
		FUCKzybook newZy = new FUCKzybook (4);
		System.out.println(newZy.myPassword());
		FUCKzybook.myPasswordReturn();
		Iterator <String> itr = birthday.iterator();
		while (itr.hasNext()){
			String nextWord = itr.next();
			System.out.print(nextWord + " ");
		}
		System.out.println();
		for(String nextWord: birthday){
			System.out.print(nextWord + " ");
		}
		
		System.out.print("New program test");
		for (int i =1; i<= 6; i++){
			for(int k=1; k<= i-1; k++)
				System.out.print("-");
			System.out.print(2 *i);
			for(int k =i+1;k<=6; k++)
				System.out.print("-");
			System.out.println();
			
		
		}
		}



	
}

