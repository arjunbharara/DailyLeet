class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0)
            return ; 
     int k=m+n-1;
        m--;
        n--;
        while(k>=0&& n>=0 )
        {
            if(m>=0 && nums1[m]>=nums2[n])
            {
                nums1[k]=nums1[m--];
                
            }
            else
            {
                nums1[k]=nums2[n--];
            
            }
            k--;
        }
    }
}