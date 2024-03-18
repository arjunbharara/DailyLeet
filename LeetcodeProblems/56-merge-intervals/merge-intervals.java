class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]>result=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int[] newInterval=new int[2];
        newInterval[0]=intervals[0][0];
        newInterval[1]=intervals[0][1];
        result.add(newInterval);
       for(int[] interval:intervals){
            if(interval[0]<=newInterval[1]){
                newInterval[1]=Math.max(interval[1],newInterval[1]);
            }else{
                newInterval=interval;
                result.add(newInterval);
            }
       }
       return result.toArray(new int[result.size()][]);
    }
}