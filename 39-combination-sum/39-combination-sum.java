class Solution {
   
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         ArrayList<List<Integer>>  ans = new ArrayList<>();
        find(0,target,ans,candidates,new ArrayList<>());
        return ans;
    }
    public void find(int index,int target,List<List<Integer>> ans,int arr[],List<Integer> ds ){
         
        if(target == 0){
           ans.add(new ArrayList<> (ds));
            return ;
        }else if(index == arr.length){
            return;
        }
       
        if(arr[index] <= target){
            ds.add(arr[index]);
            find(index,target - arr[index],ans,arr,ds);
            ds.remove(ds.size() - 1);
        }
        find(index + 1,target,ans,arr,ds);
    }
}