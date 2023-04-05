class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        int max=Integer.MIN_VALUE,c=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1])
                c++;
            else if(nums[i]!=nums[i+1])
                c=0;
            max=Math.max(max,c);
        }
        return max+1;
        // HashSet<Integer> a=new HashSet<>();
        // for (int i:nums) a.add(i);
        // int max=0;
        // for(int i:nums){
        //     if(!a.contains(i-1)){
        //         int curr=1;
        //         int num=i;
        //         while(a.contains(num+1)){
        //             curr++; num++;
        //         }
        //         max=Math.max(max,curr);
        //     }
        // }
        // return max;
    }
}
