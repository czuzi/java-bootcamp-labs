package introdate;

public class University {

    public static void main(String[] args) {

        Exam exam1 = new Exam("Math", 2023, 12, 1, 10, 30);
        Exam exam2 = new Exam("Literature", 2023, 1, 2, 9, 0);

        System.out.println(exam1.getMessage());
        System.out.println(exam2.getMessage());
        System.out.println(exam1.getExamDate().isBefore(exam2.getExamDate()));
    }
}
