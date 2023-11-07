public class Longestpalindrome {
    public static int longestPalindromeLength(String s) {
        int[] frequency = new int[128]; // Assuming ASCII characters

        for (char c : s.toCharArray()) {
            frequency[c]++;

        }

        int oddCount = 0;

        for (int count : frequency) {
            oddCount += count % 2;
        }

        return oddCount <= 1 ? s.length() : s.length() - oddCount + 1;
    }

    public static void main(String[] args) {
        System.out.println(Longestpalindrome.longestPalindromeLength("daacccsccca"));
    }
}
