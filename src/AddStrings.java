public class AddStrings
{
    public static String addtwostrings(String s1,String s2)
    {
        //By using inbuilt methods
     //   int w1=Integer.parseInt(s1);
       // int w2=Integer.parseInt(s2);
       // int result=w1+w2;

        int carry = 0;
        StringBuilder result = new StringBuilder();

        int i = s1.length() - 1;
        System.out.println(i);
        int j = s2.length() - 1;
        System.out.println(j);

        while (i >= 0 || j >= 0) {
            int x = (i >= 0) ? s1.charAt(i) - '0' : 0;
            int y = (j >= 0) ? s2.charAt(j) - '0' : 0;
            System.out.println(x);
            System.out.println(y);

            int sum = x + y + carry;
            carry = sum / 10;
            result.insert(0, sum % 10);

            i--;
            j--;
        }

        if (carry > 0) {
            result.insert(0, carry);
        }

        return result.toString();
    }
      //  return String.valueOf(result);


    public static void main(String[] args) {
        System.out.println(AddStrings.addtwostrings("34","6"));
    }
}
