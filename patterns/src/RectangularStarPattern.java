public class RectangularStarPattern {
    public static void pattern(int n,int m)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        RectangularStarPattern.pattern(4,6);
    }
}
