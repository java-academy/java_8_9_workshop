package java8.interfaces;

import java.util.function.Consumer;

public class IncreasingConsumer implements Consumer<Integer> {
    @Override
    public void accept(Integer integer) {
        System.out.println("From IncreasingConsumer: " + (integer + 10));
    }
}
