
package Linkedlist;

/**
 * Singly Linked List implementation in Java.
 *
 * Each node contains:
 * 1. value - the data stored in the node
 * 2. next  - reference to the next node
 *
 * head points to the first node.
 * tail points to the last node.
 * size stores the total number of nodes.
 */
public class singly {

    // ========================================
    // 1. INSTANCE VARIABLES
    // ========================================

    private Node head; // First node of the list
    private Node tail; // Last node of the list
    private int size;  // Number of nodes in the list

    // ========================================
    // 2. CONSTRUCTOR
    // ========================================

    /**
     * Creates an empty linked list.
     */
    public singly() {
        this.size = 0;
    }

    // ========================================
    // 3. INSERT AT THE BEGINNING
    // ========================================

    /**
     * Inserts a new node at the beginning.
     *
     * Time Complexity: O(1)
     *
     * @param value data to insert
     */
    public void insertFirst(int value) {

        // Create a new node
        Node node = new Node(value);

        // Connect the new node to the current first node
        node.next = head;

        // Update head to the new node
        head = node;

        // If the list was empty, the new node is also the tail
        if (tail == null) {
            tail = head;
        }

        // Increase the number of nodes
        size++;
    }

    // ========================================
    // 4. INSERT AT THE END
    // ========================================

    /**
     * Inserts a new node at the end.
     *
     * Time Complexity: O(1)
     *
     * @param value data to insert
     */
    public void insertLast(int value) {

        // If the list is empty, insert the first node
        if (tail == null) {
            insertFirst(value);
            return;
        }

        // Create a new node
        Node node = new Node(value);

        // Connect the current last node to the new node
        tail.next = node;

        // Update tail
        tail = node;

        // Increase size
        size++;
    }

    // ========================================
    // 5. INSERT AT ANY INDEX
    // ========================================

    /**
     * Inserts a node at a specified index.
     *
     * Valid indexes: 0 to size, inclusive.
     *
     * Time Complexity: O(n)
     *
     * @param value data to insert
     * @param index position where the node is inserted
     */
    public void insertAtAnyIndex(int value, int index) {

        // Validate the index
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(
                    "Index: " + index + ", Size: " + size
            );
        }

        // Insert at the beginning
        if (index == 0) {
            insertFirst(value);
            return;
        }

        // Insert at the end
        if (index == size) {
            insertLast(value);
            return;
        }

        // Reach the node immediately before the target index
        Node temp = get(index - 1);

        // Create a new node connected to the next node
        Node node = new Node(value, temp.next);

        // Connect the previous node to the new node
        temp.next = node;

