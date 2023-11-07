public class Fibannoccinumber {
    public static int fib(int n) {
//        if(n<=1)
//        {
//            return n;
//        }
//        return fib(n-2)+fib(n-1);
        // Calculate the 10th Fibonacci number (F(10))

        int first = 0, second = 1, next = 0;

        for (int i = 2; i <= n; i++) {
            next = first + second;
            first = second;
            second = next;
        }
return second;
    }



    public static void main(String[] args) {
        System.out.println(Fibannoccinumber.fib(5));
    }
}
