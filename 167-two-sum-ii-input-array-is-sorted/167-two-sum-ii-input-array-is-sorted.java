class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int s = 0,e = numbers.length-1;
        while(s < e){
            if(numbers[s] + numbers[e] == target){
			
                return new int[] {s+1,e+1};
            }
            else if(numbers[s] + numbers[e] < target){
				
                s++;
            } else {
				
                e--;
            }
        }
		//return an empty array
        return new int[] {};
    }
}