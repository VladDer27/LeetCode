package Problem_66;

public class Main {
    public static void main(String[] args) {
        int[] digits = new int[]{9, 9, 9};
        for (int digit : plusOne(digits)) {
            System.out.print(digit);
        }
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i > -1; i--) {
            digits[i] += 1;
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                break;
            }
        }
        if (digits[0] == 0) {
            int[] increasedDigits = new int[digits.length + 1];
            increasedDigits[0] = 1;
            System.arraycopy(digits, 0, increasedDigits, 1, digits.length);
            return increasedDigits;
        }
        return digits;
    }
}
