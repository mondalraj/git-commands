import java.util.*;

public class reverseLinkedList {
    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        head = reverseR(head);
        printLinkedList(head);
    }

    public static Node<Integer> reverseR(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> smallHead = reverseR(head.next);
        Node<Integer> tail = smallHead;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;
        head.next = null;
        return smallHead;
    }

    public static Node<Integer> createLinkedList() {
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = null, tail = null;
        int data = sc.nextInt();

        while (data != -1) {
            Node<Integer> curNode = new Node<>(data);
            if (head == null) {
                // Making first node as head and tail
                head = curNode;
                tail = curNode;
            } else {
                tail.next = curNode;
                tail = curNode;
            }
            data = sc.nextInt();
        }

        return head;
    }

    public static void printLinkedList(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
