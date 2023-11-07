public class Noofsegmentsinastring {


//    public static int countsegment(String s)
//    {
//        if(s.isEmpty())
//        {
//            return 0;
//        }
//        String [] arr=s.split(" ");
//        return arr.length;
//    }
    public static int countSegments(String string) {
        int count = 0;
        boolean previousIsWhitespace = true;

        for (char c : string.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                if (previousIsWhitespace) {
                    count++;
                }
                previousIsWhitespace = false;
            } else {
                previousIsWhitespace = true;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(Noofsegmentsinastring.countSegments(", , , ,        a, eaefa"));
    }
}
