public class ReverseRightangularTriangle {
    public  static void pattern(int n) {
//        for(int i=n;i>=1;i--)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ReverseRightangularTriangle.pattern(6);
    }
}
