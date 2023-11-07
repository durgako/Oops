public class ispalindrome {
    public static boolean isPalindrome(String s) {
        String d=s.toLowerCase();
        String reverse="";
        String arr=d.replaceAll("[^a-zA-Z0-9]", "");
       // System.out.println(arr+"array");
        for(int i=arr.length()-1;i>=0;i--)
        {
            reverse=reverse+arr.charAt(i);
            //System.out.println(reverse);
            //System.out.println(reverse.replaceAll("[^a-zA-Z0-9]+",""));
        }
        if(arr.equals(reverse))
        {
            return true;
        }
        else
        {
            return false;
        }


    }

    public static void main(String[] args) {
        System.out.println(ispalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
