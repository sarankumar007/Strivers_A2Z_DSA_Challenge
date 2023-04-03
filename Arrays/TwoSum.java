class Solution {
    public int[] twoSum(int[] nums, int t) {
       HashMap<Integer,Integer>a=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(a.containsKey(nums[i]))
                return new int[]{a.get(nums[i]),i};
            a.put(t-nums[i],i);
            
        }
        return new int[]{-1,-1};
        
    }
}
