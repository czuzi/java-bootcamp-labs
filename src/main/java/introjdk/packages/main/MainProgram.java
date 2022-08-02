package introjdk.packages.main;

import introjdk.packages.greetings.Greeter;

public class MainProgram {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
