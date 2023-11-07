public class loading {
    public void name()
    {
        System.out.println("name");
    }
    public static int name(String s)
    {
        System.out.println("love");
        return 0;
    }
    static  final private void name(int num)
    {
        System.out.println(num);
    }
  loading()
  {
      System.out.println("hi");
  }
  loading(int s)
  {
      System.out.println("hello");
  }
  loading(char c)
  {
      this();
      new loading();
  }
    public static void main(String[] args) {
         loading l=new loading();
         l.name();
         l.name("jiol");
         new loading(234).name(90);
        new loading('j');


    }
}
