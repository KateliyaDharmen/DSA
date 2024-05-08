package Pattern;

public class pattern14 {
    public static void main(String[] args) {
        int n = 4;
        for (int r = 1; r <= 2 * n - 1; r++) {
            int col = r > n ? 2 * n - r : r;
            int space = n-col;
            for(int s=1; s<=space; s++){
                System.out.print(" ");
            }
            for (int c = col; c >= 1; c--) {
                System.out.print(c);
            }
            for (int c = 2; c <= col; c++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

//    1
//   212
//  32123
// 4321234
//  32123
//   212
//    1