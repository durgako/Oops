public class removeduplicatesfromsortedarray {
    public   static  int sortedarray(int []arr)
    {
        int uniqueCount = 1; // At least one element is unique (the first one)

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[uniqueCount] = arr[i];
                uniqueCount++;

            }
        }
            for (int j = 0; j < uniqueCount; j++) {
                System.out.print(arr[j] + " ");

        }

        return uniqueCount;
    }

    public static void main(String[] args) {
        System.out.println( removeduplicatesfromsortedarray.
                sortedarray(new int[]{0,0,1,1,1,2,2,3,3,4}));



    }

}
