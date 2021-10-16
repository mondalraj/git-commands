import java.util.*;

public class lengthOfLinkedList {
    public static void main(String[] args){
        LinkedList<Integer> head = createLinkedList();
    }
    public static LinkedList<Integer> createLinkedList(){
        Scanner s = new Scanner(System.in);
        LinkedList<Integer> head = null;
        int data = s.nextInt();
        while(data != -1){

            LinkedList<Integer> currentNode = new LinkedList<Integer>(data);

            data = s.nextInt();
        }
        return head;
    }
}
