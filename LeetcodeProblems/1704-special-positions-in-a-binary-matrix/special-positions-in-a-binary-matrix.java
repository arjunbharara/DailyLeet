class Solution {
    public int numSpecial(int[][] mat) {
        int[] rows=new int[mat.length] ;
        Arrays.fill(rows,0);
        int[] col=new int[mat[0].length];
         Arrays.fill(col,0);
        int ans=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
               if(mat[i][j]==1){
                rows[i]++;
                col[j]++;
                } 
            }
        }
        //System.out.println()
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
               if(mat[i][j]==1){
                   if(rows[i]==1 && col[j]==1){
                       ans++;
                   }
                } 
            }
        }
        return ans;
    }
}