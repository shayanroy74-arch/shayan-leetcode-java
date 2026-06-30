class Solution {
    public void dfs(char[][] grid, boolean[][] visited, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length){
            return;
        }
            
        if (!visited[i][j] && grid[i][j] == '1') {
            visited[i][j] = true;
            dfs(grid, visited,i + 1, j); // down
            dfs(grid, visited,i - 1, j); // up
            dfs(grid, visited,i, j + 1); // right
            dfs(grid, visited,i, j - 1); // left
        }
    }

    public int numIslands(char[][] grid) {
       // int[] start = new int[2];
        int ctr = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    
                             ctr++;        
                    dfs(grid, visited, i,j);
                     
                }
            }
        }
        return ctr;
    }
}