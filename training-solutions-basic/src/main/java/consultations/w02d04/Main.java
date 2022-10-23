package consultations.w02d04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList(Arrays.asList(1, 5, 6, 77, 64, 874));
        boolean isGreater = true;
        for(int i = 0; i < numbersList.size()-1; i++) {
            if (numbersList.get(i) >= numbersList.get(i+1)) {
                isGreater = false;
            }
        }

        System.out.println(isGreater);

    }
}
