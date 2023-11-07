public class Lengthoflastword {
    public static  int lengthofword(String s)
    {

       String[]arr=s.split(" ");
       if(arr.length==0)
       {
           return 0;
       }
       return arr[arr.length-1].length();
    }

    public static void main(String[] args) {
        System.out.println(Lengthoflastword.lengthofword("hi!There always  "));
    }
}
