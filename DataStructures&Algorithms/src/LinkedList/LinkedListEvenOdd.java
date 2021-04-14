package LinkedList;

public class LinkedListEvenOdd {

    static class Node{
        int data ;
        Node next;

        Node(int d){

            data = d;
        }
    }

    static Boolean IsEvenOdd(Node node1){

        // if there is only one node then it is even
        if(node1==null) {
            return true;
        }

            while(node1!=null && node1.next != null) {

            node1 = node1.next.next; // this is the posn we move ptr by two position till it is not null
            // : if null then true(even) otherwise false(odd)
        }
        return node1==null;
    }
    public static void main(String[] args){

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3) ;
        Node n4 = new Node(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        System.out.print(IsEvenOdd(n1));

    }
}
