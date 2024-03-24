class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] counter=new int[26];
        int max=0;
        int maxCount=0;
        for(char c:tasks){
            counter[c-'A']++;
            if(max==counter[c-'A']){
                maxCount++;
            }else if(max<counter[c-'A']){
                max=counter[c-'A'];
                maxCount=1;
            }
        }
        int partCount=max-1;
        int partLength=n-(maxCount-1);
        int emptySlots=partLength*partCount;
        int availableTasks=tasks.length-max*maxCount;
        int idles=Math.max(0,emptySlots-availableTasks);

        return tasks.length+idles;

    }
}