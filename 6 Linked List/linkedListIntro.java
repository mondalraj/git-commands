import java.util.*;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    } 
}

public class linkedListIntro {
    public static void main(String[] args){
        //creating nodes
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);

        //linking the nodes
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        //Printing list
        // System.out.println(n1);
        // System.out.println(n2);
        // System.out.println(n3);
        // System.out.println(n4);

        System.out.println(n1.data);
        System.out.println(n1.next);
        System.out.println(n2.data);
        System.out.println(n2.next);
        System.out.println(n3.data);
        System.out.println(n3.next);
        System.out.println(n4.data);
        System.out.println(n4.next);
    }
}