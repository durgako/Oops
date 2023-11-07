import java.util.Arrays;

public class ReverseStringIII {
    public static String rev(String s) {
        String[] words = s.split(" ");

        StringBuilder reversed=new StringBuilder();
        StringBuilder builder = null;
        for (String word : words) {
            builder = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                builder.append(word.charAt(i));
            }
            reversed.append(builder).append(" ");
            

        }
        return reversed.toString();


    }

    public static void main(String[] args) {
        System.out.println(ReverseStringIII.rev(
                "Let's take LeetCode contest "));
    }
}
