class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=-1,ans=-1;
        for(int i:piles)
        high=Math.max(i,high);
        while(low<=high){
            int mid=low+(high-low)/2;
            if(test(piles,mid)<=h){
            high=mid-1;
            ans=mid;
            }
            else
            low=mid+1;
        }
        return ans;
    }

    public long test(int []piles,int mid){
        long hours=0;
        for(int i:piles){
            int time=i/mid;
            hours+=time;
            if(i%mid!=0)
            hours++;
        }
        return hours;
    }
}
