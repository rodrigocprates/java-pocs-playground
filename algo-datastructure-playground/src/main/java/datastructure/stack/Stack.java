package datastructure.stack;

public class Stack {

    private int maxSize;
    private long[] stack;
    private int top; // index of the last item placed on the stack

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new long[maxSize];
        this.top = -1; // no items on the stack yet
    }

    public void push(long item) {
        top++;
        stack[top] = item;
    }

    public long pop() {
        int topItem = top;
        top--;
        return stack[topItem];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return maxSize-1 == top;
    }

}
