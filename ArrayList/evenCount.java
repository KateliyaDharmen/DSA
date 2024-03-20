package ArrayList;

public class evenCount {
    public static int findNumbers(int[] nums) {
        int numCount = 0;
        int evenCount = 0;

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != 0) {
                nums[i] /= 10;
                numCount++;
            }
            if (numCount % 2 == 0) {
                evenCount++;
            }
            numCount = 0;

        }
        return evenCount;
    }

    public static void main(String[] args) {
        int[] arr = { 555, 901, 482, 1771 };
        System.out.println("even count is:" + findNumbers(arr));
    }
}
