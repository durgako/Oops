public class UniqueCharacterinaString {
    public static int firstunique(String s)
    {

        int[] frequency = new int[26]; // Assuming lowercase English alphabet

        // Build frequency array
        for (char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }

        // Find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (frequency[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(UniqueCharacterinaString.firstunique("loveleetcode"));
    }
}
