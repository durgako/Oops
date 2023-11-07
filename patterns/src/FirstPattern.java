public class FirstPattern {
    public static void pattern(int n)
    {
        for (int i = 1; i <= n; i++) {
        // Inner loop for printing asterisks in each row
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    }

    public static void main(String[] args) {
        FirstPattern.pattern(5);
    }
}
