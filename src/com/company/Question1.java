package com.company;

public class Question1 {
    public class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
        }
    }

    Node head = null;

    public void rotate(int k) {
        if (k == 0) return;

        Node current = head;
        int count = 1;
        while (count < k && current != null) {
            current = current.next;
            count++;
        }

        if (current == null) return;

        Node kNode = current;

        while (current.next != null) {
            current = current.next;
        }

        current.next = head;
        head = kNode.next;
        kNode.next = null;

    }
}
