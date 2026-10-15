
package Linkedlist;

/**
 * Main class to test the Singly Linked List.
 *
 * This class demonstrates:
 * 1. Inserting elements at the beginning
 * 2. Inserting elements at the end
 * 3. Inserting elements at a specific index
 * 4. Displaying the linked list
 * 5. Searching for an element
 * 6. Deleting elements
 */
public class singlyMain {

    public static void main(String[] args) {

        // Create an object of the Singly Linked List
        singly list = new singly();

        // ========================================
        // 1. INSERT ELEMENTS
        // ========================================

        // Insert 10 at the beginning
        list.insertFirst(10);

        // Insert elements at the end
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);

        // Current list: 10 -> 20 -> 30 -> 40 -> 50

        // ========================================
        // 2. INSERT AT A SPECIFIC INDEX
        // ========================================

        // Insert 35 at index 3
        // Indexing starts from 0
        list.insertAtAnyIndex(35, 3);

        // Expected list:
        // 10 -> 20 -> 30 -> 35 -> 40 -> 50
        System.out.println("After insertion:");
        list.display();

        // ========================================
        // 3. DISPLAY LIST SIZE
        // ========================================

        System.out.println("Size: " + list.getSize());

        // ========================================
        // 4. SEARCH FOR AN ELEMENT
        // ========================================

        System.out.println("Index of 40: " + list.indexOf(40));

        // ========================================
        // 5. GET ELEMENT AT AN INDEX
        // ========================================

        System.out.println("Element at index 2: "
                + list.getValue(2));

        // ========================================
        // 6. DELETE ELEMENTS
        // ========================================

        // Delete the first element
        // System.out.println("Deleted first: "
        //         + list.deleteFirst());

        // Delete the last element
        // System.out.println("Deleted last: "
        //         + list.deleteLast());

        // Delete element at index 2
        // System.out.println("Deleted at index 2: "
        //         + list.deleteAnyIndex(2));

        // ========================================
        // 7. FINAL LIST
        // ========================================

        System.out.println("Final list:");
        list.display();

        System.out.println("Final size: " + list.getSize());
    }
}
