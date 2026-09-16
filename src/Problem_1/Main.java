package Problem_1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 3};
        int target = 6;
        int[] twoSum = twoSum(nums, target);
        System.out.println(twoSum[0] + " " + twoSum[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> differences = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            differences.put(target - nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (differences.containsKey(nums[i]) && differences.get(nums[i]) != i) {
                return new int[]{i, differences.get(nums[i])};
            }
        }
        return new int[0];
    }
}
