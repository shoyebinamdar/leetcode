package lists;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {
    @Test
    public void addTwoNumbers() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expectedList = new ListNode(7, new ListNode(0, new ListNode(8)));
        ListNode actualList = AddTwoNumbers.addTwoNumbers(l1, l2);

        assertEquals(expectedList.val, actualList.val);
        assertEquals(expectedList.next.val, actualList.next.val);
        assertEquals(expectedList.next.next.val, actualList.next.next.val);
    }
}