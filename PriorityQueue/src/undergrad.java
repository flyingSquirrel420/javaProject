import java.util.*;

public class undergrad {

	private String name;
	private long studentID;
	private int priority;
	private double gpa;
	
	
	public undergrad(){
		this.name = "";
		this.studentID = 0;
		this.priority = 0;
		this.gpa = 4.0;
	}
	
	public undergrad(String name, long studentID, int priority, double gpa){
		this.name = name;
		this.studentID = studentID;
		this.priority = priority;
		this.gpa = gpa;
	}
	
	public String getName(){
		return this.name;
	}
	public long getStudentID(){
		return this.studentID;
	}
	public int getPriority(){
		return this.priority;
	}
	public double getGPA(){
		return this.gpa;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setStudentID(long id) {
		this.studentID = id;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
}
