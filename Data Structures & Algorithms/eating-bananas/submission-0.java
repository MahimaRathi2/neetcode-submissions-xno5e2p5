class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minspeed=1;
        int maxspeed=0;
        for(int pile:piles){
            maxspeed=Math.max(maxspeed,pile);
        }
        while(minspeed<maxspeed){
            int mid=minspeed+(maxspeed-minspeed)/2;
            if(canFinish(piles,h,mid)){
                maxspeed=mid;
               
            }else{
                minspeed=mid+1;
            }          
        }
    return minspeed;
    }
    public boolean canFinish(int[]piles,int h,int mid){
        int hours=0;
        for(int i=0;i<piles.length;i++){
            hours += (piles[i]+ mid-1)/mid;
        }
        return hours <=h;
    }
}
