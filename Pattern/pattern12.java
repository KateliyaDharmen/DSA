package Pattern;

public class pattern12 {
    public static void main(String[] args) {
        int n = 5;
        for (int r = 1; r <= 2*n - 1; r++) {
            int totalCol = r <= n ? n-r+1 : r-n+1;

            int totalSpace = n - totalCol;

            for(int s = 1; s <= totalSpace; s++){
                System.out.print(" ");
            }

            for(int c = 1; c <= totalCol; c++){
                System.out.print("* ");
            } 
            System.out.println();
        }
    }
}

// * * * * * 
//  * * * *
//   * * *
//    * *
//     *
//    * *
//   * * *
//  * * * *
// * * * * *