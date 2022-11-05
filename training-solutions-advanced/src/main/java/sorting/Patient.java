package sorting;

import java.time.LocalDateTime;

public class Patient {

	private String name;
	private String ssn;
	private LocalDateTime appointment;

	public Patient(String name, String ssn, LocalDateTime appointment) {
		this.name = name;
		this.ssn = ssn;
		this.appointment = appointment;
	}

	public String getName() {
		return name;
	}

	public String getSsn() {
		return ssn;
	}

	public LocalDateTime getAppointment() {
		return appointment;
	}
}
