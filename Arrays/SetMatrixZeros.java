class Solution {
    public void setZeroes(int[][] matrix) {
        int rl=matrix.length,cl=matrix[0].length;
        int []r=new int[rl];
        int []c=new int[cl];
        Arrays.fill(r,-1);
        Arrays.fill(c,-1);
        for(int i=0;i<rl;i++){
            for(int j=0;j<cl;j++){
                if(matrix[i][j]==0){
                    r[i]=0;c[j]=0;
                }
            }
        }
        for(int i=0;i<rl;i++){
            for(int j=0;j<cl;j++){
                if(r[i]==0 || c[j]==0)
                    matrix[i][j]=0;
                
            }
        }
    }
}
