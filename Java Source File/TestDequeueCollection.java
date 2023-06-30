//DequeueCollection Example.

import java.util.*;

public class TestDequeueCollection {
	public static void main(String args[]) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Gautham");
		deque.add("Sarni");
		deque.add("Nivetha");
		System.out.println(deque);
		// deque.removeALl(deque);
		System.out.println("*" + deque);
		System.out.println("*" + deque);
		/*
		 * Iterator<String> itr =list.iterator();
		 * while(itr.hasNext()){
		 * System.out.println(itr.next());
		 * }
		 */
		/*
		 * for(String s : deque){
		 * System.out.println(s);
		 * }
		 */
	}
}