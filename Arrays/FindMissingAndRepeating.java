class Solve {
    int[] findTwoElement(int nums[], int n) {
        int repeat=-1,missing=-1;
         int[] a=new int[nums.length+1];
       for(int i=0;i<nums.length;i++){
           a[nums[i]]++;
       }
       
       for(int i=1;i<a.length;i++){
           if(repeat!=-1 && missing!=-1)
           break;
           if(a[i]==0){
           missing=i;
           }
           if(a[i]==2){
               repeat=i;
           }
       }
        return new int[]{repeat,missing};
    }
}
