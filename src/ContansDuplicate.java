public class ContansDuplicate {

    public static boolean duplicate(int[]nums)
    {

        for(int i=0;i<nums.length;i++)
        {
            for (int j=0;j<nums.length;j++)
            {
                if (i!=j&&(nums[i]==nums[j]))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(ContansDuplicate.duplicate(new int[]{3,8,1,9,7,0,4}));
    }
}
