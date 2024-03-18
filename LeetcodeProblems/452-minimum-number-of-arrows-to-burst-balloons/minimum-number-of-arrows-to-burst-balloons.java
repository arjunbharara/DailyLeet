class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length==0){
            return 0;
        }

        Arrays.sort(points,(a,b) ->Integer.compare(a[1],b[1]));
        int arrowCount=1;
        int target=points[0][1];
        for(int i=1;i<points.length;i++){
            if(target>=points[i][0]){
                continue;
            }
            arrowCount++;
            target=points[i][1];
        }
        return arrowCount;
    }
}