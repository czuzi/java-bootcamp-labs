package array;

public class ArrayMain {

    public static void main(String[] args) {

        String[] daysOfTheWeek = {"hetfo", "kedd", "szerda", "csutortok", "pentek", "szombat", "vasarnap"};
        System.out.println(daysOfTheWeek[1]);
        System.out.println(daysOfTheWeek.length);

        String result = "";
        int[] powersOfTwo = new int[5];
        powersOfTwo[0] = 1;
        for (int i = 1; i < 5; i++) {
            powersOfTwo[i] = powersOfTwo[i - 1] * 2;
        }
        for (int elem : powersOfTwo) {
            result += elem + " ";
        }
        System.out.println(result);

        boolean[] trueOrFalse = new boolean[6];
        String trueOrFalseResult = "";
        for (int i = 1; i < 6; i++) {
            trueOrFalse[i] = !trueOrFalse[i - 1];
        }
        for (boolean elem : trueOrFalse) {
            trueOrFalseResult += elem + " ";
        }
        System.out.println(trueOrFalseResult);
    }
}
