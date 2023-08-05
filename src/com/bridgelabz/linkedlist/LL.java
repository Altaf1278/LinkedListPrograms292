package com.bridgelabz.linkedlist;

public class LL {
    Node head;

    private int size;

    LL() {

        size = 0;

    }

    public class Node {

        String data;

        Node next;


        Node(String data) {

            this.data = data;

            this.next = null;

            size++;

        }

    }


    public void addFirst(String data) {

        Node newNode = new Node(data);

        newNode.next = head;

        head = newNode;

    }


    public void addLast(String data) {

        Node newNode = new Node(data);


        if (head == null) {

            head = newNode;

            return;

        }


        Node lastNode = head;

        while (lastNode.next != null) {

            lastNode = lastNode.next;

        }


        lastNode.next = newNode;

    }


    public void printList() {

        Node currNode = head;


        while (currNode != null) {

            System.out.print(currNode.data + " -> ");

            currNode = currNode.next;

        }


        System.out.println("null");

    }

}
