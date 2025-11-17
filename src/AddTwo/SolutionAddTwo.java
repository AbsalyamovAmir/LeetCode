package AddTwo;

public class SolutionAddTwo {
    public ListNodeAddTwo addTwoNumbers(ListNodeAddTwo l1, ListNodeAddTwo l2) {
        ListNodeAddTwo head = new ListNodeAddTwo(0);
        ListNodeAddTwo cur = head;
        int carry = 0;
        int total = 0;

        while (l1 != null || l2 != null || carry != 0) {
            total = carry;

            if (l1 != null) {
                total += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                total += l2.val;
                l2 = l2.next;
            }

            carry = total / 10;
            total = total % 10;
            cur.next = new ListNodeAddTwo(total);
            cur = cur.next;
        }
        return head.next;
    }
}























































//ListNode dummy = new ListNode();
//ListNode cur = dummy;
//int carry = 0;
//int total = 0;
//        while (l1 != null || l2 != null || carry != 0) {
//total = carry;
//
//            if (l1 != null) {
//total += l1.val;
//l1 = l1.next;
//            }
//                    if (l2 != null) {
//total += l2.val;
//l2 = l2.next;
//            }
//int num = total % 10;
//carry = total / 10;
//dummy.next = new ListNode(num);
//dummy = cur.next;
//        }
//                return cur.next;
