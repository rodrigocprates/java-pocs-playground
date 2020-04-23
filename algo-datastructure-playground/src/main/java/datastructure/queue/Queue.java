package datastructure.queue;

public class Queue {

    private int maxSize;
    private long[] queueArray; // data
    private int first; // first index
    private int last; // last index
    private int nItems;

    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new long[size];
        first = 0;
        last = -1; // no last item as it's empty
        nItems = 0;
    }

    public void insert(long item) {
        if (isFull()) {
            System.out.println(" queue is full");
        } else {
            last++;
            queueArray[last] = item;
            nItems++;
        }
    }

    public long remove() { // from beginning
        long firstIndex = queueArray[first];
        first++;
        if (first==maxSize) first = 0;
        nItems--;
        return firstIndex;
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public void view() {
        System.out.print("[ ");
        for (int i = 0; i < queueArray.length; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.print("]");
    }


}
