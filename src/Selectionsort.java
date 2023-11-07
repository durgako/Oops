public class Selectionsort {

    public static  void sort(int [] arr)
    {
        for(int i=0;i< arr.length-1;i++)
        {
            int minindex=i;

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minindex])
                {
                    minindex=j;

                }

            }
            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }
    }

    public static void main(String[] args) {
        int arr[]={2,0,4,9,5,8,15};
        Selectionsort.sort(arr);
        for(int a:arr)
        {
            System.out.println(a);
        }
    }
}
