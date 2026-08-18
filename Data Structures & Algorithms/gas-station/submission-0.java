class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas=0 ,totalCost=0;
        for(int i=0;i<gas.length;i++){
            totalGas +=gas[i];
            totalCost +=cost[i];
        }
        if(totalGas<totalCost){
            return -1;
        }
        int currentgas=0 , startIndex=0;
        for(int i=0; i<gas.length;i++){
            currentgas +=gas[i]-cost[i];
            if(currentgas <0){
                startIndex=i+1;
                currentgas=0;
            }
        }
    return startIndex;
    }
}
