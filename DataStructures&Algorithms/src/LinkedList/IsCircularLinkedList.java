package LinkedList;

public class IsCircularLinkedList {

   static class Node{
        int data;
        Node next ;

        Node(int d){

            data = d;
        }
    }

    static boolean isCircularLinkedList(Node head){

        if(head==null){
            return Boolean.FALSE;
        }

        Node last= head ; //last is temporary variable we copy head into it
        // now we have to copy all node element and compare if it point back to head
        do{
            last = last.next ; // update last till last element in linked list found or increment
        } while(last != null && last != head);

        return (last == head); // i.e circular linked list
    }
    public static void main(String[] args){
        Node n1 = new Node(2);
        Node n2 = new Node(23);
        Node n3 = new Node(24);
        Node n4 = new Node(26);
        Node n5 = new Node(27);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n1; // so here last node point to first therefore circular linked list

        //if we comment line 40 then last node n5 is not pointing anywhere therefore it is not circular linked list

        System.out.println("is it circular linked list : " +isCircularLinkedList(n1));


    }

}
