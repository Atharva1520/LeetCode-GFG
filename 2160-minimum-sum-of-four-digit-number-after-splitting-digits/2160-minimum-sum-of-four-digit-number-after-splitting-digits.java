class Solution {
    public int minimumSum(int num) {
         PriorityQueue<Integer>pq=new PriorityQueue<>();

        while(num>0){
            pq.offer(num%10);
            num/=10;
        }
		
        int a=10*pq.remove();
        int b=10*pq.remove();
        int c=pq.remove();
        int d=pq.remove();
        return a+b+c+d;
    }
}