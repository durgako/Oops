public class findmissingnumber {
    public static int missingnumber(int[]arr)
    {
        int n=arr.length;
        int expectedsum=n*(n+1)/2;
        int actualsum=0;
        for(int num:arr){
            actualsum+=num;

        }

        return expectedsum-actualsum;
    }

    public static void main(String[] args) {
        System.out.println(findmissingnumber.missingnumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}
