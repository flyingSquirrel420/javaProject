
import java.util.Scanner;
public class ClassExample {



	public static void main (String [] args) {
		final int NUM_ROWS = 2;
		final int NUM_COLS = 2;
		int [][] milesTracker = new int[NUM_ROWS][NUM_COLS];
		int i = 0;
		int j = 0;
		int maxMiles = 0; // Assign with first element in milesTracker before loop
		int minMiles = 0; // Assign with first element in milesTracker before loop

		milesTracker[0][0] = -10;
		milesTracker[0][1] = 20;
		milesTracker[1][0] = 30;
		milesTracker[1][1] = 40;

		maxMiles=milesTracker[0][0];
		for(i=0; i<NUM_ROWS; i++){
			for(j=0; j< NUM_COLS; j++){
				if(milesTracker[i][j] > maxMiles){
					maxMiles=milesTracker[i][j];
				}
			}
		}
		minMiles=milesTracker[0][0];
		for(i=0; i<NUM_ROWS; i++){
			for(j=0; j< NUM_COLS; j++){
				if(milesTracker[i][j] < minMiles){
					minMiles=milesTracker[i][j];
				}
			}
		}
		System.out.println("Min miles: " + minMiles);
		System.out.println("Max miles: " + maxMiles);
	}

	String [ ][ ][ ] responses = {
		{  {"hello"}, 
		{ "How do you do.", "Hi."}},
		{  {"always"}, 
		{ "When?", "Really, always?"}  }
	};
	

}


