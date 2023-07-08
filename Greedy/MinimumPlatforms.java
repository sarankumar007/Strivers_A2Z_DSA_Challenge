class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=1,j=0,ans=1,p=1;
        while(i<n-1 && j<n-1){
            if(arr[i]<=dep[j]){
                p++;
                i++;
            }
            else if(arr[i]>dep[j]){
                p--;
                j++;
            }
            ans=Math.max(ans,p);
        }
        return ans;
        
    }
    
}
