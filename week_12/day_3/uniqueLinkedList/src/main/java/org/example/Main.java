package org.example;

public class Main {
    public static Node deleteDuplicates(Node head) {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Node head = new Node(1);
        Node node2 = new Node (2);
        Node node3 = new Node(1);
        head.next = node2;
        node2.next = node3;

        Node current = head;
        head = deleteDuplicates(head);
        while (current!=null){
            System.out.println(current.val);
            current = current.next;
        }
    }
}