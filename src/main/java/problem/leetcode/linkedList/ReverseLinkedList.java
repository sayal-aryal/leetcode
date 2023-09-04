/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem.leetcode.linkedList;

/**
 *
 * @author User
 */
public class ReverseLinkedList {
    
     public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        ReverseLinkedList rll = new ReverseLinkedList();
        rll.printList(head);
        

        ListNode reversedHead = rll.reverseList(head);

        System.out.println("Reversed Linked List:");
        rll.printList(reversedHead);
    }

   public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while(head != null){
            ListNode nextNode = head.next;
           head.next = prev;
           prev = head;
           head = nextNode;
        }
        return prev;
    }

   

    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

}
