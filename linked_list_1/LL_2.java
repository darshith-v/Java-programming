package linked_list_1;

public class LL_2 {
  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }


  class Linkedlist {
    Node head;

    public void addLast(int data) {
      Node newNode = new Node(data); // create a node

      //if the list is empty make the new node as the head
      if (head == null) {
        head = newNode;
        return;
      }

      // Traverse to the last node
      Node current = head; //reference to the head
      while (current.next != null) {
        current = current.next;
      }

      //
      current.next = newNode;
    }
    
    public void Display() {
      Node current = head;
      while (current != null) {
        System.out.print(current.data + " -> ");
        current = current.next;
      }
      System.out.println("null");
    }
  }

  public static void main(String[] args) {
    LL_2 outer = new LL_2();
    Linkedlist list = outer.new Linkedlist();

    list.addLast(10);
    list.addLast(20);
    list.addLast(30);

    list.Display();
  }
}
