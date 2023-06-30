class AccessorAndMutatorEx {

	private int roll;
	private String name;

	public int getRollno() {

		return roll;
	}

	public void setRoll(int roll) {

		this.roll = roll;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public void display() {

		System.out.println("Roll no: " + roll);
		System.out.println("Student name: " + name);
	}

	public static void main(String args[]) {

		AccessorAndMutatorEx s1 = new AccessorAndMutatorEx();
		AccessorAndMutatorEx s2 = new AccessorAndMutatorEx();

		s1.display();
		s2.display();
	}
}
