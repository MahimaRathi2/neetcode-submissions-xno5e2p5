class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
      Arrays.sort(intervals,Comparator.comparingInt(a -> a[1]));
      int count=1;
      int prevEnd=0;
      for(int i=1;i<intervals.length;i++){
        if(intervals[i][0]>=intervals[prevEnd][1]){
            prevEnd=i;
            count++;
        }
      }  
      return  intervals.length-count;
    }
}
