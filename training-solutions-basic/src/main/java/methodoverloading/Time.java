package methodoverloading;

public class Time {

	private int hours;
	private int minutes;
	private int seconds;

	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public int timeInSeconds() {
		return 3600 * hours + 60 * minutes + seconds;
	}

	public boolean isEqual(Time time) {
		return timeInSeconds() == time.timeInSeconds();
	}

	public boolean isEqual(int hours, int minutes, int seconds) {
		Time time = new Time(hours, minutes, seconds);
		return isEqual(time);
	}

	public boolean isEarlier(Time time) {
		return timeInSeconds() < time.timeInSeconds();
	}

	public boolean isEarlier(int hours, int minutes, int seconds) {
		Time time = new Time(hours, minutes, seconds);
		return isEarlier(time);
	}
}
