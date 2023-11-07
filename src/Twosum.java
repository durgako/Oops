import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Twosum {

    public static int[] twoSum(int[] nums, int target) {


        Map<Integer, Integer> numIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (numIndexMap.containsKey(complement)) {

                return new int[] {numIndexMap.get(complement), i };
            }

            // If not, add the current number and its index to the map
            numIndexMap.put(nums[i], i);
        }

        // If no solution is found, return an empty array
        return new int[0];
    }

    public static void main(String[] args) {




        int[] nums = {2, 34, 7, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Numbers: " + nums[result[0]] + ", " + nums[result[1]]);
        } else {
            System.out.println("No two elements add up to the target.");
        }
    }


}
