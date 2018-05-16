package java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise1_InterfeceForLambda {

    // Implement interface which is accepting description and list of integer values
    // Implement lambda based on this interface in a way that it is showing each value
    //      from list increased by 10, followed by description.
    //      It is also returning sum of elements increased by 10. Print it out later

    public static void main(String[] args) {
        InterfaceForLambda interfaceForLambda = (description, integerList) -> {
            int sum = 0;
            for (Integer number : integerList){
                System.out.println(description + (number + 10));
                sum += number + 10;
            }

            return sum;
        };

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Sum of elements " + interfaceForLambda.doStuff("Element increased by 10: ", integerList));
    }
}
