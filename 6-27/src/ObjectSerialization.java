import java.util.*;
import java.io.*;
public class ObjectSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File file = new File("students.txt");
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Tom",3.921));
		students.add(new Student("David",3.721));
		students.add(new Student("Bob",3.21));
		
		
		
		//Serailize the collection of students
		 FileOutputStream fo = new FileOutputStream(file); //The fileoutputstream is usually take the file
		 ObjectOutputStream output = new ObjectOutputStream(fo);//the objectOutputStream is usually takes the FileOutPutStream 
		 for(Student s:students){
			 output.writeObject(s);
			 
		 }
		 output.close();
		 fo.close();//close both the fileOutPutStream and ObjectOutPutStream. 
		 
		 
		 //deseralize the file back to the collection.
		 FileInputStream fi = new FileInputStream(file);
		 ObjectInputStream input = new ObjectInputStream(fi);
		 ArrayList<Student> students2 = new ArrayList<>();
		 
		 try{
			 while(true){
				 Student s= (Student)input.readObject(); //when you read an object, it returns as an object, so you need to cast it to Student
				 students2.add(s);
				 //this loop will keep looping until it can't find an object, and it will generate an exception. And you will catch that exception. 
				 //and that will be the end of your loop. 
			 }
		 }catch(EOFException e){
			 
		 }
		 for(Student s: students2){
			 System.out.println(s);
		 }
	}

}
