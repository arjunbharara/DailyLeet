class Solution {
    public void setZeroes(int[][] matrix) {
         //static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, ) {
            int n=matrix.length ;
            int m=matrix[0].length;
            int[] row = new int[n]; // row array
             int[] col = new int[m]; // col array

        // Traverse the matrix:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    // mark ith index of row wih 1:
                    row[i] = 1;

                    // mark jth index of col wih 1:
                    col[j] = 1;
                }
            }
        }

        // Finally, mark all (i, j) as 0
        // if row[i] or col[j] is marked with 1.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    //matrix.get(i).set(j, 0);
                    matrix[i][j]=0;
                }
            }
        }
    }
}