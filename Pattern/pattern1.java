package Pattern;

public class pattern1 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        } 
    }
}

// 1
// 22
// 333
// 4444
// 55555

// 1
// 12
// 123
// 1234
// 12345