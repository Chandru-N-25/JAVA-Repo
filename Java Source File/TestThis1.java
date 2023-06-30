class ThisEx {
	void m1() {

		System.out.println("hello m1");
	}

	void m2() {

		System.out.println("hello m2");

		this.m1();
	}
}

class TestThis1 {
	public static void main(String args[]) {

		ThisEx s1 = new ThisEx();

		s1.m2();
	}
}