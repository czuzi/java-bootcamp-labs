package array;

public class ArrayHandler {

    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();
        int[] arrOfNumbers = {21, 31, 1, 44, 1221, 12};
        String[] arrOfStrings = {"dfaEF", "DWDWD", "dsfgh", "dsw"};

        arrayHandler.addIndexToNumber(arrOfNumbers);
        arrayHandler.concatenateIndexToWord(arrOfStrings);

        String arrOfNumbersResult = "";
        for (int number : arrOfNumbers) {
            arrOfNumbersResult += number + " ";
        }
        System.out.println(arrOfNumbersResult);

        String arrOfStringsResult = "";
        for (String string : arrOfStrings) {
            arrOfStringsResult += string + " ";
        }
        System.out.println(arrOfStringsResult);
    }

    public void addIndexToNumber(int[] source) {

        for (int i = 0; i < source.length; i++) {
            source[i] += i;
        }
    }

    public void concatenateIndexToWord(String[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] = i + source[i];
        }
    }
}
