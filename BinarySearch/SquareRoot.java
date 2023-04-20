class Solution {
    public int mySqrt(int x) {
        if(x==0)
            return 0;
        long l=1,h=x,mid,ans=0;
        while(l<=h){
            mid=l+(h-l)/2;
            if(mid*mid>x){
                
                h=mid-1;
            }
            else if(mid*mid<x)
            {
                l=mid+1;
                ans=mid;
            }
            else{
                return (int)mid;
                
        }
        
    }
        return (int)ans;
}
}
