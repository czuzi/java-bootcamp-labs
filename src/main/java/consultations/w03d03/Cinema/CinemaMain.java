package consultations.w03d03.Cinema;

import java.time.LocalDateTime;
import java.util.Arrays;

public class CinemaMain {

	public static void main(String[] args) {
		Cinema cinema = new Cinema();

		cinema.addMovie(new Movie("Titanic", Arrays.asList(
				LocalDateTime.of(2022,8,10,12,45),
				LocalDateTime.of(2022,8,10,22,25)
		)));
		cinema.addMovie(new Movie("Jurassic Park", Arrays.asList(
				LocalDateTime.of(2022,8,10,19,45),
				LocalDateTime.of(2022,8,10,20,25),
				LocalDateTime.of(2022,8,10,22,25)
		)));

		System.out.println(cinema.findMovieByTime(LocalDateTime.of(2022,8,10,10,45))); // []
		System.out.println(cinema.findMovieByTime(LocalDateTime.of(2022,8,10,19,45))); // [Jurassic Park]
		System.out.println(cinema.findMovieByTime(LocalDateTime.of(2022,8,10,22,25))); // [Titanic, Jurassic Park]

	}
}
