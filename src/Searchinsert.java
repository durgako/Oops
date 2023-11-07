public class Searchinsert {
    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;

            }
        }
        return -1;
//        int left = 0;
//        int right = nums.length - 1;
//
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//
//            if (nums[mid] == target) {
//                return mid; // Target found at index 'mid'
//            } else if (nums[mid] < target) {
//                left = mid + 1; // Search in the right half
//            } else {
//                right = mid - 1; // Search in the left half
//            }
//        }
//
//        return left;

    }

    public static void main(String[] args) {
        System.out.println(Searchinsert.search(new int[]{2,3,4,5},9));
    }

}