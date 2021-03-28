class Node {
  int number;
  Node next;
}

class SinglyLinkedList {
  Node initialNode;
  Node lastNode;
  Node tmpNode;

  public void push(int number) {
    if (this.initialNode == null && this.lastNode == null) {
      this.lastNode = new Node();
      this.initialNode = this.lastNode;

      this.lastNode.number = number;
    } else {
      Node newNode = new Node();
      newNode.number = number;

      this.lastNode.next = newNode;
      this.lastNode = newNode;
    }
  }
}
