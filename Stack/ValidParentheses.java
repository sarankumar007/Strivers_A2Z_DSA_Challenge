class Solution {
    public boolean isValid(String s) {
        Stack<Character>stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            char t=s.charAt(i);
            if(t=='('|| t=='{'||t=='['){
                stk.push(t);
            }
            else if(!stk.isEmpty()&&((t==')'&& stk.peek()=='(')||(t=='}'&& stk.peek()=='{')||(t==']'&&stk.peek()=='['))){
                
                    stk.pop();
            }
            else{
                    return false;
            }
            
        
       
    }
       return stk.isEmpty();
  }
}
