package Stack;

public class Stacks {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int ptr = -1;

    public Stacks() {
        this(DEFAULT_SIZE);
    }

    public Stacks(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be positive");
        }
        data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }

        data[++ptr] = item;
        return true;
    }

    public int pop() throws stackExceptions {
        if (isEmpty()) {
            throw new stackExceptions("Cannot pop from an empty stack");
        }

        return data[ptr--];
    }

    public int peek() throws stackExceptions {
        if (isEmpty()) {
            throw new stackExceptions("Cannot peek from an empty stack");
        }

        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
