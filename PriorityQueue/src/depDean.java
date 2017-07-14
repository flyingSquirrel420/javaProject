
public class depDean {


	private int retireYear;
	private String name;
	private long profID;
	private int priority;
	private double courseNumber;


	public depDean(){
		this.name = "";
		this.profID = 0;
		this.priority = 0;
		this.courseNumber = 0.0;
		this.retireYear = 0;
	}

	public depDean(String name, long profID, int priority, double course, int retire){
		this.name = name;
		this.profID = profID;
		this.priority = priority;
		this.courseNumber = course;
		this.retireYear = retire;
	}

	public String getName(){
		return this.name;
	}
	public long getProfID(){
		return this.profID;
	}
	public int getPriority(){
		return this.priority;
	}
	public double getCourse(){
		return this.courseNumber;
	}
	public int retireYear(){
		return this.retireYear;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setProfID(long id) {
		this.profID = id;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public void setCourse(double course) {
		this.courseNumber = course;
	}
	public void setRetire(int retire){
		this.retireYear = retire;
	}

}
