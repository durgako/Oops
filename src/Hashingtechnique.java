import org.w3c.dom.Node;

public class Hashingtechnique {
    public static int hashFunction(int key)
    {
        return key % 10; // Assuming a linked list size of 10
    }
    public static void insert(int data) {
        int index = hashFunction(data);

        // Assuming your linked list is 0-indexed
        Node linkedListHead = null;
        Node currentNode = linkedListHead;
        System.out.println(currentNode);
        System.out.println(currentNode.hashCode());

//        // Traverse to the correct node in the linked list
//        for (int i = 0; i < index; i++) {
//            currentNode = currentNode.next;
//        }
//
//        // Insert data into the node
//        currentNode.data = data;
    }

    public static void main(String[] args) {
        Hashingtechnique.insert(90);
    }
}
