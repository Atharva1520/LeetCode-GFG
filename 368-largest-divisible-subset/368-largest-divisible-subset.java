class Solution {
    public List<Integer> largestDivisibleSubset(int[] arr) {
      int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        int last_index = 0;
        int dp[] = new int[n];
        int hash[] = new int[n];
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            hash[i]=i;
            for(int j = 0;j<i;j++){
                if(arr[i]  % arr[j] == 0 && dp[j] + 1 > dp[i]){
                    dp[i] = dp[j] + 1;
                    hash[i]=j;
                }
            }
            if(dp[i] > maxi){
                maxi = dp[i];
                last_index = i;
            }
            
        }
        ArrayList<Integer> temp =  new ArrayList<>();
        temp.add(arr[last_index]);
        while(hash[last_index] != last_index){
            last_index = hash[last_index];
            temp.add(arr[last_index]);
        }
     return temp;   
    }
}