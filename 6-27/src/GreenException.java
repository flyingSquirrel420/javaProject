
public class GreenException extends Throwable{

	
	public GreenException(){
		super();
	}
	
	
	public  GreenException(String message){
		System.out.println("Error message" + message);
	}
}
