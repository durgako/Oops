public class PerfectNumber {
    public static boolean perfect(int num)
    {
        if(num<=1)
        {
            return false;
        }
        int sum=1;
        int sqrt=(int)Math.sqrt(num);
        for(int i=2;i<=sqrt;i++)
        {
            if(num%i==0)
            {
                sum+=i;
                if ((i!=num/i));
                {
                    sum+=num/i;
                }
            }
        }

        return sum==num;
    }

    public static void main(String[] args) {
        System.out.println(PerfectNumber.perfect(12));
    }
}
