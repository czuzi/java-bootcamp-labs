package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class Performance {

    private LocalDate date;
    private String artist;
    private LocalTime startTime;
    private LocalTime endTime;

    public Performance(int year,int month, int day, String artist, int startHour, int startMinute, int endHour, int endMinute) {
        date = LocalDate.of(year, month, day);
        this.artist = artist;
        startTime = LocalTime.of(startHour, startMinute);
        endTime = LocalTime.of(endHour, endMinute);
    }

    public LocalDate getDate() {
        return date;
    }

    public String getArtist() {
        return artist;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getInfo() {
        return date + " " + startTime + " - " + endTime;
    }
}
