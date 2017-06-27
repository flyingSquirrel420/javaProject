
public class RedException extends Throwable {
	public RedException(){
		super();
	}
	
	
	public  RedException(String message){
		System.out.println("Error message" + message);
	}
}
