/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem.leetcode.linkedList;

/**
 *
 * @author User
 */
public class Cycle2 {

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
        Cycle2 cycle2 = new Cycle2();
        ListNode node = cycle2.detectCycle(node1);

        System.out.println(node.val);
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
while(fast.next!= null && fast!=null){
                slow = slow.next;
                fast = fast.next.next; 
                if(slow == fast){
                    slow = head;
                    while(slow!=fast){
                          slow = slow.next;
                          fast = fast.next;
                     
                    }
                    return slow;
                }  
        }
return null;
    }
}

