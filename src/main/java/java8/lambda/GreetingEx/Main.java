package GreetingEx;

public class Main {

    public static void main(String[] args) {

        Greetings greetings = new Greetings();
        Greeting helloWorldGreeting = new HelloWorldGreeting();
        Greeting helloBossGreeting = new HelloBossGreeting();

        greetings.greet(helloBossGreeting);
        greetings.greet(helloWorldGreeting);

        greetings.greet(new Greeting() {
            @Override
            public void greet() {
                System.out.println("Pozdrowionka");
            }
        });

    }

}
