package com.company;

public class Question8 {

    public class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
        }
    }

    Node head = null;

    public void revers() {
        Node current = head;
        Node next = null;
        Node prev = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void addOne() {
        Node result = head;
        Node current;
        Node temp = null;
        int carry = 1;
        int sum;

        while (result != null) {
            sum = carry + result.data;
            carry = (sum >= 10) ? 1 : 0;
            sum = sum % 10;
            result.data = sum;
            temp = result;
            result = result.next;
        }
        if (carry > 0)
            temp.next = new Node(carry);
    }


}
