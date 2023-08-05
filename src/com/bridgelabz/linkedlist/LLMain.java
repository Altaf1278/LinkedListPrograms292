package com.bridgelabz.linkedlist;

public class LLMain {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.addFirst("56");
        ll.addLast("30");
        ll.addLast("70");
        ll.printList();

        ll.pop();
        ll.printList();
    }
}
