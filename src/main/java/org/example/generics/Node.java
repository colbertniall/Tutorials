package org.example.generics;

import java.util.Collection;

/**
 * Generics best practices...
 * Single capital letter
 *
 * Like passing a parameter to a method only at a class level
 * The values passed in for T is an object
 * wrap it in angle brackets <>
 *
 * Node node = new Node<String>
 * Node node_2 = new Node<Integer>
 */
public class Node<T> {
    T data;
    Node next;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "\ndata=" + data +
                "\n next=" + next +
                "\n}";
    }
}
