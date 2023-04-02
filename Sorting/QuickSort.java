class Solution {
    public int[] sortArray(int[] nums) {
    quickSort(nums,0,nums.length-1);
    return nums;
    }

    public void quickSort(int[]arr,int low,int high){
        if(low<high){
            int partitionIndex=partition(arr,low,high);
            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);
        }
    }

    public int partition(int [] arr,int low ,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1) i++;
            while(arr[j]>pivot && j>=low+1) j--;
            if(i<j){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        int t=arr[low];
        arr[low]=arr[j];
        arr[j]=t;
        return j;
    } 
}
