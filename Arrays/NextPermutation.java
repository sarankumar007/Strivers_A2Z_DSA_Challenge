class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(0,n-1,nums);
        }
        else{
        for(int i=n-1;i>index;i--){
            if(nums[i]>nums[index]){
                int t=nums[i];
                nums[i]=nums[index];
                nums[index]=t;
                break;
            }
        
        }
        reverse(index+1,n-1,nums);
        }
    }
        public void reverse(int i,int j,int[] nums){
        while(i<j){
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;j--;
        }
        }
    
}
