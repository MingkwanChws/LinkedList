package com.company;

import java.util.Stack;

public class Question10 {
    public class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
        }
    }

    Node head = null;

    public boolean isPalindrome() {
        Node current = head;
        boolean isPalin = true;
        Stack<Integer> stack = new Stack<Integer>();

        while (current != null) {
            stack.push(current.data);
            current = current.next;
        }

        while (head != null) {
            int n = stack.pop();
            if (head.data == n) isPalin = true;
            else {
                isPalin = false;
                break;
            }

            head = head.next;
        }
        return isPalin;
    }
}
