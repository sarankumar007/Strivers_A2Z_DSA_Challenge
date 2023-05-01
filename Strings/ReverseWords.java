class Solution {
    public String reverseWords(String s) {
        String[] a=s.split(" ");
        StringBuilder x=new StringBuilder();
        for(int i=0;i<a.length;i++){
           if(!a[i].isEmpty()){
           x.insert(0,a[i]);
           if(i<a.length-1)
           x.insert(0," ");
           }
        }
    
       return x.toString();
    }
}
