class Solution {
    public void rotate(int[][] m) {
        for(int i=0;i<m.length;i++){
            for(int j=i;j<m[0].length;j++){
                int t=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=t;
                
            }
        }
        
        for(int i=0;i<m.length;i++){
            int k=m[0].length-1;
            for(int j=0;j<m[0].length/2;j++){
                int t=m[i][j];
                m[i][j]=m[i][k];
                m[i][k]=t;
                k--;
            }
        }
      
    }
}
