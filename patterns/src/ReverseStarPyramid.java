public class ReverseStarPyramid {
    public static  void patt(int n)
    {

        for(int i=n;i>=1;i--)
        {
            for(int j=n-i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ReverseStarPyramid.patt(5);
    }
}
