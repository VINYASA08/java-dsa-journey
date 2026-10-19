package Stack;

public class stackMain {

    public static void main(String[] args) {

        Stacks stack = new Stacks();

        try {
            stack.push(340);
            stack.push(120);

            System.out.println("Top: " + stack.peek());
            System.out.println("Popped: " + stack.pop());
            System.out.println("Popped: " + stack.pop());

            System.out.println("Popped: " + stack.pop());

        } catch (stackExceptions e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}