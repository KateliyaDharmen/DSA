package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> result = new ArrayList<Integer>();
        int n = matrix.length;
        int m = matrix[0].length;

        int top = 0, left = 0, bottom = n-1, right = m-1;
        while (top <= bottom && left <= right) {
            //for moving left to right 
            for(int i=left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;

            //for moving top to bottom
            for(int i=top; i<=bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;

            //for moving right to left
            if(top <= bottom){
                for(int i=right; i>=left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //for moving bottom to top
            if(left <= right){
                for(int i=bottom; i>=top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }

        }

        return result;
    }
    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        List<Integer> ans = spiralOrder(mat);
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
