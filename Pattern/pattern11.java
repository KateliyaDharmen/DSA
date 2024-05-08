package Pattern;

public class pattern11 {
    public static void main(String[] args) {
        int n = 5;
        for(int r=1; r<=n; r++){
            int totalCol = n-r+1;
            for(int s=1; s<=n-totalCol; s++){
                System.out.print(" ");
            }
            for(int c=1; c<=totalCol; c++){
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