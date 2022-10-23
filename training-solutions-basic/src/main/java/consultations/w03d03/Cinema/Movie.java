package consultations.w03d03.Cinema;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Movie {

	private String name;
	private List<LocalDateTime> date;

	public Movie(String name, List<LocalDateTime> date) {
		this.name = name;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public List<LocalDateTime> getDate() {
		return date;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDate(List<LocalDateTime> date) {
		this.date = date;
	}
}
