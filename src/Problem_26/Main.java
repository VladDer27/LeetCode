package Problem_26;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int maxSeen = -101;
        int nextIndexToInsert = 0;
        int answer = 0;
        for (int num : nums) {
            if (num > maxSeen) {
                answer += 1;
                maxSeen = num;
                nums[nextIndexToInsert] = num;
                nextIndexToInsert += 1;
            }
        }
        return answer;
    }
}
