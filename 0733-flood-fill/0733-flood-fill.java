class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;

        boolean[][] visited = new boolean[m][n];
        

        int[][] dir = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };
        int initial=0;
        Queue<int[]> q = new LinkedList<>();

       
               
                if (!visited[sr][sc]) {

                    initial = image[sr][sc];
                    image[sr][sc] = color;
                    visited[sr][sc] = true;
                }
                    q.offer(new int[]{sr, sc});

                    while (!q.isEmpty()) {
                        int[] curr = q.poll();
                        
                        for (int[] d : dir) {

                            int nr = curr[0] + d[0];
                            int nc = curr[1] + d[1];

                            if (nr >= 0 && nr < m &&
                                nc >= 0 && nc < n &&
                                !visited[nr][nc] &&
                                image[nr][nc] == initial) {

                                visited[nr][nc] = true;
                                image[nr][nc] = color;
                                q.offer(new int[]{nr, nc});
                            }
                        }
                    }
                
            
        

        return image;
    }
}