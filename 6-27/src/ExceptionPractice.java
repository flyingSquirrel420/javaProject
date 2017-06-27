import java.util.*;
import java.lang.*;
import java.io.*;


public class ExceptionPractice {

	
//	public static void foo (int k, int[]A,String S) {
//		int j = 1/k;
//		int len = A.length + 1;
//		char c;
//		
//		
//		try{
//			c = S.charAt(0);
//			System.out.println(c);
//			if (k==10){
//				j = A[10];
//			}
//			
//			
//			
//		}catch(ArrayIndexOutOfBoundsException ex){
//			System.out.println("Array Error");
//			throw new InternalError("Internal Error!");
//		}catch(ArithmeticException ex){
//			System.out.println("Arithmetic Error");
//		}catch(NullPointerException ex){
//			System.out.println("Null Pointer");
//		}catch(Exception e){
//			System.out.println("The error is: " + e.getMessage());
//		}
//		finally{
//			System.out.println("in finally clause");
//		}
//		System.out.println("After try block");
//	}
//	
//	
//	
//	public static void fool () throws ClassNotFoundException {
//		int [] Hello = {1, 2, 3, 4} ;
//		//foo(0,Hello,"Hello World");
//		try{
//			System.out.println("What's going on?");
//			FileReader fr = new FileReader("Example.txt");
//			int letters= fr.read();
//			while(fr.ready()){
//				System.out.println((char)letters);
//				letters = fr.read();
//			}
//		}catch(IOException e){
//			System.out.println(e.getMessage());
//			throw new ClassNotFoundException();
//		}
//	}
	public static void main(String[] args) throws RedException {
		// TODO Auto-generated method stub
		
//		try{
//			fool();
//		}catch(ArithmeticException e){
//			System.out.println(e.getMessage());
//		}catch (ClassNotFoundException error){
//			System.out.println("Error");
//		}
//		
	try{
		System.out.println("Main[");
		try{
			methodA();
			methodE();
		}catch(GreenException exc){
			System.out.println("main-green");
		}finally{
			System.out.println("Main finally");
		}
		System.out.println("]Main");
	}catch(Exception e){
		System.out.println("Main caught a BIG exception");
	}
		
		
	}
	
	
	
	private static void methodA() throws GreenException{
		System.out.println("\nA[");
		try{
			methodB();
			System.out.println("After B,");
			throw new BlueException();
		}catch(BlueException exc){
			System.out.println("A-blue,");
		}
		System.out.println("]A");

	}
	
	private static void methodB() throws GreenException {
		System.out.println("\nB[");
		methodC();
		System.out.println("after C");
		try{
			methodD();
			System.out.println("after D");
			throw new YellowException();
		}catch(YellowException exc){
			System.out.println("B-yellow");
			throw new GreenException();
			
		}catch(RedException exc){
			System.out.println("B red");
		}finally{
			System.out.println("B-finally and I am really tired of typing.");
		}
	}
	
	private static void methodC(){
		
	}
	private static void methodD() throws RedException{
		throw new RedException();
	}
	private static void methodE(){
		
	}
	
}
