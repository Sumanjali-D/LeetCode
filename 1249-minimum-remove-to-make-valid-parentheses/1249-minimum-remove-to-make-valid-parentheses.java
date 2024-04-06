class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        StringBuilder ans = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(sb.charAt(i)=='('){
                stack.push(i);
            }else if(s.charAt(i)==')'){
                if(!stack.isEmpty()){
                     stack.pop();
                }else{
                      sb.setCharAt(i,'$');
                }
            }
        } 
        
        while(!stack.isEmpty()){
            sb.setCharAt(stack.pop(),'$');
        }
        
        for(char ch:sb.toString().toCharArray()){
            if(ch!='$'){
                ans.append(ch);
            }
        }
        return ans.toString();
        
    }
}