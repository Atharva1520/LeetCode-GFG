class Solution {
    ArrayList<List<Integer>>  ans ;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       ans = new ArrayList<>();
        find(0,target,candidates,new ArrayList<>());
        return ans;
    }
    public void find(int index,int target,int arr[],List<Integer> ds ){
         
        if(target == 0){
           ans.add(new ArrayList<> (ds));
            return ;
        }else if(index == arr.length){
            return;
        }
       
        if(arr[index] <= target){
            ds.add(arr[index]);
            find(index,target - arr[index],arr,ds);
            ds.remove(ds.size() - 1);
        }
        find(index + 1,target,arr,ds);
    }
}