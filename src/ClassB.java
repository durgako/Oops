import java.util.Scanner;

public class ClassB {
    void meth1() {
        Scanner sc = new Scanner(System.in);
        ClassA a = new ClassA();
        a.setName("durga");
        System.out.println(a.getName());

    }

    public static void main(String[] args) {
        new ClassB().meth1();
    }

}
