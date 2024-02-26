class Solution {
    public String firstPalindrome(String[] s) {
        for(int i=0;i<s.length;i++){
            String str=s[i];
            if(pallindrome(str)){
                return str;
            }

        }
        return "";
    }
    public static boolean pallindrome(String s){
        int a=0;
        int b=s.length()-1;
        while(a<=b){
            if(s.charAt(a)!=s.charAt(b)){
                return false;
            }
            a++;
            b--;
        }

        return true;
    }
}