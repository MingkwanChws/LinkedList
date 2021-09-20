package com.company;

import java.util.Stack;

public class MyLinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
        }
    }

    Node head = null;

    public void add(int d) {
        Node p = new Node(d);
        p.next = head;
        head = p;
    }

    public int find(int d) {
        if (head == null) return -1;
        Node p = head;
        int index = 0;
        while (p != null) {
            if (p.data == d) return index;
            index++;
            p = p.next;
        }
        return -1;
    }

    public void insert(int d) {
        Node q = new Node(d);
        Node p;
        if (head == null || head.data >= d) {
            q.next = head;
            head = q;
        } else {
            p = head;
            while (p.next != null && p.next.data < d)
                p = p.next;

            q.next = p.next;
            p.next = q;
        }
    }

    public void delete(int d) {
        Node t = new Node(d - 1);
        t.next = head;
        Node p = t;
        while (p.next != null && p.next.data != d) {
            p = p.next;
        }

        if (p.next != null) {
            p.next = p.next.next;
        }
        head = t.next;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("head");
        Node p = head;
        while (p != null) {
            sb.append("--> [");
            sb.append(p.data);
            sb.append("]");
            p = p.next;
        }
        sb.append("-> null");
        return new String(sb);
    }
}
