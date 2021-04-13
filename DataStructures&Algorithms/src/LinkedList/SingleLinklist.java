
//opertaions like append , push , and insert on Single Linked List

package LinkedList;

public class SingleLinklist {

    Node  head;  //Node is data type like int


    //create a empty linked list
    class Node {

        int data;
        Node next ;

        Node(int data){    // constructor for passins data in linked list

            this.data=data;
            next=null;
        }
    }
   // push node at start
   public void push(int new_value){

        Node new_node=new Node(new_value);
        // so here Node is creted with given new value but it is hanging and not linked to any other

       new_node.next = head; // to which head is pointed first ..that now pointed by new node next
                            // and head will point to new node data
       head = new_node;
   }

   //.............................. INSERTION.........................................................

   // INSERT AT A POSITION

    public void Insert(Node prev_node, int new_value) {

        if (prev_node == null) {
            System.out.println(" previous node seems to be empty");
            return;
        }

        Node new_node = new Node(new_value); // cretae new node hanging in space with given value

        new_node.next = prev_node.next;  // new node point to the node that was pointed by prev node

        prev_node.next = new_node;  // and previous node point to the new node that is inserted
    }

    // INSERT AT END

    public void append(int new_value) {

        Node new_node = new Node(new_value);

        if (head == null) {   // if there is no node present head point to the null

            head = new Node(new_value);// head point to new node

            return;
        }      // here end if statement

        new_node.next = null;  // as last node point to null

        Node last = head;

        while (last.next != null)
        {   // it is like else part of if i.e head.next i.e head id not pinting to null then find it

            last = last.next;
        }
        last.next = new_node; // when head point to  null point that null to new node
        return;
    }

    // for traverse and print the list to display

    public void printlist() {

        Node mynode = head ;

        while (mynode != null){

            System.out.print(mynode.data + "->");

                    mynode = mynode.next ;
        }
    }

    public static void main(String [] args)
    {
        SingleLinklist  list = new SingleLinklist();

      list.append(5);
       list.push(6);
      list.printlist();

}
}