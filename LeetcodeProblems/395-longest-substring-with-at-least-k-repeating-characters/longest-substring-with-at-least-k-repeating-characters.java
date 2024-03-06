public class Solution {
    public int longestSubstring(String s, int k) {
       char[] count=new char[26];
       for(int i=0;i<s.length();i++){
           count[s.charAt(i)-'a']++;
       }
        boolean valid=true;
       int start=0;
       int end=0;
       int maxlen=0;
       for( end=0;end<s.length();end++){
           if(count[s.charAt(end)-'a']<k){
               String sub=s.substring(start,end);
               maxlen=Math.max(maxlen,longestSubstring(sub,k));
               start=end+1;
               valid=false;
           }

       }
       if(valid){
           return s.length();
       }else{
           return Math.max(maxlen,longestSubstring(s.substring(start),k));
       }
    }
}