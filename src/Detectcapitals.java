public class Detectcapitals {
    public  static boolean cap(String word)
    {
        String pattern="[A-Z]*|.[a-z]*";
        return word.matches(pattern);
    }
    public static boolean capitalise(String g)
    {
        int counteruppercase=0;
        for(char c:g.toCharArray())
        {
            if(Character.isUpperCase(c))
            {
                counteruppercase++;

            }

        }
        return counteruppercase==0||counteruppercase==g.length()||(counteruppercase==1&&Character.isUpperCase(g.charAt(0)));
    }

    public static void main(String[] args) {
        System.out.println(Detectcapitals.capitalise("FlaG"));
    }
}
