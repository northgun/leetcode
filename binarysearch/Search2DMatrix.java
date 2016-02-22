public class Search2DMatrix {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0){
            return false;
        }
        if (matrix[0] == null || matrix[0].length == 0){
            return false;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0, end = rows-1;
        while (start + 1 < end){
            int mid = start + (end - start)/2;
            if (matrix[mid][0] < target){
                start = mid;
            }else if (matrix[mid][0] > target){
                end = mid;
            }else{
                return true;
            }
        }
        
        int row = 0;
        if (target < matrix[start][0]){
            return false;
        }
        if (target > matrix[end][0]){
            row = end;
        }
        if (target > matrix[start][0] && target < matrix[end][0]){
            row = start;
        }
        
        start = 0; end = cols - 1;
        while (start + 1 < end){
            int mid = start + (end - start)/2;
            if (matrix[row][mid] == target){
                return true;
            }else if (target < matrix[row][mid]){
                end = mid;
            }else{
                start = mid;
            }
        }
        if(matrix[row][start] == target || matrix[row][end] == target){
            return true;
        }else{
            return false;
        }

    }
}

