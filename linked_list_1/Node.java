package linked_list_1;

class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }

    public static void main(String[] args) {

      Node head = new Node(20);
      Node nodeB = new Node(30);
      Node nodeC = new Node(40);
      Node nodeD = new Node(50);

      head.next = nodeB;
      nodeB.next = nodeC;
      nodeC.next = nodeD;

      System.out.println(nodeB.data);
      System.out.println(nodeB.next);
      System.out.println(countNode(head));
    }

    // we have to count number of node in linked list
    static int countNode(Node head) {
      Node current = head;
      int count = 1;
      while (current.next != null) {
        current = current.next;
        count+=1;
      }
      return count;
    }

}
