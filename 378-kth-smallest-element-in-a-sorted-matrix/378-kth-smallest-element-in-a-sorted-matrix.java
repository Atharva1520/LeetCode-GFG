class Solution {
    public int kthSmallest(int[][] arr, int k) {
       PriorityQueue pq=new PriorityQueue<>();
          int n=arr.length;
          for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
          pq.add(arr[i][j]);
          }
          }
          while(!pq.isEmpty() && k!=1){
          pq.poll();
          k--;
          }
          return (int) pq.peek();
              }
          }