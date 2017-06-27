
public class YellowException  extends Throwable{
	public YellowException(){
		super();
	}
	
	
	public YellowException(String message){
		System.out.println("Error message" + message);
	}
}
