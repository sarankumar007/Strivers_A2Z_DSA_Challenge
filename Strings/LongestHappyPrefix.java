class Solution {
    public String longestPrefix(String s) {
        int n = s.length();
        int i=1,j=0;
        int[] lps=new int[n];
        while(i<n){
            if(s.charAt(i) == s.charAt(j)){
                 j++;
                 lps[i] = j;
                 i++;
            }
            else{
                if(j > 0){
                    j = lps[j-1];
                }
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }

        int lenOfPrefixSuffix = lps[n-1];
        String ans = s.substring(0,lenOfPrefixSuffix);
        return ans;
        

    }
}
