
package Linkedlist;

/**
 * Circular Singly Linked List implementation.
 *
 * In a circular linked list:
 * - Each node stores a value and a next reference.
 * - head points to the first node.
 * - tail points to the last node.
 * - tail.next always points back to head when non-empty.
 *
 * There is no null at the end of a non-empty list.
 */
public class Circular {

    // ========================================
    // 1. INSTANCE VARIABLES
    // ========================================

    private Node head; // First node
    private Node tail; // Last node
    private int size;  // Total number of nodes

    // ========================================
    // 2. CONSTRUCTOR
    // ========================================

    /**
     * Creates an empty circular linked list.
     */
    public Circular() {
        head = null;
        tail = null;
        size = 0;
    }

    // ========================================
    // 3. INSERT AT THE END
    // ========================================

    /**
     * Inserts a node at the end of the list.
     *
     * Time Complexity: O(1)
     *
     * @param val value to insert
     */
    public void insert(int val) {

        // Create a new node
        Node node = new Node(val);

        // Handle an empty list
        if (head == null) {
            head = node;
            tail = node;

            // The only node points to itself
            node.next = head;

            size++;
            return;
        }

        // Connect the old tail to the new node
        tail.next = node;

        // The new tail points back to head
        node.next = head;

        // Update tail
        tail = node;

        size++;
    }

    // ========================================
    // 4. INSERT AT THE BEGINNING
    // ========================================

    /**
     * Inserts a node at the beginning.
     *
     * Time Complexity: O(1)
     *
     * @param val value to insert
     */
    public void insertFirst(int val) {

        // Create a new node
        Node node = new Node(val);

        // Handle an empty list
        if (head == null) {
            head = node;
            tail = node;
            node.next = head;

            size++;
            return;
        }

        // New node points to the current head
        node.next = head;

        // Update head
        head = node;

        // Maintain the circular connection
        tail.next = head;

        size++;
    }

    // ========================================
    // 5. INSERT AT ANY INDEX
    // ========================================

    /**
     * Inserts a node at the specified index.
     *
     * Valid indexes: 0 to size, inclusive.
     *
     * Time Complexity: O(n)
     *
     * @param val value to insert
     * @param index position for insertion
     */
    public void insertAtIndex(int val, int index) {

        // Validate the index
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(
                    "Index: " + index + ", Size: " + size
            );
        }

        // Insert at the beginning
        if (index == 0) {
            insertFirst(val);
            return;
        }

        // Insert at the end
        if (index == size) {
            insert(val);
            return;
        }

        // Find the node before the insertion position
        Node previous = get(index - 1);

        // Create the new node
        Node node = new Node(val);

        // Connect the new node
        node.next = previous.next;
        previous.next = node;

