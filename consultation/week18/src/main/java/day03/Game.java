package day03;

import java.time.LocalDate;

public class Game {

	private Long id;
	private LocalDate date;
	private String firstTeam;
	private String secondTeam;
	private int firstTeamScore;
	private int secondTeamScore;

	public Game(Long id, LocalDate date, String firstTeam, String secondTeam, int firstTeamScore, int secondTeamScore) {
		this.id = id;
		this.date = date;
		this.firstTeam = firstTeam;
		this.secondTeam = secondTeam;
		this.firstTeamScore = firstTeamScore;
		this.secondTeamScore = secondTeamScore;
	}

	public Game(LocalDate date, String firstTeam, String secondTeam, int firstTeamScore, int secondTeamScore) {
		this.date = date;
		this.firstTeam = firstTeam;
		this.secondTeam = secondTeam;
		this.firstTeamScore = firstTeamScore;
		this.secondTeamScore = secondTeamScore;
	}

	public Long getId() {
		return id;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getFirstTeam() {
		return firstTeam;
	}

	public String getSecondTeam() {
		return secondTeam;
	}

	public int getFirstTeamScore() {
		return firstTeamScore;
	}

	public int getSecondTeamScore() {
		return secondTeamScore;
	}
}
