package Queue;

public class QueueMain {
    public static void main(String[] args) {

        circularQueue queue = new circularQueue(5);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);

        queue.display();

        try {
            System.out.println(queue.remove());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        queue.display();

        queue.insert(10);
        queue.display();
    }
}