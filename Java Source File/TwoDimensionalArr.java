class TwoDimensionalArr{
	public static void main(String args[]){
		int [] [] myArr = {{2,3,4,5},{5,4,3}};

		for(int i=0; i<myArr.length; ++i){
			for(int j=0; j<myArr[i].length; ++j){
				System.out.print(myArr[i][j] + " ");
			}
			System.out.println();
		}
	}
}