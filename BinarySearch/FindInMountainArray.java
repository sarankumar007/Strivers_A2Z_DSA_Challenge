/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int l=0,h=mountainArr.length()-1,mid;
        while(l<h){
            mid=l+(h-l)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1))
                l=mid+1;
            else
                h=mid;
                
        }
        int t=binarySearchAscending(0,h,target,mountainArr);
        if(t!=-1)
            return t;
        t=binarySearchDescending(h,mountainArr.length()-1,target,mountainArr);
        
        return t;
        
    }
    
    public int binarySearchAscending(int start,int end,int t,MountainArray mountainArr){
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mountainArr.get(mid)>t)
                end=mid-1;
            else if(mountainArr.get(mid)<t)
                start=mid+1;
            else
                return mid;
        }
        return -1;
    }
        public int binarySearchDescending(int start,int end,int t,MountainArray mountainArr){
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mountainArr.get(mid)>t)
                start=mid+1;
            else if(mountainArr.get(mid)<t)
                end=mid-1;
            else
                return mid;
        }
        return -1;
    }
}