        size++;
    }

    // ========================================
    // 6. DISPLAY THE LIST
    // ========================================

    /**
     * Displays all nodes exactly once.
     *
     * A do-while loop is useful because traversal
     * must stop when it returns to head.
     *
     * Time Complexity: O(n)
     */
    public void display() {

        // An empty list has nothing to display
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node node = head;

        // Traverse the circle once
        do {
            System.out.print(node.val + " -> ");
            node = node.next;

        } while (node != head);

        System.out.println("HEAD");
    }

    // ========================================
    // 7. GET NODE AT ANY INDEX
    // ========================================

    /**
     * Returns the node at the specified index.
     *
     * Valid indexes: 0 to size - 1.
     *
     * Time Complexity: O(n)
     *
     * @param index node index
     * @return requested node
     */
    private Node get(int index) {

        // Validate the index
        checkElementIndex(index);

        Node node = head;

        // Move forward to the requested index
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    // ========================================
    // 8. GET VALUE AT ANY INDEX
    // ========================================

    /**
     * Returns the value stored at an index.
     *
     * @param index node index
     * @return stored value
     */
    public int getValue(int index) {
        return get(index).val;
    }

    // ========================================
    // 9. DELETE BY VALUE
    // ========================================

    /**
     * Deletes the first occurrence of a value.
     *
     * If the value does not exist, the list
     * remains unchanged.
     *
     * Time Complexity: O(n)
     *
     * @param val value to delete
     */
    public void delete(int val) {

        // Handle an empty list
        if (head == null) {
            return;
        }

        // If head contains the value, delete the first node
        if (head.val == val) {
            deleteFirst();
            return;
        }

        // Start from head
        Node current = head;

        // Find the node before the target
        while (current.next != head) {

            if (current.next.val == val) {

                Node target = current.next;

                // Skip the target node
                current.next = target.next;

                // If target was tail, update tail
                if (target == tail) {
                    tail = current;
                }

                // Maintain circular connection
                tail.next = head;

                size--;
                return;
            }

            current = current.next;
        }

        // No matching value was found
    }

    // ========================================
    // 10. DELETE FIRST NODE
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
                    "Cannot delete from an empty list."
            );
        }

        int value = head.val;

        // If only one node exists
        if (head == tail) {
            head = null;
            tail = null;
        } else {

            // Move head to the next node
            head = head.next;

            // Maintain the circular connection
            tail.next = head;
        }

        size--;
        return value;
    }

    // ========================================
    // 11. DELETE LAST NODE
    // ========================================

    /**
     * Removes and returns the last node's value.
     *
     * Time Complexity: O(n)
     *
     * @return deleted value
     */
    public int deleteLast() {

        // Cannot delete from an empty list
        if (head == null) {
            throw new IllegalStateException(
                    "Cannot delete from an empty list."
            );
        }

        // If only one node exists
        if (head == tail) {
            return deleteFirst();
        }

        // Find the node before tail
        Node current = head;

        while (current.next != tail) {
            current = current.next;
        }

        // Store the last value
        int value = tail.val;

        // Make current the new tail
        tail = current;

        // Maintain circular connection
        tail.next = head;

        size--;
        return value;
    }

    // ========================================
    // 12. DELETE AT ANY INDEX
    // ========================================

    /**
     * Deletes and returns the value at an index.
     *
     * Valid indexes: 0 to size - 1.
     *
     * Time Complexity: O(n)
     *
     * @param index position to delete
     * @return deleted value
     */
    public int deleteAtIndex(int index) {

        // Validate the index
        checkElementIndex(index);

        // Delete the first node
        if (index == 0) {
            return deleteFirst();
        }

        // Delete the last node
        if (index == size - 1) {
            return deleteLast();
        }

        // Find the node before the target
        Node previous = get(index - 1);

        // Store the target node
        Node target = previous.next;

        // Skip the target node
        previous.next = target.next;

        // Disconnect the removed node
        target.next = null;

        size--;
        return target.val;
    }

    // ========================================
    // 13. SEARCH FOR A VALUE
    // ========================================

    /**
     * Finds the first node containing the value.
     *
     * @param val value to search for
     * @return node if found, otherwise null
     */
    private Node findNode(int val) {

        // Empty list
        if (head == null) {
            return null;
        }

        Node node = head;

        // Traverse the circle exactly once
        do {

            if (node.val == val) {
                return node;
            }

            node = node.next;

        } while (node != head);

        return null;
    }

    // ========================================
    // 14. CHECK WHETHER A VALUE EXISTS
    // ========================================

    /**
     * Checks whether a value exists in the list.
     *
     * @param val value to search for
     * @return true if found, otherwise false
     */
    public boolean contains(int val) {
        return findNode(val) != null;
    }

    // ========================================
    // 15. GET INDEX OF A VALUE
    // ========================================

    /**
     * Returns the index of the first occurrence.
     *
     * @param val value to search for
     * @return index if found, otherwise -1
     */
    public int indexOf(int val) {

        if (head == null) {
            return -1;
        }

        Node node = head;
        int index = 0;

        // Traverse the circle exactly once
        do {

            if (node.val == val) {
                return index;
            }

            node = node.next;
            index++;

        } while (node != head);

        return -1;
    }

    // ========================================
    // 16. GET SIZE
    // ========================================

    /**
     * Returns the number of nodes.
     *
     * Time Complexity: O(1)
     */
    public int getSize() {
        return size;
    }

    // ========================================
    // 17. CHECK IF EMPTY
    // ========================================

    /**
     * Returns true if the list is empty.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    // ========================================
    // 18. INDEX VALIDATION
    // ========================================

    /**
     * Validates an index for accessing or deleting
     * an existing node.
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
    // 19. NODE CLASS
    // ========================================

    /**
     * Represents a single node.
     */
    private class Node {

        private int val;  // Data stored in the node
        private Node next; // Reference to the next node

        /**
         * Creates a node with the given value.
         *
         * @param val value to store
         */
        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
