/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem.leetcode.linkedList;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class DeteteDuplicate {

    public static void main(String[] args) {
        // Create a test linked list 
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(4);
        ListNode node7 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        // Alternatively, create a linked list without a cycle
//         node1.next = node2;
//         node2.next = node3;
//         node3.next = node4;
        DeteteDuplicate deteteDuplicate = new DeteteDuplicate();
        ListNode node = deteteDuplicate.deleteDuplicates(node1);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }

    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;

        while (head != null) {
            if (head.next!=null && head.val == head.next.val ) {
                while (head.val == head.next.val) {
                    head = head.next;
                }
                prev.next = head.next;
            } else {
                prev = prev.next;
            }

            head = head.next;
        }
        return dummy;
    }
}
