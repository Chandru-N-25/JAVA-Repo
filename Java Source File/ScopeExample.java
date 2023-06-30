class ScopeExample{
	public static void myMethod(){

		int x = 5;
		if(x<10){
			int y = 10;
			System.out.println(y);		
		}
		System.out.println(x);		
		//System.out.println(y);
	}

	public static void myMethodOne(){
	
		//System.out.println(x);

	}
	public static void main(String args[]){
		
		myMethod();
		myMethodOne();

	}
}