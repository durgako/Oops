public class Plusone {
    public static int[] plusone(int[] nums) {
        int n = nums.length;

        // Start from the least significant digit
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, we can simply increment it and return the result
            if (nums[i] < 9) {
                nums[i]++;
                return nums;
            }

            // If the current digit is 9, set it to 0 and continue to the next digit
            nums[i] = 0;
        }


    // If we reach this point, it means all digits were 9, so we need to add an extra leading 1
    int[] result = new int[n + 1];
    result[0]=1;

        return result;

}

    public static void main(String[] args) {
        int []m={9,9,9};
        Plusone.plusone(m);
        for(int a:m)
        {
            System.out.println(a);
        }

    }
}
