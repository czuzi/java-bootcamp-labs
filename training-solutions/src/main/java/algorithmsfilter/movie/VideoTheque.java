package algorithmsfilter.movie;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {

	private List<Movie> movies = new ArrayList<>();

	public List<Movie> getMovies() {
		return movies;
	}

	public void addMovie(Movie movie) {
		movies.add(movie);
	}


	public List<Movie> getGoodMoviesWithCategoryGiven(Category category) {
		List<Movie> res = new ArrayList<>();
		for (Movie movie: movies) {
			if (movie.getRating() > 3 && movie.getCategory() == category) {
				res.add(movie);
			}
		}
		return res;
	}
}
