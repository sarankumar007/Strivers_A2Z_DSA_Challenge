class Solution {
    public int search(int[] nums, int target) {
       return bs(nums,target,0,nums.length-1);
    }

    public int bs(int[] nums,int target,int s,int e){
        if(s>e)
        return -1;
        int mid=s+(e-s)/2;
        if(nums[mid]==target)
        return mid;
        if(nums[mid]>=nums[s]){
            if(target>=nums[s] && target<=nums[mid])
            return bs(nums,target,s,mid-1);
            return bs(nums,target,mid+1,e);
        }
        else{
            if(target>=nums[mid] && target<=nums[e])
            return bs(nums,target,mid+1,e);
            return bs(nums,target,s,mid-1);
        }

    }
}
