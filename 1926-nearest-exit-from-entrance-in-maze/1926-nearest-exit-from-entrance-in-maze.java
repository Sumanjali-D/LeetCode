class Solution {
    public class Pair{
        int a;
        int b;
        public Pair(int a,int b){
            this.a = a;
            this.b = b;
        }
    }
    public int nearestExit(char[][] maze, int[] entrance) {
        int[] di={-1,0,0,1};
        int[] dj={0,1,-1,0};
        int m=maze.length;
        int n=maze[0].length;
        Queue<Pair> queue = new LinkedList<>();
        int steps=1;
        Pair start = new Pair(entrance[0],entrance[1]);
        queue.add(start);
        while(!queue.isEmpty()){
            //first we consider the size then we go to the queue and remove the elements and add its adj elemts
            int size=queue.size();
            for(int i=0;i<size;i++){
                Pair pair = queue.poll();
                for(int j=0;j<4;j++){
                    int xc=pair.a+di[j];
                    int yc = pair.b+dj[j];
                    if(xc<0||xc>=m||yc<0||yc>=n){
                        continue;
                    }
                    if(maze[xc][yc]!='+'){
                        if((xc==0||xc==m-1||yc==0||yc==n-1)&& (xc!=entrance[0] || yc!=entrance[1])){
                            return steps;
                        }else{
                            maze[xc][yc]='+';
                            queue.add(new Pair(xc,yc));
                        }
                    }
                }
            }
                 steps++;
          }
               return -1;
        }
}