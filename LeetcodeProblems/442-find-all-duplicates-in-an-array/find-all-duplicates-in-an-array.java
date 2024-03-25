class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>result=new ArrayList<>();
        int [] count=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(count[num-1]==0){
                count[num-1]++;
            }else{
                result.add(nums[i]);
            }
        }
        return  result;
    }
}