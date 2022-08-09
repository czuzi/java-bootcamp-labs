package consultations.w03d02;

import java.util.ArrayList;
import java.util.List;

public class Movie {

	private String title;
	private int releaseDate;
	List<Actor> listOfActors = new ArrayList<>();

	public String getTitle() {
		return title;
	}

	public Movie(String title, int releaseDate) {
		this.title = title;
		this.releaseDate = releaseDate;
	}

	public void addActor(Actor actor) {
		listOfActors.add(actor);
	}

	public int actorsInTheirTwenties() {
		int numberOfActors = 0;

		for (Actor actor : listOfActors) {
			if (releaseDate - actor.getDateOfBirth() >= 20 && releaseDate - actor.getDateOfBirth() < 30) {
				numberOfActors += 1;
			}
		}
		return numberOfActors;
	}

	public static void main(String[] args) {
		Movie movie = new Movie("random movie title", 1998);
		Actor actor1 = new Actor("random name1", 1975);
		Actor actor2 = new Actor("random name2", 1980);
		Actor actor3 = new Actor("random name3", 1954);
		Actor actor4 = new Actor("random name4", 1970);
		Actor actor5 = new Actor("random name6", 1969);
		movie.addActor(actor1);
		movie.addActor(actor2);
		movie.addActor(actor3);
		movie.addActor(actor4);
		movie.addActor(actor5);
		System.out.println(movie.getTitle() + " has " + movie.actorsInTheirTwenties() + " actors in their twenties");
	}

}
