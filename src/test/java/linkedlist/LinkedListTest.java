package linkedlist;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for LinkedList.
 */
public class LinkedListTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void checkingthenodes()
    {
        LinkedList<Integer> Firstnode=new LinkedList<>(56);
        LinkedList<Integer> secondnode=new LinkedList<>(30);
        LinkedList<Integer> thirdnode=new LinkedList<>(70);
        Firstnode.setNext(secondnode);
        secondnode.setNext(thirdnode);

        boolean result=Firstnode.getNext().equals(secondnode)&&
                secondnode.getNext().equals(thirdnode);

        Assert.assertTrue(result);
    }
}
