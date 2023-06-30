class SuperClass {

	String color = "White";
}

class ChildClass extends SuperClass {

	String color = "Black";

	void printColor() {

		System.out.println(color);
		System.out.println(super.color);
	}
}

class TestSuper1 {
	public static void main(String args[]) {

		ChildClass c = new ChildClass();
		c.printColor();
	}
}