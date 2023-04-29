class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap <Character,Character>a=new HashMap<>();
        if(s.length()!=t.length() || s==null || t==null)
            return false;
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i),c2=t.charAt(i);
            if(a.containsKey(c1)){
                if(a.get(c1)!=c2)
                    return false;
            }
            else{
                if(a.containsValue(c2))
                    return false;
                a.put(c1,c2);
            }
        }
        return true;
    }
}
