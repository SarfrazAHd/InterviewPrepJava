package basics.codingQuestions;

public class LinkedLists {

    static Node head;

    public static void main(String[] args) {
        head = new Node(1);
        head.next  = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        System.out.println("Before Reverse..");
        print(head);
        System.out.println("\nAfter reverse..");
        head = revereseLinkedList(head);
        print(head);
    }

    // null -> 1 -> 2 -> 3-> 4-> null

    static Node revereseLinkedList(Node node){

        Node prev = null;
        Node next=null;
        Node current = head;
        while(current!=null){
            next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }


    static void print(Node node){
        while(node!=null){
            System.out.print(node.data + " ->");
            node = node.next;
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
