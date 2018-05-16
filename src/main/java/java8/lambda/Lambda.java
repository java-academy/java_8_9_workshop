package java8.lambda;

public class Lambda {

    // What lambda expression is?
    //      Quick answer: it is a method

    // Syntax
    //      <argument_list> -> <body>
    //                     x -> x*x
    //
    //      argument list:
    //      (Integer x, Long y) -> System.out.println(x*y) - with defined types
    //      (x, y) -> System.out.println(x*y) - with assumed types
    //      () -> System.out.println("I'm printing") - empty parameter list
    //
    //      body:
    //      (x, y) -> System.out.println(x*y) - single statement - void returned
    //      (x, y) -> {
    //                  x = 2;
    //                  System.out.println(x*y);        - multiple statements - void returned
    //                }
    //      (x, y) -> {
    //                  x = 2;
    //                  return x*y;       - multiple statements - value returned
    //                }
}
