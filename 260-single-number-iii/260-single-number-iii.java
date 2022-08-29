class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> hm=new HashMap<>();
    int[] arr=new int[2];
    int i=0;
    for(int n:nums)
        hm.put(n, hm.getOrDefault(n,0)+1);
    
    for(Map.Entry<Integer, Integer> entry:hm.entrySet()){
        if(entry.getValue()==1)
            arr[i++]=entry.getKey();
    }
    return arr;
    }
}