public class ReverseInteger {
    public static int reverse(int x) {
        boolean isNegative = x < 0;
        // Reverse the integer.
        long reversedInteger = 0;
        while (x != 0) {
            int remainder = x % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            x /= 10;
        }     // Check if the reversed integer is within the signed 32-bit integer range.
        if (reversedInteger > Integer.MAX_VALUE || reversedInteger < Integer.MIN_VALUE) {
            return 0;     }     // Return the reversed integer with the correct sign.
         return (int) (isNegative ? -reversedInteger : reversedInteger);
    }

    public static void main(String[] args) {
        System.out.println(ReverseInteger.reverse(1534236469));
    }
}
