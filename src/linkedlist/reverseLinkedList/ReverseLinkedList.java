package linkedlist.reverseLinkedList;

class ListNode {
    //Definition for singly-linked list.
    int val;
    linkedlist.reverseLinkedList.ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, linkedlist.reverseLinkedList.ListNode next) { this.val = val; this.next = next; }
}

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        //This loop will reverse the next pointers and move the head to the end of the list
        while(curr != null){
                ListNode nextTemp = curr.next;
                curr.next = prev; // point the next of the current to prev(null in the first loop). This will reverse the list.
                prev = curr; // prev becomes the current value, which is 1
                curr = nextTemp; //curr becomes 2, then starts working on 2
        }
        return prev; //returns 5
    }
    public static void main(String[] args) {
        ReverseLinkedList reverser = new ReverseLinkedList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode reverseHead = reverser.reverseList(head);

        //This loop will print the reversed linked list
        ListNode current = reverseHead;
        while(current != null){
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
