package com.company;

public class LinkedListTester {
    public static void main(String[] args) {
        MyLinkedList mList = new MyLinkedList();

        mList.add(9);
        mList.add(7);
        mList.add(5);
        mList.add(2);
        mList.add(1);
        //mList.add(1);
       mList.insert(3);
        //MyLinkedList.Node p = mList.find(9);
        mList.delete(2);
        //mList.find(9);
//
//
        //head = mList.revers(head);
//        System.out.println(mList.toString());
//        mList.revers();
//        mList.addOne();
//        mList.revers();
        //System.out.println(p);

        System.out.println(mList.toString());
        System.out.println(mList.find(9));
        //boolean condition = mList.isPalindrome();
        //System.out.println(condition);
       // System.out.println(mList.toString());


    }
}
