import java.util.*;

// class Node<T> {
//     T data;
//     Node<T> next;

//     Node(T data) {
//         this.data = data;
//     } 
// }

public class incrementInLinkedList {
    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        printLinkedList(head);
    }

    public static Node<Integer> createLinkedList(){
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = null;
        int data = sc.nextInt();
        while(data != -1){
            Node<Integer> curNode = new Node<>(data);
            if(head == null){
                //Making first node as head
                head = curNode;
            }else{
                //Linking Nodes
                Node<Integer> tail = head;
                while(tail.next !=null){
                    tail = tail.next;
                }
                tail.next = curNode;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static void printLinkedList(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            temp.data++;
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
