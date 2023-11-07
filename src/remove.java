public class remove {


    public static  int remove(int[]arr,int val)
    {
        int index=0;

        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==val)
                {
                    arr[index] =arr[i];
                    index++;
                }


        }


        return index;
    }

    public static void main(String[] args) {

        System.out.println( remove.remove(new int[]{0,1,3,3,3,0,4,3},3));
    }
}
