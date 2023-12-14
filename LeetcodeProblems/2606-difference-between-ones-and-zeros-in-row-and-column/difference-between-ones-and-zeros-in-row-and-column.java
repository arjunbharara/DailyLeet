class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[] rows=new int[grid.length];
        int[] cols=new int[grid[0].length];
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    rows[i]++;
                }else{
                    cols[j]++;
                }
            }
        }
        int[][] result=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               int ones=rows[i]+n-cols[j];
               int zeros=cols[j]+m-rows[i];
               result[i][j]=ones-zeros;
            }
        }
    return result;
    }
}