package com.company;

public class LinkedListUse {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(10);
        System.out.println(node1.data);
        System.out.println(node1.next);

        Node<Integer> node2 = new Node<>(20);
        node1.next = node2; //giving the reference of node2 to the next of node1
        System.out.println(node2);
        System.out.println(node1.next);
    }
}
