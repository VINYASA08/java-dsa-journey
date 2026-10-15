
package Linkedlist;

/**
 * Main class for testing the Doubly Linked List.
 *
 * Demonstrates:
 * 1. Insertion at the beginning
 * 2. Insertion at the end
 * 3. Insertion after a given value
 * 4. Insertion at a specific index
 * 5. Forward and reverse traversal
 * 6. Searching for elements
 * 7. Deletion operations
 */
public class doublyMain {

    public static void main(String[] args) {

        // Create a Doubly Linked List object
        Doubly list = new Doubly();

        // ========================================
        // 1. INSERT AT THE BEGINNING
        // ========================================

        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.insertFirst(60);

        // List: 60 <-> 50 <-> 40 <-> 30 <-> 20

        System.out.println("After inserting at the beginning:");
        list.display();

        // ========================================
        // 2. INSERT AT THE END
        // ========================================

        list.insertLast(10);
        list.insertLast(5);

        System.out.println("\nAfter inserting at the end:");
        list.display();

        // ========================================
        // 3. INSERT AFTER A GIVEN VALUE
        // ========================================

        // Insert 35 after 40
        list.insertAfter(40, 35);

        System.out.println("\nAfter inserting 35 after 40:");
        list.display();

        // ========================================
        // 4. INSERT AT A SPECIFIC INDEX
        // ========================================

        // Insert 100 at index 2
        list.insertAtIndex(100, 2);

        System.out.println("\nAfter inserting 100 at index 2:");
        list.display();

        // ========================================
        // 5. SEARCH FOR AN ELEMENT
        // ========================================

        System.out.println("\nDoes 35 exist? "
                + list.contains(35));

        System.out.println("Index of 40: "
                + list.indexOf(40));

        // ========================================
        // 6. GET VALUE AT AN INDEX
        // ========================================

        System.out.println("Value at index 2: "
                + list.getValue(2));

        // ========================================
        // 7. DISPLAY SIZE
        // ========================================

        System.out.println("Size: " + list.getSize());

        // ========================================
        // 8. DELETE OPERATIONS
        // ========================================

        // Uncomment to test deletion methods:

        // System.out.println("Deleted first: "
        //         + list.deleteFirst());

        // System.out.println("Deleted last: "
        //         + list.deleteLast());

        // System.out.println("Deleted at index 2: "
        //         + list.deleteAtIndex(2));

        // ========================================
        // 9. FINAL LIST
        // ========================================

        System.out.println("\nFinal list:");
        list.display();

        System.out.println("Final size: " + list.getSize());
    }
}
