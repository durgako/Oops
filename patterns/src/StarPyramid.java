public class StarPyramid {
    public  static   void pattern(int n)
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=n-i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i*2;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        StarPyramid.pattern(5);
    }
}
