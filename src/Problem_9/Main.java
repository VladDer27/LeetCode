package Problem_9;

public class Main {
    public static void main(String[] args) {
        int x = -121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        char[] charX = String.valueOf(x).toCharArray();
        int left = 0;
        int right = charX.length - 1;
        while (left <= right) {
            if (charX[left] != charX[right]) {
                return false;
            }
            left += 1;
            right -= 1;
        }
        return true;
    }
}
