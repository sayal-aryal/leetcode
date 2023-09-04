/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem.leetcode.linkedList;

/**
 *
 * @author User
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        // Create a node for  linked list 1
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(9);
        ListNode node5 = new ListNode(9);
        ListNode node6 = new ListNode(9);
        ListNode node7 = new ListNode(9);

        // Construct a linkedList 1
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;  
        node5.next = node6;  
        node6.next = node7;  
        
        
        // Create a node for linked list 2
        ListNode nextnode1 = new ListNode(9);
        ListNode nextnode2 = new ListNode(9);
        ListNode nextnode3 = new ListNode(9);
        ListNode nextnode4 = new ListNode(9);
        
        
        // Construct a linkedList 2
        nextnode1.next = nextnode2;
        nextnode2.next = nextnode3;
        nextnode3.next = nextnode4;
         
        
        
        
        AddTwoNumbers add = new AddTwoNumbers();
        ListNode node = add.addTwoNumbers(node1,nextnode1);

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }

    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;
        
        while(l1!=null || l2!=null || carry!=0){
            int val1 = (l1!=null)?l1.val:0;
            int val2 = (l2!=null)?l2.val:0;
            

            int sum = val1+val2+ carry; 
            int digit =  sum%10;
            carry = sum/10;
             
            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;
            
            l1= (l1!=null)? l1.next:null;
            l2= (l2!=null)? l2.next:null;
            
        }
        return dummyHead.next;
    }
}
