class Solution {
    
    public void dfs(int [][] isConnected, boolean [] visited,int curr){
        for(int i =0;i<isConnected.length;i++){
            if(isConnected[curr][i] == 1){
                if(!visited[i]){
                    visited[i] = true;
                    dfs(isConnected, visited, i);                
                }
            }
        }
        
    }
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int ctr = 0;
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                ctr++;
                visited[i] = true;
                dfs(isConnected, visited, i);                
            }
        }
        
         
        return ctr;
    }
}