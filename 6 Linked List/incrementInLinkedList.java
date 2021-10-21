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
        Node<Integer> head = null, tail=null;
        int data = sc.nextInt();

        /*  -> Brute force
        while(data != -1){
            Node<Integer> curNode = new Node<>(data);
            if(head == null){
                //Making first node as head
                head = curNode;
            }else{
                //Linking Nodes -> brute force
                Node<Integer> tail = head;
                while(tail.next !=null){
                    tail = tail.next;
                }
                tail.next = curNode;
            }
            data = sc.nextInt();
        }
        */

        //Optimization

        while(data != -1){
            Node<Integer> curNode = new Node<>(data);
            if(head == null){
                //Making first node as head and tail
                head = curNode;
                tail =curNode;
            }else{
                tail.next = curNode;
                tail =curNode;
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
