package Problem_28;

public class Main {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        char[] haystackCharArr = haystack.toCharArray();
        char[] needleCharArr = needle.toCharArray();
        int firstOccurrenceIndex = -1;
        int haystackIndex = 0;
        int needleIndex = 0;
        while (haystackIndex < haystackCharArr.length) {
            if (haystackCharArr[haystackIndex] == needleCharArr[needleIndex]) {
                if (needleIndex == 0) {
                    firstOccurrenceIndex = haystackIndex;
                }
                needleIndex += 1;
                haystackIndex += 1;
                if (needleIndex == needleCharArr.length) {
                    return firstOccurrenceIndex;
                }
            } else {
                if (needleIndex == 0) {
                    haystackIndex += 1;
                } else {
                    haystackIndex = firstOccurrenceIndex + 1;
                }
                needleIndex = 0;
            }
        }
        return -1;
    }
}
