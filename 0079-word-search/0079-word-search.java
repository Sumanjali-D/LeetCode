class Solution {
    public boolean search(char[][] board,String word,int i, int j, int curr){
         int m = board.length;
        int n = board[0].length;
        if(i<0||i>=m||j<0||j>=n){
            return false;
        }
        if(board[i][j]=='#'){
            return false;
        }
        if(curr<word.length()&&word.charAt(curr)!=board[i][j]){
            return false;
        }
        if(curr==word.length()-1){
            return true;
        }
        char temp=board[i][j];
        board[i][j]='#';
        int[] di={-1,0,0,1};
        int[] dj={0,-1,1,0};
        boolean found=false;
        for(int k=0;k<4;k++){
            if(search(board,word,i+di[k],j+dj[k],curr+1)){
                found=true;
            }
        }
        board[i][j]=temp;
        return found;
    }
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)){
                    if(search(board,word,i,j,0)){
                        return true;
                }
            }
        }
    }
  
        return false;
    }
}