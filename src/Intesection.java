import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intesection {
    public static ArrayList<Integer> interectionoftwoarrays(int[] nums1, int[] nums2)
    {
        ArrayList<Integer>result=new ArrayList<>();
       // int result[] ;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    //System.out.println(nums2[j]);
                     result.add( nums2[i]);
                return  result;
                }
            }
        }
      return result;
}

    public static void main(String[] args) {
       ArrayList<Integer>li=  Intesection.interectionoftwoarrays(new int []{1,2,2,1},new int[]{2,2});

           for(int ir:li)
           {
            System.out.println(ir+" ");
           }


    }
}
