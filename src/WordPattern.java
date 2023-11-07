import java.util.HashMap;

public class WordPattern {
    public static boolean wordpattern(String pattern ,String s){
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> patternMap = new HashMap<>();
        HashMap<String, Character> wordMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (patternMap.containsKey(ch)) {
                if (!patternMap.get(ch).equals(word)) {
                    return false;
                }
            }
            else {
                patternMap.put(ch, word);
            }

            if (wordMap.containsKey(word)) {
                if (wordMap.get(word) != ch) {
                    return false;

                }
            } else {
                wordMap.put(word, ch);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(WordPattern.wordpattern("abba","dog cat goat dog"));
    }
}
