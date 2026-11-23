package LinkedList;

/**
 * Singly Linked List - Recursive Insertion at an Index
 */
public class InsertUsingRec {

    public static class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static class CustomLinkedList {
        public Node head;

        public void addLast(int val) {
            Node newNode = new Node(val);

            if (head == null) {
                head = newNode;
                return;
            }

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        // Recursive insertion method
        public Node insertRec(Node current, int index, int val) {
            if (index == 0) {
                Node newNode = new Node(val);
                newNode.next = current;
                return newNode;
            }

            if (current == null) {
                throw new IndexOutOfBoundsException("Invalid index: " + index);
            }

            current.next = insertRec(current.next, index - 1, val);
            return current;
        }

        public void insertAt(int index, int val) {
            head = insertRec(head, index, val);
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println("Original Linked List:");
        list.display();

        System.out.println("Inserting 99 at index 2 recursively:");
        list.insertAt(2, 99);
        list.display();
    }
}
