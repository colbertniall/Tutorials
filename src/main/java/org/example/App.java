package org.example;

import org.example.generics.Node;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Node nodeString = new Node<String>("abc");
        Node nodeInt = new Node<Integer>(4);
        nodeString.setNext(nodeInt);

        System.out.println(nodeString);
        System.out.println(nodeInt);
    }
}
