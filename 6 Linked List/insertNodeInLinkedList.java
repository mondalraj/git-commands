import java.util.*;

public class insertNodeInLinkedList {
    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        int data = 103;
        int pos = 0;
        head = insertNode(head, data, pos);
        printLinkedList(head);
    }

    public static Node<Integer> createLinkedList(){
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = null, tail=null;
        int data = sc.nextInt();

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
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    public static Node<Integer> insertNode(Node<Integer> head, int num, int pos){
        int curPos = 0;
        
        Node<Integer> newNode = new Node<>(num);
        if(pos ==0){
            newNode.next = head;
            head = newNode;
            return head;
        }
        
        Node<Integer> temp = head;
        while(temp!=null && curPos < (pos-1)){
            temp = temp.next;
            curPos++;
        }

        if(temp ==null){
            return head;
        }

        newNode.next = temp.next;
        temp.next = newNode;


        return head;
        
    }
}
