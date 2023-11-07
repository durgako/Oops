import java.util.Arrays;
import java.util.Hashtable;

public class Bubblesort {

    public static  int[] sorting(int []arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] =temp;                }
            }


        }
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
        //Hashtable table =new Hashtable();
        return arr;
    }
    public static void binarySearch(int arr[], int key){
        int first=arr[0];
        int last=arr.length-1;
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }
    public static int linearSearch(int array[], int x) {
        int n = array.length;

        // Going through array sequencially
        for (int i = 0; i < n; i++) {
            if (array[i] == x)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
       int [] newarr= Bubblesort.sorting(new int[]{1, 8, 4, 0, 2});
        binarySearch(newarr,7);
        int result=linearSearch(new int[]{3,5,92,2},2);
        System.out.println(result);
    }
}
