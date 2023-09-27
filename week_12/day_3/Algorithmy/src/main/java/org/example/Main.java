package org.example;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.NodeType;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Node head = new Node(7);
        Node node2 = new Node (5);
        Node node3 = new Node(3);

        head.next = node2;
        node2.next = node3;

        Node current = head;

        while (current!=null){
            System.out.println(current.val);
            current.prev = current;
            current = current.next;
        }

    }
}