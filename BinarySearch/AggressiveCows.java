class Solution {
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int low=0,high=stalls[n-1]-stalls[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(stalls,n,k,mid))
            low=mid+1;
            else
            high=mid-1;
        }
        return high;
    }
    
    public static boolean isPossible(int[] stalls,int n,int k,int mid){
        int lastPlaced=stalls[0],count=1;
        for(int i=1;i<n;i++){
            if(stalls[i]-lastPlaced>=mid){
            count++;
            lastPlaced=stalls[i];
            }
            if(count==k)
            return true;
        }
        return false;
    }
}
