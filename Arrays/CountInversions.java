import java.util.* ;
import java.io.*; 
public class Solution {
    private static long c=0;
    public static long getInversions(long arr[], int n) {
        
         mergeSort(arr,0,arr.length-1);
    return c;
    }

    public static void mergeSort (long[] arr,int low,int high){
        if(low>=high)
        return;
        int mid=low+(high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static  void merge (long[] arr,int low, int mid ,int high){
        long[] t=new long[high-low+1];
        int k=0,left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                t[k++]=arr[left++];
            }
            else
            {
                t[k++]=arr[right++];
                c+=mid-left+1;
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
