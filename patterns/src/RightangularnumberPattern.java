public class RightangularnumberPattern {
    public static void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
                //System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RightangularnumberPattern.pattern(5);
    }
}
