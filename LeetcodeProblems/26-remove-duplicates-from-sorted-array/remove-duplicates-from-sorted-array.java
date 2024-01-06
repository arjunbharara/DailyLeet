class Solution {
    public int removeDuplicates(int[] nums) {
      int i=0;
      nums[i]=nums[0];
      i=1;
      for(int n :nums){
          if(n>nums[i-1]){
            nums[i]=n;
            i++;
          }
      }
      return i;
    }
}