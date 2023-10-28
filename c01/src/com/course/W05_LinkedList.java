package com.course;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void add(int data) {
        Node nodeToBeAdded = new Node(data);
        if (head == null) {
            head = nodeToBeAdded;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = nodeToBeAdded;
        }
    }

    public void delete(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void middleNode() {
        Node current = head;
        int size = 0;
        while (current != null) {
            current = current.next;
            size++;
        }
        current = head;
        for (int i = 0; i < size / 2; i++) {
            current = current.next;
        }
        System.out.println(current.data);
    }

}

public class W05_LinkedList {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();
        numbers.add(1);
        numbers.add(2);
        numbers.display();

        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.display();

//        numbers.delete(4);
//        numbers.display();

        numbers.middleNode();

        numbers.add(6);
        numbers.display();

        numbers.middleNode();
    }
}
