package main.java.gfg.floydalgorithm;

import static main.java.gfg.floydalgorithm.Solution.*;

public class RemoveLoopAlgorithm {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head.next.next.next.next.next = head.next.next;

        System.out.println("Loop detected before removal? " + detectLoop(head));

        removeLoopFromList(head);

        System.out.println("Loop detected after removal? " + detectLoop(head));

        printList(head);
    }
}
