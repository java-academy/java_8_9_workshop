package java8.interfaces;

import java.util.function.Consumer;

public class PrintingConsumer implements Consumer<Integer> {
    @Override
    public void accept(Integer toBePrinted) {
        System.out.println("From printing consumer: " + toBePrinted);
    }
}
