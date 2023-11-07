public class multileveA extends  second{


    public  static  void hi()
    {
        System.out.println("first class method");
    }
    public void method2()
    {
        System.out.println("danger");
    }

    public static void main(String[] args) {
        multileveA a=new multileveA();
        a.method2();
        multileveA.hi();
    }
}
