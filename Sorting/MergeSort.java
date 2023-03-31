class Solution {
    public int[] sortArray(int[] nums) {
    mergeSort(nums,0,nums.length-1);
    return nums;
    }

    public void mergeSort (int[] arr,int low,int high){
        if(low>=high)
        return;
        int mid=low+(high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public void merge (int[] arr,int low, int mid ,int high){
        int[] t=new int[high-low+1];
        int k=0,left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                t[k++]=arr[left++];
            }
            else
            {
                t[k++]=arr[right++];
            }
        }
        while(left<=mid){
           t[k++]=arr[left++];
        }
        while(right<=high){
            t[k++]=arr[right++];
        }
        for(int i=low;i<=high;i++){
            arr[i]=t[i-low];
        }
    }
}
