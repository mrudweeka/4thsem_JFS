 class SinkNode {
       public static int countSinks(int[][] matrix) {
        int n = matrix.length;
        int count = 0;
		for (int i = 0; i < n; i++) {
            boolean isSink = true;
			for (int j = 0; j < n; j++) {
                if (matrix[i][j] != 0) {
                    isSink = false;
                    break;
                }
            }
			if (isSink) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] graph = {
            {0,1,1,0,1},
            {1,0,1,1,0}, 
            {0,1,0,1,1},
			      {0,0,0,0,0},
			      {0,0,0,0,0}
        };
        System.out.println(countSinks(graph));
    }
}
