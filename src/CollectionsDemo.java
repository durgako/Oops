import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class CollectionsDemo
{
    public static void main(String[] args) {

        // create vector object
        Vector<String> vector = new Vector<String>();

        // populate the vector
        vector.add("1");
        vector.add("2");
        vector.add("3");
        vector.add("4");
        vector.add("5");
        System.out.println(vector);

        // create a synchronized view
        //Collection<String>c=Collections.synchronizedCollection(vector);

       // System.out.println("Sunchronized view is :"+c);
    }



}
