public class MultiDimensionalArr {
    public static void main(String[] args) {
        int[][] multiArr = new int[3][3];
        multiArr[0] = new int[]{1, 2, 3};
        multiArr[1] = new int[]{4, 5, 6};
        multiArr[2] = new int[]{7, 8, 9};

        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                System.out.print(multiArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
