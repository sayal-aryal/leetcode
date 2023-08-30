/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem.leetcode.linkedList;

/**
 *
 * @author User
 */
public class Cycle1 {

    public static void main(String[] args) {
        // Create a test linked list with or without a cycle
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        // Construct a cycle
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;  // This creates a cycle

        // Alternatively, create a linked list without a cycle
//         node1.next = node2;
//         node2.next = node3;
//         node3.next = node4;
        Cycle1 cycle1 = new Cycle1();
        boolean hasCycle = cycle1.hasCycle(node1);

        if (hasCycle) {
            System.out.println("The linked list has a cycle.");
        } else {
            System.out.println("The linked list does not have a cycle.");
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
