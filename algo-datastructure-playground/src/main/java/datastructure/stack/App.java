package datastructure.stack;

public class App {

    public static void main(String[] args) {
        Stack stack = new Stack(10);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());

        stack.push(20);

        System.out.println(stack.pop());
    }

}
