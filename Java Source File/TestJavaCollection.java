
//collection 
import java.util.*;

class TestJavaCollection {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Vijay");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(1));
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.contains("vijay"));
		System.out.println(list.isEmpty());
		list.removeAll(list);
		System.out.println(list);
		System.out.println(list.isEmpty());

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			String name = itr.next();
			if (name.equals("Vijay")) {
				System.out.println(name + "is good boy");
			}
		}

	}
}