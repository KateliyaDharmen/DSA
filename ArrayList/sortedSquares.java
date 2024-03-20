package ArrayList;

import java.util.Arrays;

public class sortedSquares {
    public static int[] SortedSquares(int[] nums) {

        //O(n^2)
        
        // for(int i=0; i<nums.length; i++){
        //     nums[i] *= nums[i]; 
        // }

        // for (int i = 0; i < nums.length-1; i++) {
        //     int min = i;
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[j] < nums[min]) {
        //             min = j;
        //         }
        //     }
        //     int temp = nums[min];
        //     nums[min] = nums[i];
        //     nums[i] = temp;
        // }
        // return nums;

        //O(n)

        int n = nums.length;
        int ans[] = new int[n];

        int left = 0, right = n-1, end = n-1;

        while(left <= right) {
            if(Math.abs(nums[left]) > Math.abs(nums[right])) {
                ans[end--] = nums[left] * nums[left];
                left++;
            }
            else {
                ans[end--] = nums[right] * nums[right];
                right--;
            } 
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { -3,4,5,-2 };
        int[] sortedSquaresArray = SortedSquares(arr);
        System.out.println(Arrays.toString(sortedSquaresArray));
    }
}


