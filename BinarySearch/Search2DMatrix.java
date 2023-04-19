class Solution {
    public boolean searchMatrix(int[][] m, int t) {
        int f=0;
        for(int i=0;i<m.length;i++){
            if(m[i][0]<=t)
            {
                f=i;
            }
        }
      int l=0,h=m[0].length-1,mid;
        while(l<=h){
            mid=l+(h-l)/2;
            if(m[f][mid]>t)
                h=mid-1;
            else if(m[f][mid]<t)
                l=mid+1;
            else
                return true;
        }
       
        return false;
        }
}
