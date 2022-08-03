package consultations.w02d03;

import java.util.Scanner;

public class Mathematics {

    private boolean b = false;

    public boolean isPrime(int number) {
        for(int i = 2; i < number/2; i++) {
            if (number % i == 0) {
                b = true;
                break;
            }
        }
        return b;
    }

}
