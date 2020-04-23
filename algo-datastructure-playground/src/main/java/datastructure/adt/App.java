package datastructure.adt;

public class App {

    public static void main(String[] args) {
        Counter mycounter = new Counter("mycounter");

        mycounter.increment();
        mycounter.increment();
        mycounter.increment();

        System.out.println(mycounter.getCurrentValue());
    }

}
