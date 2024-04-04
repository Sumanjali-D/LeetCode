class Solution {
    public void dfs(int node,int vis[],ArrayList<ArrayList<Integer>> al){
        vis[node]=1;
        for(Integer it : al.get(node)){
            if(vis[it]==0){
                dfs(it,vis,al);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
        int n = isConnected.length;
        for(int i=0;i<n;i++){
            al.add(new ArrayList<Integer>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                    al.get(i).add(j);
                    al.get(j).add(i);
                }
            }
        }
        
        int vis[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                count=count+1;
                dfs(i,vis,al);
            }
        }
        return count;
    }
}
