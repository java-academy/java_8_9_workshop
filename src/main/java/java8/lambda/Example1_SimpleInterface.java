package java8.lambda;

public class Example1_SimpleInterface {
    public static void main(String[] args) {
        SimpleInterface simpleInterfaceAnonymous = new SimpleInterface() {
            @Override
            public void doStuff(String string) {
                System.out.println("Anonymous " + string);
            }
        };

        SimpleInterface simpleInterfaceLambda = (s) -> System.out.println("Mighty lambda " + s);

        simpleInterfaceAnonymous.doStuff("is doing stuff.");
        simpleInterfaceLambda.doStuff("is doing stuff.");
        
    }
}
