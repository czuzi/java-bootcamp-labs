package day03;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.util.List;

public class FifaWorldCupRepository {

	private JdbcTemplate jdbcTemplate;

	public FifaWorldCupRepository(DataSource ds) {
		jdbcTemplate = new JdbcTemplate(ds);
	}

	public void insertGame(Game game) {
		jdbcTemplate.update("insert into fifa_world_cup (date_of_game, first_team, second_team, first_team_score, second_team_score) values (?, ?, ?, ?, ?)",
				game.getDate(), game.getFirstTeam(), game.getSecondTeam(), game.getFirstTeamScore(), game.getSecondTeamScore());
	}

	public List<Game> listAllGames() {
		return jdbcTemplate.query("select * from fifa_world_cup",
				((rs, rowNum) -> new Game(rs.getLong("id"),
						rs.getDate("date_of_game").toLocalDate(),
						rs.getString("first_team"),
						rs.getString("second_team"),
						rs.getInt("first_team_score"),
						rs.getInt("second_team_score")
						)));
	}
}
