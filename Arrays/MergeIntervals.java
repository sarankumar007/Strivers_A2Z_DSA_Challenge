class Solution {
    public int[][] merge(int[][] m) {
      Arrays.sort(m,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]>merged=new ArrayList<>();
        for(int[] interval:m){
            if(merged.isEmpty()|| merged.get(merged.size()-1)[1]<interval[0])
                merged.add(interval);
            else
                merged.get(merged.size()-1)[1]=Math.max(merged.get(merged.size()-1)[1],interval[1]);
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
