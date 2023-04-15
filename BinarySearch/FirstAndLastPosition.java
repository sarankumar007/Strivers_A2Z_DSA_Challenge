class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0)
            return new int[]{-1,-1};
        int [] res=new int[2];
        int l=0,h=nums.length-1,mid,index=-1;
        while(l<=h){
            mid=l+(h-l)/2;
            if(target<nums[mid])
                h=mid-1;
            else if(target>nums[mid])
                l=mid+1;
            else if(target==nums[mid])
                {
                    h=mid-1;
                    index=mid;
                }
        }
        res[0]=index;
        l=0;h=nums.length-1;mid=-1;index=-1;
         while(l<=h){
            mid=l+(h-l)/2;
            if(target<nums[mid])
                h=mid-1;
            else if(target>nums[mid])
                l=mid+1;
            else if(target==nums[mid])
                {
                    l=mid+1;
                    index=mid;
                }
        }
        res[1]=index;
        return res;
    }
}
