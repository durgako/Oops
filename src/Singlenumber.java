public class Singlenumber {
    public static void num(int [] nums) {

        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(nums[i] + " ");
            }
        }
        }

    public static void main(String[] args) {
        Singlenumber.num(new int[]{3,3,2,1,2});
    }
}
