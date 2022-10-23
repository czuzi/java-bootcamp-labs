package introcontrol;

import java.util.Scanner;

public class BoatRental {

    public static void main(String[] args) {
        int fiveSeatBoat = 0;
        int threeSeatBoat = 0;
        int twoSeatBoat = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Hanyan szeretnenek utazni?");
        int group = sc.nextInt();
        sc.nextLine();

        int remaining = group;

        if (remaining >= 4) {
            remaining -= 5;
            fiveSeatBoat++;
        }
        if (remaining >= 3) {
            remaining -= 3;
            threeSeatBoat++;
        }
        if (remaining > 0) {
            remaining -= 2;
            twoSeatBoat++;
        }

        System.out.println(fiveSeatBoat + "db ot szemelyes, " + threeSeatBoat + "db haromszemelyes es " + twoSeatBoat + "db ketszemelyes csonakot vittek el.");

        if (remaining > 0) {
            System.out.println(remaining + " szemely maradt a parton.");
        }
    }


}
