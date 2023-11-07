public class second extends  first implements  interfaceA{
    public void full()
    {
        System.out.println("simple");
    }


    void method()
    {
        System.out.println("anushka sharma");
    }
    static  void meth2()
    {
        System.out.println("lopop");
    }
     public void empty()
    {
        System.out.println("ji bol");
    }
    public static void main(String[] args) {
        first f=new first();
        f.meth();

        second s=new second();
        s.meth();
        s.method();
        first f1=new second();
        f.meth();
        first.meth2(4);
        //s.hhh();
        s.empty();
        interfaceA a=new second();
        a.hhh();
   interfaceA.empty();
    }

}
