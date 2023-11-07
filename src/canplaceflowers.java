public class canplaceflowers {
    public static boolean place(int num[],int n)
    {
        int count=0;
        int  i=0;
        while(i< num.length)
        {
            if(num[i]==0&&(i==0||num[i-1]==0)&&(i==num.length-1||num[i+1]==0))
            {
                num[i]=1;
                count++;


            }
            i++;

        }

        return count>=n;
    }

    public static void main(String[] args) {
        System.out.println(canplaceflowers.place(new int[]{1,0,0,0,1},2));
    }
}
