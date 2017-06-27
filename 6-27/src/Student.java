import java.io.*;
import java.io.Serializable;

public class Student implements Serializable{

	private String name;
	private double GPA;
	
	
	public Student(String name, double gpa){
		this.name = name;
		this.GPA = gpa;
	}
	
	public String getName(){
		return this.name;
	}
	
	
	public double getGPA (){
		return this.GPA;
	}
	
	public String setName(String name){
		this.name = name;
		return this.name;
	}
	
	public double setGPA(double gpa){
		return this.GPA = gpa;
	}
	
	@Override 
	public String toString(){
		return String.format("%s\t%f", this.name,this.GPA);
	}
	
}
