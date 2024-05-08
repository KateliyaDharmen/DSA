package Pattern;

public class pattern9 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<2 * n; i++){
            int totalCol = i > n ? (2*n)-i : i;
            int totalSpace = n - totalCol;

            for(int s=0; s<totalSpace; s++){
                System.out.print(" ");
            }

            for(int j=0; j<totalCol; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


//         * 
//       * * 
//     * * * 
//   * * * * 
// * * * * * 
//   * * * *
//     * * *
//       * *
//         *

//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *

//             *
//          * *
//       * * *
//    * * * *
// * * * * *
//    * * * *
//       * * *
//          * *
//             *