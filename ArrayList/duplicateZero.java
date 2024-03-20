package ArrayList;

import java.util.Arrays;

public class duplicateZero {
    public static void duplicateZeros(int[] arr) {

        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == 0) {
        //         for (int j = arr.length - 1; j >= i + 1; j--) {
        //             arr[j] = arr[j - 1];
        //         }
        //         i = i + 1;
        //     }
        // }
        // System.out.println(Arrays.toString(arr));

        // int[] dupArr = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        //     dupArr[i] = arr[i];
        // }
        
        int[] dupArr = arr.clone(); //instead of using above approach, using this method to reduce time complexity
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(dupArr));

        int ap = 0;
        int dp = 0;

        while (ap < arr.length) {
            arr[ap] = dupArr[dp];
            ap++;

            if (dupArr[dp] == 0 && ap < arr.length) {
                arr[ap] = dupArr[dp];
                ap++;
            }
            dp++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] a = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(a);
    }
}
