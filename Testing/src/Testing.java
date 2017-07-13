import java.io.*;
import java.util.*;
import java.util.*;

public class Testing {

	public static void main(String[] args)  {
		//		
		ListADT newArray = new SimpleArrayList();
//		System.out.println("This is printing using recursive print");
//		newArray.print();
		//All the names in alphetical order.
		String[] names = {"Aiden","Bob","Cindy","David","Emily","Frank","Gabby"
		                  ,"Hannah","Isabella","Jacky","Kevin","Leo","Mari",
		                  "Nick","Oprah","Philips","Quinn","Reid",
		                  "Sarah","Tom","Ukarsh","Vivian","William",
		                  "Xavier","Yogev","Zeo"};
//		//Testing all the names in my shadowArrayList.
//		for(int i = 0; i < names.length; i++){
//			System.out.println();
//			newArray.add(names[i]);
//			newArray.NormalPrint();
//			
//		}
		StackADT newStack = new Stack();
		System.out.println();
		for(int i = 0; i < names.length; i++){
			newStack.push(names[i]);
		}
		newStack.print();
		System.out.println("Removing " + newStack.pop());
		System.out.println("Removing " + newStack.pop());
		System.out.println("Peeking the last item " +newStack.peek());
		
		QueueADT myQQ = new MySimpleQueue();
		myQQ.enqueue("Aiden");
		myQQ.enqueue("Bob");
		myQQ.enqueue("Cindy");
		myQQ.enqueue("Emily");
		myQQ.enqueue("Frank");
		myQQ.dequeue();
		myQQ.dequeue();
		myQQ.enqueue("Gabby");
		myQQ.enqueue("Hannah");
		myQQ.dequeue();
		myQQ.enqueue("Jacky");
		myQQ.enqueue("Leo");
		myQQ.enqueue("Marrin");
		myQQ.enqueue("Nick");
		myQQ.enqueue("Oprah");
		myQQ.enqueue("Zeo");
		myQQ.print();
		System.out.println();
		System.out.println("Dequeueing "+ myQQ.dequeue());
		System.out.println("Dequeueing "+ myQQ.dequeue());
		myQQ.print();
		System.out.println();
		myQQ.enqueue("Aiden");
		myQQ.enqueue("Bob");
		myQQ.enqueue("Cindy");
		myQQ.print();

		
		
	}


}
