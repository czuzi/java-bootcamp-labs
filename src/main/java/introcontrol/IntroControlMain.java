package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();
        System.out.println(introControl.subtractTenIfGreaterThanTen(54));
        System.out.println(introControl.calculateBonus(6845548));
        System.out.println(introControl.describeNumber(541));
        System.out.println(introControl.greetingToJoe("Joe"));
        System.out.println(introControl.calculateConsumption(8241, 2151));
        System.out.println("printnumbers");
        introControl.printNumbers(4);
        System.out.println("between");
        introControl.printNumbersBetween(3, 7);
        System.out.println("anydir");
        introControl.printNumbersBetweenAnyDirection(7, 3);
        System.out.println("odds");
        introControl.printOddNumbers(13);

    }
}
