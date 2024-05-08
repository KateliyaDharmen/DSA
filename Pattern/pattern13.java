package Pattern;

public class pattern13 {
    public static void main(String[] args) {
        int n = 5;
        for(int r=1; r<=n; r++){
            for(int s=1; s<=n-r; s++){
                System.out.print("  ");
            }
            for(int c=r; c>=1; c--){
                System.out.print(c + " ");
            }
            for(int c=2; c<=r; c++){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

//         1 
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5