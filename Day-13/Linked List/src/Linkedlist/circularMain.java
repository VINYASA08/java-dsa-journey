
package Linkedlist;

/**
 * Main class for testing the Circular Linked List.
 *
 * Demonstrates:
 * 1. Insertion
 * 2. Insertion at a specific index
 * 3. Display
 * 4. Searching
 * 5. Deletion by value
 * 6. Deletion at a specific index
 * 7. Size and empty-list checks
 */
public class circularMain {

    public static void main(String[] args) {

        // Create a circular linked list
        Circular list = new Circular();

        // ========================================
        // 1. INSERT ELEMENTS
        // ========================================

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("Initial circular linked list:");
        list.display();

        // ========================================
        // 2. INSERT AT THE BEGINNING
        // ========================================

        list.insertFirst(5);

        System.out.println("\nAfter inserting 5 at the beginning:");
        list.display();

        // ========================================
        // 3. INSERT AT A SPECIFIC INDEX
        // ========================================

        // Insert 25 at index 3
        list.insertAtIndex(25, 3);

        System.out.println("\nAfter inserting 25 at index 3:");
        list.display();

        // ========================================
        // 4. SEARCH FOR AN ELEMENT
        // ========================================

        System.out.println("\nContains 30: "
                + list.contains(30));

        System.out.println("Index of 40: "
                + list.indexOf(40));

        // ========================================
        // 5. GET VALUE AT AN INDEX
        // ========================================

        System.out.println("Value at index 2: "
                + list.getValue(2));

        // ========================================
        // 6. DELETE BY VALUE
        // ========================================

        list.delete(30);

        System.out.println("\nAfter deleting value 30:");
        list.display();

        // ========================================
        // 7. DELETE FIRST AND LAST
        // ========================================

        // Uncomment to test:
        // System.out.println("Deleted first: "
        //         + list.deleteFirst());

        // System.out.println("Deleted last: "
        //         + list.deleteLast());

        // ========================================
        // 8. DELETE AT A SPECIFIC INDEX
        // ========================================

        // Uncomment to test:
        // System.out.println("Deleted at index 2: "
        //         + list.deleteAtIndex(2));

        // ========================================
        // 9. SIZE AND EMPTY CHECK
        // ========================================

        System.out.println("\nSize: " + list.getSize());
        System.out.println("Is empty: " + list.isEmpty());

        // ========================================
        // 10. FINAL LIST
        // ========================================

        System.out.println("\nFinal circular linked list:");
        list.display();
    }
}
