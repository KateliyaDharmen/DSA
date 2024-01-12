package ArrayList;

import java.util.Arrays;

public class swaparray {
    public static void main(String[] args) {
        int[] arr = {45,6,70,60};
        swap(arr, 0, 2);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int a,int b) //a and b refer to a index
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
