import java.util.*;
public class Listnode<E> {

	
	//Private Instance
	private E data;
	private Listnode<E> next;
	
	//Constructor
	public Listnode(E data, Listnode<E> next){
		this.data = data;
		this.next = next;
	}
	
	public Listnode(){
		this(null,null);
	}
	
	public Listnode(E data){
		this(data, null);
	}
	

	//Getter and setter
	public Listnode<E> getNext(){
		return this.next;
	}
	
	public void setNext(Listnode<E> n){
		this.next = n;
	}
	
	public E getData(){
		return this.data;
	}
	
	public void setData(E data1){
		this.data = data1;
	}
	
public static void main(String[] args){
		int [] data1 = {33,22,11};
		int [] data2 = {33,22,11};

		Listnode<int[]> chain1 =  new Listnode<> (data1);
		Listnode<int[]> chain2 = new Listnode<> (data2);
		System.out.println(secret(chain1,chain2));



	}

	public static <E> boolean secret(Listnode <E> chain1, Listnode<E> chain2) {
		
		while(chain1 != null && chain2 != null) {
			if(chain1.getData().equals(chain2.getData())){
				chain1 = chain1.getNext();
				chain2 = chain2.getNext();
			}
			else return false;
		}
		
		if(chain1 == null && chain2 == null) return true;
		
		return false;
		
	}

	
//	public static void main(String[] args){
//		Listnode<String> chain1 = new Listnode(); //we will come back to see how we could completely destroy the pointer
//		Listnode<String> chain2 = new Listnode();
//		Listnode <String> chain3 = new Listnode();
////		chain1 = null;
////		System.out.println(chain1 == null);
//		String [] friends = {"Aiden", "Bob", "Cindy","David",
//		"Emily","Frank","Gabby","Hannah", "Ingraham","Jacky"};
//
//		chain1.setData("Aiden");
//		chain1.setNext(chain2);
//		chain2.setData("Bob");
//		chain2.setNext(chain3);
//		chain3.setData("Cindy");
//		chain3.setNext(null);
//		
//	}

}
