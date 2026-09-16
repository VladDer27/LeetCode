package Problem_58;

public class Main {
    public static void main(String[] args) {
        String s = "a";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int currentWordLength = 0;
        int lastWordLength = 0;
        for (char aChar : chars) {
            if (aChar == ' ') {
                lastWordLength = currentWordLength == 0 ? lastWordLength : currentWordLength;
                currentWordLength = 0;
            } else {
                currentWordLength += 1;
            }
        }
        lastWordLength = currentWordLength == 0 ? lastWordLength : currentWordLength;
        return lastWordLength;
    }
}
