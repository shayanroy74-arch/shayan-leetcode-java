class Solution {
    public void setZeroes(int[][] matrix) {
        
        HashSet<Integer> hr = new HashSet<>();
        HashSet<Integer> hc = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    hr.add(i);
                    hc.add(j);
                }
            }
        }

        Iterator<Integer> it = hr.iterator();
        while (it.hasNext()) {
            //System.out.println(it.next());
            int r = it.next();
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[r][j] = 0;
            }
        }

        Iterator<Integer> ic = hc.iterator();
        while (ic.hasNext()) {
            //System.out.println(it.next());
            int c = ic.next();
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][c] = 0;
            }
        }

    }
}