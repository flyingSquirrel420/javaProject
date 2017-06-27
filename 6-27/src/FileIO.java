
import java.io.*;
import java.util.*;
public class FileIO {

	public static void main(String[] args) throws IOException{

		
		//this way of implementation would actually create a human-readable file
		//How to create and write to the File
		File file = new File("aiden.txt");
		try{
			PrintWriter output = new PrintWriter(file);
			output.println("Hello World");
			output.println("Hello Aiden");
			output.close();
		}catch (IOException e){
			System.out.println(e.getMessage());
		}
		try{
			Scanner input = new Scanner(file);
			String a = input.nextLine();
			String b = input.nextLine();
			System.out.println(a +"\n" +b);
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
	
		
		
		
		//How to create a directory. This will create three directories, notice that you create a new directory
		//based on the directories you are in right now. 
		String dirname = "aiden/workspace/practiceCodes";
		File d = new File(dirname);
		d.mkdirs();
		
		
		
		
		
		//We could also create a raw bytes. Contents of files are in a binary format. Using the FileInputStream and 
		//FileOutputStream. 
		
		
		
		
		
		
		
	}

}
