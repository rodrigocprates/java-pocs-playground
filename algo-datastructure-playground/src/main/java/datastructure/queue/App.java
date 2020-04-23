package datastructure.queue;

public class App {
    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.view();

        queue.remove();
        queue.insert(3);

        queue.view();

    }

}
