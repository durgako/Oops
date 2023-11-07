public class ReverseString {
    public static char[] reversing(char[]s)
    {
        char[]reverse=new char[s.length];
        for(int i=s.length-1;i>=0;i--)
        {
            //reverse=reverse+s[i];
            reverse[s.length - 1 - i] = s[i];

        }
        System.out.println(reverse);
        return  reverse;
    }

    public static void main(String[] args) {
        char[]s={'h','e','l','l','o'};
        ReverseString.reversing(s);
    }
}
