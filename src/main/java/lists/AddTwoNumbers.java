package lists;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode result = new ListNode(0);
        ListNode curr3 = result;

        int carry = 0;

        while (curr1 != null && curr2 != null) {
            int sum = carry + curr1.val + curr2.val;
            carry = sum / 10;

            curr3.next = new ListNode(sum % 10);
            curr3 = curr3.next;

            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        while (curr1 != null) {
            int sum = carry + curr1.val;
            carry = sum / 10;

            curr3.next = new ListNode(sum % 10);
            curr3 = curr3.next;

            curr1 = curr1.next;
        }

        while (curr2 != null) {
            int sum = carry + curr2.val;
            carry = sum / 10;

            curr3.next = new ListNode(sum % 10);
            curr3 = curr3.next;

            curr2 = curr2.next;
        }

        if (carry > 0)
            curr3.next = new ListNode(carry);

        return result.next;
    }
}
