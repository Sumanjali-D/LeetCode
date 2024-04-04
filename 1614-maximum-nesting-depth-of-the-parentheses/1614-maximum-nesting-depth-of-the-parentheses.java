class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<Character>();
        int ans=0;
        for(char c: s.toCharArray()){
            if(c=='('){
                stack.push(c);
            }else if(c==')'){
                stack.pop();
            }
            ans=Math.max(ans,stack.size());
        }
        return ans;
    }
}