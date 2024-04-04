class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int palin=x;
        int temp=0;
        while(x!=0){
            temp=temp*10+x%10;
            x=x/10;   
        }
        if(temp==palin){
            return true;
        }
        return false;
    }
}