class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        int f=flowerbed.length;
        for(int i=0;i<f;i++){
            if(flowerbed[i]==0 &&
            (i==0 ||flowerbed[i-1]==0)&&
            (i==f-1||flowerbed[i+1]==0)){
             flowerbed[i]=1;
             count++;
            }
        }
        if(count >=n) return  true;
        return false;
    }
}