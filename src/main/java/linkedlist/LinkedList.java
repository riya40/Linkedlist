package linkedlist;

/**
 * Creating the Linked List
 *
 */
public class LinkedList<K>
{


    private LinkedList next;
    private K key;

    public LinkedList(int k) {
        this.key=null;
        this.next=null;
    }

    public LinkedList getNext() {
        return next;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }
}
