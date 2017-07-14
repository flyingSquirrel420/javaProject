public class Graduate {

	private String name;
	private String graduateThesis;
	private int priority;
	private double gpa;


	public Graduate(){
		this.name = "";
		this.graduateThesis = "";
		this.priority = 0;
		this.gpa = 4.0;
	}

	public Graduate(String name, String thesis, int priority, double gpa){
		this.name = name;
		this.graduateThesis = thesis;
		this.priority = priority;
		this.gpa = gpa;
	}

	public String getName(){
		return this.name;
	}
	public String getThesis(){
		return this.graduateThesis;
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
	public void setThesis(String thesis) {
		this.graduateThesis = thesis;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
}

