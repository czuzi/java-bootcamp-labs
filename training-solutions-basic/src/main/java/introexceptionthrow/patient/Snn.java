package introexceptionthrow.patient;

public class Snn {

    public boolean isValidSnn(String snn) {
        if (snn.length() != 9) {
            throw new IllegalArgumentException("snn must be exactly nine digits");
        }
        int res = 0;
        for (int i = 0; i < snn.length()-1; i++) {
            int parseInt = Integer.parseInt(Character.toString(snn.charAt(i)));
            if (i % 2 == 0) {
                res += parseInt * 3;
            } else {
                res += parseInt * 7;
            }
        }
        return res % 10 == Integer.parseInt(Character.toString(snn.charAt(8)));
    }
}
