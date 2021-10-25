import java.util.Scanner;

public class midPointOfLinkedList {
    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        System.out.println(midPoint(head).data);

    }

    public static Node<Integer> midPoint(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
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
}
