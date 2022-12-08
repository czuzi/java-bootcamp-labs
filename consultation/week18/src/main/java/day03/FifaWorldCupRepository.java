package day03;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class FifaWorldCupRepository {

	private JdbcTemplate jdbcTemplate;

	public FifaWorldCupRepository(DataSource ds) {
		jdbcTemplate = new JdbcTemplate(ds);
	}

	private static Game mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Game(
				rs.getLong("id"),
				rs.getDate("date_of_game").toLocalDate(),
				rs.getString("first_team"),
				rs.getString("second_team"),
				rs.getInt("first_team_score"),
				rs.getInt("second_team_score")
		);
	}

	public void insertGame(Game game) {
		jdbcTemplate.update("insert into fifa_world_cup (date_of_game, first_team, second_team, first_team_score, second_team_score) values (?, ?, ?, ?, ?)",
				game.getDate(), game.getFirstTeam(), game.getSecondTeam(), game.getFirstTeamScore(), game.getSecondTeamScore());
	}

	public List<Game> listAllGames() {
		return jdbcTemplate.query("select * from fifa_world_cup",
				(FifaWorldCupRepository::mapRow));
	}

	public List<Game> listAllGamesOnGivenDate(LocalDate date) {
		return jdbcTemplate.query("select * from fifa_world_cup where date_of_game = ?",
				(FifaWorldCupRepository::mapRow), Date.valueOf(date));
	}

	public Integer findMostGoalsInOneGame() {
		return jdbcTemplate.queryForObject("SELECT MAX(first_team_score + second_team_score) AS goals FROM fifa_world_cup;",
				((rs, rowNum) -> rs.getInt("goals")));
	}

	public Game findGameWithMostGoals() {
		return jdbcTemplate.queryForObject("SELECT *, MAX(first_team_score + second_team_score) FROM fifa_world_cup;",
				(FifaWorldCupRepository::mapRow));
	}

	public List<String> findAllTeamWhichHasPlayed() {
		return jdbcTemplate.query(
				"SELECT DISTINCT first_team AS team FROM fifa_world_cup UNION SELECT DISTINCT second_team AS team FROM fifa_world_cup;",
				((rs, rowNum) -> rs.getString("team")));
	}
}
