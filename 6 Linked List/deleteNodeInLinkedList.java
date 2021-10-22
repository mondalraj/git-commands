
import java.util.*;

public class deleteNodeInLinkedList {
    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        int pos = 2;
        head = deleteNode(head, pos);
        printLinkedList(head);
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

    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
        int curPos = 0;
        if(head ==null){
            return head;
        }

        if(pos ==0){
            return head.next;
        }

        Node<Integer> temp = head;

        while(temp!=null && curPos < (pos-1)){
            temp = temp.next;
            curPos++;
        }

        if(temp ==null || temp.next ==null){
            return head;
        }

        temp.next = temp.next.next;

        return head;
    }
}
