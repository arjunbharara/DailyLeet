class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0) return false;
        if(n==1) return true;
        int count=0;
        while(n%3==0){
            n=n/3;
            count++;
        }
    if(n==1){
       return true;
    }
    return false;
    }
}