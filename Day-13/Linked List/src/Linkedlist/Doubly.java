
package Linkedlist;

/**
 * Doubly Linked List implementation.
 *
 * Each node contains:
 * 1. val  - data stored in the node
 * 2. next - reference to the next node
 * 3. prev - reference to the previous node
 *
 * head points to the first node.
 * tail points to the last node.
 * size stores the number of nodes.
 */
public class Doubly {

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
     * Creates an empty doubly linked list.
     */
    public Doubly() {
        this.size = 0;
    }

    // ========================================
    // 3. INSERT AT THE BEGINNING
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

        // The new node points forward to the current head
        node.next = head;

        // The new first node has no previous node
        node.prev = null;

        // If the list is not empty, update the old head
        if (head != null) {
            head.prev = node;
        } else {
            // If empty, the new node is also the tail
            tail = node;
        }

        // Update head
        head = node;

        // Increase size
        size++;
    }

    /**
     * Compatibility method for your original spelling.
     *
     * Prefer insertFirst() in new code.
     */
    public void insertFrist(int val) {
        insertFirst(val);
    }

    // ========================================
    // 4. INSERT AT THE END
    // ========================================

    /**
     * Inserts a node at the end.
     *
     * Time Complexity: O(1)
     *
     * @param val value to insert
     */
    public void insertLast(int val) {

        // If the list is empty, insert the first node
        if (tail == null) {
            insertFirst(val);
            return;
        }

        // Create the new node
        Node node = new Node(val);

        // Connect the new node to the current tail
        node.prev = tail;
        node.next = null;

        // Connect the old tail to the new node
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
     * @param val value to insert
     * @param index position to insert at
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
            insertLast(val);
            return;
        }

        // Get the node currently at the target index
        Node current = get(index);

        // The node immediately before current
        Node previous = current.prev;

        // Create the new node
        Node node = new Node(val);

        // Connect the new node in both directions
        node.prev = previous;
        node.next = current;

        // Update neighboring nodes
        previous.next = node;
        current.prev = node;

        // Increase size
        size++;
    }

    // ========================================
    // 6. INSERT AFTER A GIVEN VALUE
    // ========================================

    /**
     * Inserts a node immediately after the first
     * occurrence of the specified value.
     *
     * Time Complexity: O(n)
     *
     * @param after existing value
     * @param val new value to insert
     */
    public void insertAfter(int after, int val) {

        // Find the node containing the given value
        Node current = findNode(after);

        // Stop if the value does not exist
        if (current == null) {
            System.out.println(
                    "Value " + after + " does not exist."
            );
            return;
        }

        // If current is the last node, append the new node
        if (current == tail) {
            insertLast(val);
            return;
        }

        // Get the node after current
        Node nextNode = current.next;

        // Create the new node
        Node node = new Node(val);

        // Connect the new node to both neighbors
        node.prev = current;
        node.next = nextNode;

        // Update the neighbors
        current.next = node;
        nextNode.prev = node;

        // Increase size
        size++;
    }

    /**
     * Preserves your original method name and argument order.
     *
     * insert(after, val) inserts val after the value after.
     */
    public void insert(int after, int val) {
        insertAfter(after, val);
    }

    // ========================================
    // 7. DISPLAY IN FORWARD AND REVERSE ORDER
    // ========================================

    /**
     * Displays the list from head to tail,
     * then from tail to head.
     *
     * Time Complexity: O(n)
     */
    public void display() {

        // Start at the first node
        Node current = head;

        System.out.print("Forward: START <-> ");

        // Traverse from beginning to end
        while (current != null) {

            System.out.print(current.val + " <-> ");

            current = current.next;
        }

        System.out.println("END");

        // Start at the last node
        current = tail;

        System.out.print("Reverse: END <-> ");

        // Traverse from end to beginning
        while (current != null) {

            System.out.print(current.val + " <-> ");

            current = current.prev;
        }

        System.out.println("START");
    }

    // ========================================
    // 8. GET NODE AT ANY INDEX
    // ========================================

    /**
     * Returns the node at the specified index.
     *
     * Uses the head or tail, depending on which
     * is closer to the target index.
     *
     * Time Complexity: O(n)
     *
     * @param index node index
     * @return node at the requested index
     */
    private Node get(int index) {

        // Validate the index
        checkElementIndex(index);

        Node current;

        // Traverse from the closer end
        if (index < size / 2) {

            current = head;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }

        } else {

            current = tail;

            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }

        return current;
    }

    // ========================================
    // 9. GET VALUE AT ANY INDEX
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

        // Handle an empty list
        if (head == null) {
            throw new IllegalStateException(
                    "Cannot delete from an empty list."
            );
        }

        // Store the value before deletion
        int value = head.val;

        // Move head forward
        head = head.next;

        // If the list becomes empty, reset tail
        if (head == null) {
            tail = null;
        } else {
            // The new head must have no previous node
            head.prev = null;
        }

        // Decrease size
        size--;

        return value;
    }

    // ========================================
    // 11. DELETE LAST NODE
    // ========================================

    /**
     * Removes and returns the last node's value.
     *
     * Time Complexity: O(1)
     *
     * @return deleted value
     */
    public int deleteLast() {

        // Handle an empty list
        if (tail == null) {
            throw new IllegalStateException(
                    "Cannot delete from an empty list."
            );
        }

        // Store the last value
        int value = tail.val;

        // Move tail backward
        tail = tail.prev;

        // If the list becomes empty, reset head
        if (tail == null) {
            head = null;
        } else {
            // The new tail must have no next node
            tail.next = null;
        }

        // Decrease size
        size--;

        return value;
    }

    // ========================================
    // 12. DELETE NODE AT ANY INDEX
    // ========================================

    /**
     * Removes and returns the value at an index.
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

        // Get the node to remove
        Node current = get(index);

        // Connect its previous and next nodes
        current.prev.next = current.next;
        current.next.prev = current.prev;

        // Save the value
        int value = current.val;

        // Disconnect the removed node
        current.prev = null;
        current.next = null;

        // Decrease size
        size--;

        return value;
    }

    // ========================================
    // 13. SEARCH FOR A VALUE
    // ========================================

    /**
     * Searches for the first node containing a value.
     *
     * @param value value to search for
     * @return node if found, otherwise null
     */
    private Node findNode(int value) {

        Node current = head;

        // Traverse the list
        while (current != null) {

            if (current.val == value) {
                return current;
            }

            current = current.next;
        }

        // Value not found
        return null;
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
        return findNode(value) != null;
    }

    // ========================================
    // 15. GET INDEX OF A VALUE
    // ========================================

    /**
     * Returns the index of the first occurrence.
     *
     * @param value value to search for
     * @return index if found, otherwise -1
     */
    public int indexOf(int value) {

        Node current = head;
        int index = 0;

        while (current != null) {

            if (current.val == value) {
                return index;
            }

            current = current.next;
            index++;
        }

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
     * Returns true if the list contains no nodes.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    // ========================================
    // 18. INDEX VALIDATION
    // ========================================

    /**
     * Validates an index used to access or delete
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
     * Represents one node in the doubly linked list.
     */
    private class Node {

        private int val;   // Data stored in this node
        private Node next; // Reference to the next node
        private Node prev; // Reference to the previous node

        /**
         * Creates a node with no neighbors.
         *
         * @param val data to store
         */
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }

        /**
         * Creates a node with both references specified.
         *
         * @param val data to store
         * @param next next node
         * @param prev previous node
         */
        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
