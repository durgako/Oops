import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Stack;

public interface interfaceA {

    void full();
    static  void empty()
    {
        System.out.println("hello");
    }
     default void hhh()
    {
        System.out.println("public default");
    }
Stack<Integer>st =new Stack<Integer>();


}
