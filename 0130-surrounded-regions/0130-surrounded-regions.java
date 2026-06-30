class Solution {
    public void dfs(char[][] board, boolean[][] visited, int x, int y) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) {
            return;
        }
        if (!visited[x][y] && board[x][y] == 'O') {
            visited[x][y] = true;
            dfs(board, visited, x + 1, y);
            dfs(board, visited, x - 1, y);
            dfs(board, visited, x, y + 1);
            dfs(board, visited, x, y - 1);
            
        }
    }

    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (i == 0 || i == board.length - 1) {
                    if (board[i][j] == 'O' && !visited[i][j]) {
                        //list.add(new int[] { i, j });
                         dfs(board, visited, i, j);
                    }

                } else {
                    if (j == 0 || j == board[0].length - 1) {
                        if (board[i][j] == 'O' && !visited[i][j]) {
                            //list.add(new int[] { i, j });
                            dfs(board, visited, i, j);
                        }
                    }
                }
            }
        }

        /*for (int i = 0; i < list.size(); i++) {
            int x = list.get(i)[0];
            int y = list.get(i)[1];
            if (!visited[x][y]) {
                dfs(board, visited, x, y);

            }
        }*/

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O' && !visited[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }

    }
}