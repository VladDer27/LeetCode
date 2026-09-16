package Problem_27;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        int nextIndexToInsert = 0;
        int k = 0;
        for (int num : nums) {
            if (num != val) {
                k += 1;
                nums[nextIndexToInsert] = num;
                nextIndexToInsert += 1;
            }
        }
        return k;
    }
}
