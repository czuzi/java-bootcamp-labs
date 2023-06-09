package day03;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FifaWorldCupRepositoryTest {

	FifaWorldCupRepository fifaWorldCupRepository;

	@BeforeEach
	void init() {
		MariaDbDataSource ds = new MariaDbDataSource();
		try {
			ds.setUrl("jdbc:mariadb://localhost:3306/fifadb?useUnicode=true");
			ds.setUser("fifa");
			ds.setPassword("fifa");
		} catch (SQLException se) {
			throw new IllegalStateException("Cannot connect", se);
		}

		fifaWorldCupRepository = new FifaWorldCupRepository(ds);

		Flyway flyway = Flyway.configure().cleanDisabled(false).dataSource(ds).load();

		flyway.clean();
		flyway.migrate();

		fifaWorldCupRepository.insertGame(
				new Game(LocalDate.of(2022,11,22),"France","Australia",4,1)
		);

		fifaWorldCupRepository.insertGame(
				new Game(LocalDate.of(2022,11,23),"Morocco","Croatia",0,0)
		);

		fifaWorldCupRepository.insertGame(
				new Game(LocalDate.of(2022,11,22),"Denmark","Tunis",0,0)
		);

		fifaWorldCupRepository.insertGame(
				new Game(LocalDate.of(2022,11,22),"Argentina","Saudi-Arabia",1,2)
		);
	}

	@Test
	void testInsertGameAndListGames() {
		assertEquals(4, fifaWorldCupRepository.listAllGames().size());
	}

	@Test
	void testListGamesOnDateGiven() {
		assertEquals(3, fifaWorldCupRepository.listAllGamesOnGivenDate(LocalDate.of(2022, 11, 22)).size());
	}

	@Test
	void testFindMostGoalsInOneGame() {
		assertEquals(5, fifaWorldCupRepository.findMostGoalsInOneGame());
	}

	@Test
	void testFindGameWithMostGoals() {
		Game expected = new Game(LocalDate.of(2022,11,22),"France","Australia",4,1);
		assertEquals(expected.getFirstTeam(), fifaWorldCupRepository.findGameWithMostGoals().getFirstTeam());
	}

	@Test
	void testFindAllTeamWhichHasPlayed() {
		assertEquals(8, fifaWorldCupRepository.findAllTeamWhichHasPlayed().size());
		fifaWorldCupRepository.insertGame(new Game(LocalDate.of(2022,11,25),"France","Belgium",4,1));
		assertEquals(9, fifaWorldCupRepository.findAllTeamWhichHasPlayed().size());
	}
}