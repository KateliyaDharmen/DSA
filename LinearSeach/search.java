package LinearSeach;

public class search {
    public static void main(String[] args) {
        int[] nums = {2,12,34,5,-3,11,45,6,19,-5,-22};
        int element = -22;
        int ans = linearSearch(nums, element);
        System.out.println(ans);
    }

    //this function return index of the element
    static int linearSearch(int[] arr, int target){

        if(arr.length == 0){
            return -1;
        }else{
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] == target) {
                    return index;
                }
            }
        }

        return -1;
    }
}
