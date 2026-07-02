class Solution {

    public boolean dfs(int [][] prerequisites, int start, boolean[] visited, boolean[] pathvisited){

        if(pathvisited[start]){
            return true;
        }

        if(visited[start]){
            return false;
        }

        visited[start] = true;
        pathvisited[start] = true;

        for(int i=0;i<prerequisites.length;i++){
            if(prerequisites[i][1] == start){
                int x = prerequisites[i][0];

                if(dfs(prerequisites, x, visited, pathvisited)){
                    return true;
                }
            }
        }

        pathvisited[start] = false;
        return false;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        boolean[] visited = new boolean[numCourses];
        boolean[] pathvisited = new boolean[numCourses];

        for(int i=0;i<numCourses;i++){
            if(!visited[i]){
                if(dfs(prerequisites, i, visited, pathvisited)){
                    return false;
                }
            }
        }

        return true;
    }
}