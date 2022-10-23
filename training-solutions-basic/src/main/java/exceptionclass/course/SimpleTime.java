package exceptionclass.course;

public class SimpleTime {

	private int hours;
	private int minutes;

	public SimpleTime(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}

	public SimpleTime(String time) {
		String[] timeSplit = time.split(":");
		this.hours = Integer.parseInt(timeSplit[0]);
		this.minutes = Integer.parseInt(timeSplit[1]);
	}

	@Override
	public String toString() {
		return hours + ":" + minutes;
	}

	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}
}
