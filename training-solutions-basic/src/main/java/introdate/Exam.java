package introdate;

import java.security.spec.ECField;
import java.time.LocalDateTime;

public class Exam {

    private String subject;
    private LocalDateTime examDate;

    public Exam(String subject, int year, int month, int day, int hour, int minute) {
        this.subject = subject;
        examDate = LocalDateTime.of(year, month, day, hour, minute);
    }

    public String getSubject() {
        return subject;
    }

    public LocalDateTime getExamDate() {
        return examDate;
    }

    public  String makeLineNumberFromDay() {
        return switch (examDate.getDayOfMonth()) {
            case 1 -> examDate.getDayOfMonth() + "st";
            case 2 -> examDate.getDayOfMonth() + "nd";
            case 3 -> examDate.getDayOfMonth() + "rd";
            default -> examDate.getDayOfMonth() + "th";
        };
    }

    public String getMessage() {
        return "Your" + subject + " will be on the " + makeLineNumberFromDay() + " of " + examDate.getMonth();
    }
}