        // Increase size
        size++;
    }

    // ========================================
    // 6. DISPLAY THE LINKED LIST
    // ========================================

    /**
     * Prints all nodes from head to tail.
     *
     * Time Complexity: O(n)
     */
    public void display() {

        // Start from the first node
        Node temp = head;

        // Traverse until the end of the list
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // ========================================
    // 7. GET NODE AT ANY INDEX
    // ========================================

    /**
     * Returns the node at the specified index.
     *
     * Indexing starts from 0.
     *
     * Time Complexity: O(n)
     *
     * @param index node position
     * @return node at the given index
     */
    private Node get(int index) {

        // Validate the index
        checkElementIndex(index);

        // Start from head
        Node node = head;

        // Move forward until the required index
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    // ========================================
    // 8. GET VALUE AT ANY INDEX
    // ========================================

    /**
     * Returns the value stored at the specified index.
     *
     * @param index node position
     * @return value stored in the node
     */
    public int getValue(int index) {
        return get(index).value;
    }

    // ========================================
    // 9. DELETE FIRST NODE
    // ========================================

    /**
     * Removes and returns the first node's value.
     *
     * Time Complexity: O(1)
     *
     * @return deleted value
     */
    public int deleteFirst() {

        // Cannot delete from an empty list
        if (head == null) {
            throw new IllegalStateException(
                    "Cannot delete from an empty list"
            );
        }

        // Store the value before removing the node
        int value = head.value;

        // Move head to the next node
        head = head.next;

        // If the list becomes empty, reset tail too
        if (head == null) {
            tail = null;
        }

        // Decrease size
        size--;

        return value;
    }

    // ========================================
    // 10. DELETE LAST NODE
    // ========================================

    /**
     * Removes and returns the last node's value.
     *
     * Time Complexity: O(n)
     *
     * @return deleted value
     */
    public int deleteLast() {

        // Handle an empty list
        if (head == null) {
            throw new IllegalStateException(
                    "Cannot delete from an empty list"
            );
        }

        // If there is only one node, delete the first node
        if (size == 1) {
            return deleteFirst();
        }

        // Find the node immediately before tail
        Node secondLast = get(size - 2);

        // Store the last node's value
        int value = tail.value;

        // Make secondLast the new tail
        tail = secondLast;

        // Disconnect the old last node
        tail.next = null;

        // Decrease size
        size--;

        return value;
    }

    // ========================================
    // 11. DELETE NODE AT ANY INDEX
    // ========================================

    /**
     * Removes and returns the value at a given index.
     *
     * Valid indexes: 0 to size - 1.
     *
     * Time Complexity: O(n)
     *
     * @param index position to delete
     * @return deleted value
     */
    public int deleteAnyIndex(int index) {

        // Validate the index before accessing any node
        checkElementIndex(index);

        // Delete the first node
        if (index == 0) {
            return deleteFirst();
        }

        // Delete the last node
        if (index == size - 1) {
            return deleteLast();
        }

        // Find the node before the target node
        Node previous = get(index - 1);

        // Identify the node to remove
        Node target = previous.next;

        // Skip the target node
        previous.next = target.next;

        // Decrease size
        size--;

        return target.value;
    }

    // ========================================
    // 12. SEARCH FOR A VALUE
    // ========================================

    /**
     * Finds the first node containing the given value.
     *
     * Time Complexity: O(n)
     *
     * @param value value to search for
     * @return node if found, otherwise null
     */
    private Node find(int value) {

        Node node = head;

        // Traverse through the list
        while (node != null) {

            // Return the matching node
            if (node.value == value) {
                return node;
            }

            node = node.next;
        }

        // Value was not found
        return null;
    }

    // ========================================
    // 13. GET INDEX OF A VALUE
    // ========================================

    /**
     * Returns the index of the first matching value.
     *
     * @param value value to search for
     * @return index if found, otherwise -1
     */
    public int indexOf(int value) {

        Node node = head;
        int index = 0;

        while (node != null) {

            if (node.value == value) {
                return index;
            }

            node = node.next;
            index++;
        }

        return -1;
    }

    // ========================================
    // 14. CHECK WHETHER A VALUE EXISTS
    // ========================================

    /**
     * Checks whether the list contains a value.
     *
     * @param value value to search for
     * @return true if found, otherwise false
     */
    public boolean contains(int value) {
        return find(value) != null;
    }

    // ========================================
    // 15. GET THE SIZE
    // ========================================

    /**
     * Returns the total number of nodes.
     *
     * Time Complexity: O(1)
     */
    public int getSize() {
        return size;
    }

    // ========================================
    // 16. CHECK IF THE LIST IS EMPTY
    // ========================================

    /**
     * Returns true if there are no nodes.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    // ========================================
    // 17. INDEX VALIDATION HELPERS
    // ========================================

    /**
     * Validates an index used to access an existing node.
     *
     * Valid range: 0 to size - 1.
     */
    private void checkElementIndex(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(
                    "Index: " + index + ", Size: " + size
            );
        }
    }

    // ========================================
    // 18. NODE CLASS
    // ========================================

    /**
     * Represents one node in the linked list.
     *
     * Each node stores an integer and a reference
     * to the next node.
     */
    private class Node {

        private int value; // Data stored in the node
        private Node next; // Reference to the next node

        /**
         * Creates a node without a next reference.
         */
        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        /**
         * Creates a node with a specified next reference.
         */
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
