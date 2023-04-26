class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1,high=nums[0],ans=-1;
        for(int x:nums)
        high=Math.max(high,x);
        while(low<=high){
            int mid=low+(high-low)/2;
            if(divisionSum(nums,mid)<=threshold)
            {
                ans=mid;
                high=mid-1;
            }
            else
           low=mid+1;
        }

        return ans;
    }
    
    public int divisionSum(int[] nums,int divisor){
        int sum=0;
        for(int x:nums){
            sum+=Math.ceil(x/(divisor*1.0));
        }
        return sum;
    }
}
