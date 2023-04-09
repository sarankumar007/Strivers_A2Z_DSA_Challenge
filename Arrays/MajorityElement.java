class Solution {
    public int majorityElement(int[] nums) {
//         HashMap<Integer,Integer>a=new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             a.put(nums[i],a.getOrDefault(nums[i],0)+1);
//             if(a.get(nums[i])>nums.length/2)
//                 return nums[i];
           
//         }
//method 2
        Arrays.sort(nums);
        return nums[nums.length/2];
        // return -1;
    }
}
