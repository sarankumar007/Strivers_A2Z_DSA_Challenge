class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>a=new HashMap<>();
        for(int x:nums){ 
            a.put(x,a.getOrDefault(x,0)+1);
        }
      PriorityQueue<Integer>heap=new PriorityQueue<>((n1,n2)->a.get(n2)-a.get(n1));
      for(int x:a.keySet()){
      heap.add(x);
      }
      int[] ans=new int[k];
      for(int i=0;i<k;i++){
          ans[i]=heap.remove();
      }
      
        return ans;
    }
}
