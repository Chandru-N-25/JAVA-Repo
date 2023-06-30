class ThisEx {
	ThisEx() {
		System.out.println("hello obj");
	}

	ThisEx(int x) {
		this();
		System.out.println(x);
	}
}

class TestThis2 {
	public static void main(String args[]) {
		ThisEx obj = new ThisEx();
	}
}