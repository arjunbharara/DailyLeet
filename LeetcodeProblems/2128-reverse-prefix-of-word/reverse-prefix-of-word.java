class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb =new StringBuilder();
        char match=word.charAt(0);
        if(match==ch){
            return word;
        }
        int index=0;
        //boolean flag=false;
        while(match!=ch && index<word.length()){
            index++;
            if(index<word.length()){
            match=word.charAt(index);
            }
           // index++;
        }
        if(index==word.length()){
            return word;
        }
        for(int i=index;i>=0;i--){
            sb.append(word.charAt(i));
        }
        index++;
        while(index<word.length()){
            sb.append(word.charAt(index));
            index++;
        }
        return sb.toString();
    }
}