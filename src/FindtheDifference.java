public class FindtheDifference {

    public static char finding(String s, String t) {

        int charSum = 0;

        // Calculate the ASCII sum of characters in t
        for (char c : t.toCharArray()) {
            charSum += c;
        }

        // Subtract the ASCII sum of characters in s
        for (char c : s.toCharArray()) {
            charSum -= c;
        }

        // The remaining value is the ASCII value of the extra character in t
        return (char) charSum;
    }





    public static void main(String[] args) {

        System.out.println(FindtheDifference.finding("abcde","abcd"));
    }
}
