package Pattern;

public class pattern15 {
    public static void main(String[] args) {
        // int n = 7;
        // for (int r = 1; r <= n; r++) {
        //     if (r == 1 || r == n) {
        //         for (int c = 1; c <= n; c++) {
        //             System.out.print("4 ");
        //         }
        //     } else if (r == 2 || r == n - 1) {
        //         for (int c = 1; c <= n; c++) {
        //             if (c == 1 || c == n) {
        //                 System.out.print("4 ");
        //             } else {
        //                 System.out.print("3 ");
        //             }
        //         }
        //     } else if (r == 3 || r == n - 2) {
        //         for (int c = 1; c <= n; c++) {
        //             if (c == 1 || c == n) {
        //                 System.out.print("4 ");
        //             } else if(c==2 || c==n-1) {
        //                 System.out.print("3 ");
        //             }else{
        //                 System.out.print("2 ");
        //             }
        //         }
        //     }else{
        //         for(int c=4; c>=1; c--){
        //             System.out.print(c+" ");
        //         }
        //         for(int c=2; c<=4; c++){
        //             System.out.print(c+" ");
        //         }
        //     }
        //     System.out.println();
        // }

        int n = 4;
        int N = 2*n;
        for(int r=1; r<=2*n-1; r++){
            for(int c=1; c<=2*n-1; c++){
                int atEvryindex = n + 1 - Math.min(Math.min(r,c), Math.min(N-r,N-c));
                System.out.print(atEvryindex + " ");
            }
            System.out.println();
        }
    }
}

// 4 4 4 4 4 4 4 
// 4 3 3 3 3 3 4
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4
// 4 3 2 2 2 3 4
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4