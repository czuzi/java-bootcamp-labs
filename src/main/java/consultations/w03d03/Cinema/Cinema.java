package consultations.w03d03.Cinema;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {

	private List<Movie> movieList = new ArrayList<>();

	public void addMovie(Movie movie) {
		movieList.add(movie);
	}

	public List<String> findMovieByTime(LocalDateTime date) {
		List<String> title = new ArrayList<>();
		for (Movie movie : movieList) {
			if (movie.getDate().contains(date)) {
				title.add(movie.getName());
			}
		}
		return title;
	}
}
