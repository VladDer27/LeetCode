package Problem_35;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 0;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (right + left) / 2;
            if (target > nums[middle]){
                left = middle + 1;
            }
            else {
                right = middle - 1;
            }
        }
        return right + 1;
    }
}
