class Solution {
    public void reverseString(char[] s) {
        int k=s.length;
        for(int i=0;i<s.length/2;i++){
            char temp=s[k-1];
            s[k-1]=s[i];
            s[i]=temp;
            k--;
        }
    }
}