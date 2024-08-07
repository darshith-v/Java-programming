package linked_list_1;

class LL {
  
  //Define the Node class
  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  //Define the LinkedList class

  class LinkedList {
    Node head;

    public LinkedList() {
      this.head = null;
    }

    public void addFirst(int data) {
      Node newNode = new Node(data);
      newNode.next = head;
      head = newNode;
    }

    public void printList() {
      Node current = head;
      while (current != null) {
        System.out.print(current.data + "->");
        current = current.next;
      }
      System.out.println("null");
    }
  }


    public static void main(String[] args) {
      LL outer = new LL();
      LinkedList list = outer.new LinkedList();

      list.addFirst(1);
      list.addFirst(2);
      list.addFirst(3);

      list.printList();
    }

}