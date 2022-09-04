class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalfuel =0;
        int totalcost =0;
        int curfuel = 0;
        int start=0;
        for(int fuel : gas){
            totalfuel += fuel;
        }
        for(int j : cost){
            totalcost +=j;
        }
        if(totalfuel < totalcost)return -1;
        
        for(int i =0;i<gas.length;i++){
          curfuel += (gas[i] - cost[i]);
            if(curfuel < 0){
                start = i+1;
                curfuel = 0;
            }
        }
        return start;
    }
}