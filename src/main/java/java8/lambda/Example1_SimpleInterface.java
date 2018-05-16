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

        SimpleInterface simpleInterfaceAnonymous1 = new SimpleInterface() {
            @Override
            public void doStuff(String string) {
                System.out.println("Anonymous " + string);
            }
        };

        SimpleInterface simpleInterfaceLambda1 = (s) -> System.out.println("Mighty lambda " + s);

        SimpleInterface simpleInterfaceAnonymous2 = new SimpleInterface() {
            @Override
            public void doStuff(String string) {
                System.out.println("Anonymous " + string);
            }
        };

        SimpleInterface simpleInterfaceLambda2 = (s) -> System.out.println("Mighty lambda " + s);

        SimpleInterface simpleInterfaceAnonymous3 = new SimpleInterface() {
            @Override
            public void doStuff(String string) {
                System.out.println("Anonymous " + string);
            }
        };

        SimpleInterface simpleInterfaceLambda3 = (s) -> System.out.println("Mighty lambda " + s);

        SimpleInterface simpleInterfaceAnonymous4 = new SimpleInterface() {
            @Override
            public void doStuff(String string) {
                System.out.println("Anonymous " + string);
            }
        };

        SimpleInterface simpleInterfaceLambda4 = (s) -> System.out.println("Mighty lambda " + s);

        SimpleInterface simpleInterfaceAnonymous5 = new SimpleInterface() {
            @Override
            public void doStuff(String string) {
                System.out.println("Anonymous " + string);
            }
        };

        SimpleInterface simpleInterfaceLambda5 = (s) -> System.out.println("Mighty lambda " + s);

        SimpleInterface simpleInterfaceAnonymous6 = new SimpleInterface() {
            @Override
            public void doStuff(String string) {
                System.out.println("Anonymous " + string);
            }
        };

        SimpleInterface simpleInterfaceLambda6 = (s) -> System.out.println("Mighty lambda " + s);

    }
}
