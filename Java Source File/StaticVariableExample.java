class StaticVariableExample {

	int rollno;
	String name;
	static String college = "KG";

	StaticVariableExample(int r, String n) {

		rollno = r;
		name = n;

	}

	void display() {

		System.out.println(rollno + " " + name + " " + college);
	}
}

class StaticVariableExample1 {
	public static void main(String args[]) {

		StaticVariableExample s1 = new StaticVariableExample(111, "Barath");
		StaticVariableExample s2 = new StaticVariableExample(222, "Praveen");

		s1.display();
		s2.display();
	}
}
