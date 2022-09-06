package introexceptionthrow.patient;

public class Snn {

    public boolean isValidSnn(String snn) {
        if (!(Integer.parseInt(snn) == 9)) {
            throw new IllegalArgumentException("snn must be exacty nine digits");
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
        if (res % 10 == Integer.parseInt(Character.toString(snn.charAt(8)))) {
            return true;
        } else {
            return false;
        }
    }
}
