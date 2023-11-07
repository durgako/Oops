public class Diamond {
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }
    }


    public static void main(String[] args) {
        Diamond.pattern(5);
    }
}
