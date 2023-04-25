class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=(nums1.length+nums2.length)/2+1;
        int size=nums1.length+nums2.length;
        double [] a=new double[n];
        int left=0,right=0,i=0;
        while(left<nums1.length && right<nums2.length){
            if(i==n)
            break;
            if(nums1[left]<=nums2[right])
            {
                a[i++]=nums1[left];
                left++;
            }
            else{
            a[i++]=nums2[right];
            right++;
            }
        }
        while(left<nums1.length){
             if(i==n)
            break;
            a[i++]=nums1[left];
            left++;
        }
        while(right<nums2.length){
             if(i==n)
            break;
            a[i++]=nums2[right];
            right++;
        }
        if(size%2==0)
        {
            double t=a[a.length-1];
            double tt=a[a.length-2];
            return (double) (t+tt)/2.0;
        }
        return a[a.length-1];
    }
}
