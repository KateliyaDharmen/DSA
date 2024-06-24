package ArrayList;

public class transposeMatrix {

    public void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // reverse the column of matrix
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0; i<matrix.length; i++){
            int start = 0, end = n - 1;
            while (start < end) {
  
                // Swap the element
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
      
                // Increment start and decrement
                // end for next pair of swapping
                start++;
                end--;
            }

        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
                
        };
        transposeMatrix t = new transposeMatrix();
        t.transpose(mat);
    }
}

