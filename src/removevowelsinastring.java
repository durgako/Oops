public class removevowelsinastring {

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            while (left < right && !isVowel(chars[left])) {
                left++;
            }

            while (left < right && !isVowel(chars[right])) {
                right--;
            }

            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }

        return new String(chars);
    }

    public static boolean isVowel(char c) {

        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        System.out.println(removevowelsinastring.reverseVowels("leetcode"));
    }
}
