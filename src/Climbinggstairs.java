public class Climbinggstairs {
    public static int climbStairs(int n) {
        // Memoization table to store the number of ways to climb the staircase
        // up to a given step.
        //int[] memo = new int[n + 1];
        //Base cases.
        // memo[0] = 1;
        // memo[1] = 1;     // Recursively count the number of ways to climb the staircase, taking
        // either 1 or 2 steps at a time, and using the memoization table to avoid
        // recomputing subproblems.
        //  for (int i = 2; i <= n; i++) {
        //      memo[i] = memo[i - 1] + memo[i - 2];
        //  }
        // return memo[n];
        if (n <= 2) {
            return n;
        }

        int prev1 = 1; // Number of ways to reach step 1
        int prev2 = 2; // Number of ways to reach step 2

        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        return prev2;


    }

    public static void main(String[] args) {
        System.out.println(Climbinggstairs.climbStairs(6));
    }
}
