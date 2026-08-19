class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0) return false;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<hand.length;i++){
          map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }
        while(map.size()>0){
            int currentcard=map.entrySet().iterator().next().getKey();
            for(int i=0;i<groupSize;i++){
            int card = currentcard+i;
            if(!map.containsKey(card)) return false;
            int count =map.get(card);
            if(count==1){
                map.remove(card);
            }else{
                map.put(card,count-1);
            }
            }
        }
        return true;
    }
}
