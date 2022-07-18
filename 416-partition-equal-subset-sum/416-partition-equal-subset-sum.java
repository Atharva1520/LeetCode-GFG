class Solution {
    public boolean canPartition(int[] arr) {
        
         int n = arr.length;
        int sum =0;
        
        for(int i=0;i<n;i++){sum+= arr[i];}
        if(sum % 2==0){
      return  isSubsetSum(n,arr,sum/2);}
       else return false;
       
    }
    static Boolean isSubsetSum(int n, int arr[], int k){
       
        boolean[] prev=new boolean[k+1];
        boolean[] cur=new boolean[k+1];
        
		prev[0]=true;
        if(arr[0]<=k)
		    prev[arr[0]]=true;
        
		for(int index=1;index<n;index++){
			for(int target=1;target<=k;target++){
				boolean pick=false;
				if(target>=arr[index])
					pick=prev[target-arr[index]];
				cur[target]=(pick || prev[target]);
			}
            prev=Arrays.copyOf(cur,k+1);
		}
		return cur[k];
    }
}