class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int total=28;
        if(n/7==0){
            for(int i=0;i<n;i++){
                sum=sum+(i+1);
            }
        }else{
            int rem=n%7;
            int last=n/7;
            for(int i=0;i<n/7;i++){
                if(i==0){
                    sum=sum+total;
                }else{
                    total=total-i+(i+7);
                    sum=sum+total;
                }
            }
            for(int i=last+1;i<=rem+last;i++){
                sum=sum+i;
            }
        }
        return sum;
    }
}