class Solution {
    public int minimumLength(String s) {
       int start=0;
       int end=s.length()-1;
       while(start<end){
           if(start==end) return 1;
           char c1=s.charAt(start);
           char c2=s.charAt(end);
           if(c1==c2){
               while(start<=end && s.charAt(start)==c2)
                   start++;
               while(end>=start && c1==s.charAt(end))
                   end--;
           }else{
               return end-start+1;
           }
       }
       return end-start+1; 
    }
}