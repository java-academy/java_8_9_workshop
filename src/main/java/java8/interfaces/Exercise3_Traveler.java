package java8.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise3_Traveler {
    // 1. Create collection
    // 2. Traverse collection using iterator
    // 3. Traverse collection using collectionName.forEach() and anonymous class
    // 4. Traverse collection using Consumer<Integer>
    // 5. Traverse collection using Consumer<Integer> and show values increased by 10 in it

    // 1.
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<10; i++) myList.add(i);

        myList = IntStream.range(0, 10)
                .boxed()
                .collect(Collectors.toList());

    // 2.
        Iterator<Integer> it = myList.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println("From iterator: " + i);
        }

    }
}
