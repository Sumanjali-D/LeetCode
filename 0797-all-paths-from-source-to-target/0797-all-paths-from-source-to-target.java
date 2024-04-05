class Solution {
    public void dfs(int node,int end,int[][] adj,List<List<Integer>> al,List<Integer> list){     
        
        if(node==end){
            list.add(node);
            al.add(new ArrayList<Integer>(list));
            list.remove(list.size()-1);
            return;
        }
        list.add(node);
        for(int n:adj[node]){
            dfs(n,end,adj,al,list);    
        }
        list.remove(list.size()-1);
       return; 
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> al= new ArrayList<>();
        int n = graph.length;
        List<Integer> list= new ArrayList<>();
        dfs(0,n-1,graph,al,list);
        return al;
    }
}