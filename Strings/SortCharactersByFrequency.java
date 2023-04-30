class Solution {
    public String frequencySort(String s) {
        StringBuilder ans=new StringBuilder();
        HashMap<Character,Integer>a=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char t=s.charAt(i);
            a.put(t,a.getOrDefault(t,0)+1);
        }
        PriorityQueue<Character> heap=new PriorityQueue<>((aa,bb)->a.get(bb)-a.get(aa));
        for(char x:a.keySet()) heap.add(x);
        for(int i=0;i<a.size();i++) 
        {
            char tx=heap.remove();
            String temp=(tx+"").repeat(a.get(tx));
            ans.append(temp);
        }
        return ans.toString();

        
    }
}
