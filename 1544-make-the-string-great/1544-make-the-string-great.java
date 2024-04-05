class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        int n = s.length();
        char ch1=stack.peek();
        for(int i=1;i<n;i++){
            char ch2=s.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch2);
                continue;
            }
            ch1= stack.peek();
            if(Math.abs(ch1-ch2)==32){
                stack.pop();
            }else{
                 stack.push(ch2);   
            }
    
        }
        StringBuilder sb=new StringBuilder();
       while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}