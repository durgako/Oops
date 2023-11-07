public class Movezeroes {
    public static int[] moving(int []nums)
    {
        int nonzeroindex=0;
        for(int i=0;i< nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[nonzeroindex++]=nums[i];

            }
        }
        while(nonzeroindex<nums.length)
        {
            nums[nonzeroindex]=0;

        }
        return nums;
    }

    public static void main(String[] args) {

        System.out.println( Movezeroes.moving(new int[]{0,3,2,1,0,3}));
    }
}
