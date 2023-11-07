import java.util.Arrays;

public class validAnagram {

    public static boolean is(String s,String t)
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        char[]arr1=s.toCharArray();
        char[]arr2=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2))
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(validAnagram.is("car","rat"));
    }
}
