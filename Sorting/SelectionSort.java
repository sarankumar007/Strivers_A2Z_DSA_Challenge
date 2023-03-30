
class Solution
{

	
	void selectionSort(int arr[], int n)
	{
	    for(int i=0;i<n-1;i++){
	        int min=i;
	        for(int j=i;j<n;j++){
	            if(arr[j]<arr[min]){
	              min=j;
	            }
	        }
	        int t=arr[i];
	        arr[i]=arr[min];
	        arr[min]=t;
	    }
	}
}
