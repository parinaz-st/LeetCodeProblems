package easyProblems;

public class MiddleoftheLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);

        middleNode(head);
//        head.next = new ListNode();
//        head.val = 4;
//        System.out.println("[4] middle: ");
//        middleNode(head);
//        head.next = new ListNode();
//        head.val = 5;
//        System.out.println("[5] middle: ");
//        middleNode(head);

    }
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public static ListNode middleNode(ListNode head) {
        ListNode middleNode = head;
        ListNode endNode = head;
        if(null == head.next ){
            return head;
        }
        while(endNode != null && endNode.next != null){
            middleNode = middleNode.next;
            endNode = endNode.next.next;
        }
        return head;
    }
    public  static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }


}
