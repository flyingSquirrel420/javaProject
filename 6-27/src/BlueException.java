
public class BlueException extends Throwable {

	
	public BlueException(){
		super();
	}
	
	
	public BlueException(String message){
		System.out.println("Error message" + message);
	}
}
