class Solution
{
  
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      for(int i=0;i<n;i++){
          for(int j=i;j>0;j--){
              if(arr[j]<arr[j-1]){
                  int t=arr[j];
                  arr[j]=arr[j-1];
                  arr[j-1]=t;
              }
          }
      }
  }
}
