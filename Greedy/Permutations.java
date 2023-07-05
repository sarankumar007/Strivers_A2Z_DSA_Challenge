class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean [] freq=new boolean[nums.length];
        permutation(ds,nums,ans,freq);
        return ans;
    }
    public void permutation(List<Integer> ds,int[] nums,List<List<Integer>> ans,boolean [] freq){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                ds.add(nums[i]);
                freq[i]=true;
                permutation(ds,nums,ans,freq);
                freq[i]=false;
                ds.remove(ds.size()-1);
            }
        }
    }
}
