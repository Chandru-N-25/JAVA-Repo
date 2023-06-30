class MethodExample{

	public int myMethod(int a,int b){

		//String s = "I just got executed";
		System.out.println(a+b);
		return a + b;
	}

	public static void main(String args[]){
			
		MethodExample obj = new MethodExample();
		obj.myMethod(1,2);
		
		

	}
}