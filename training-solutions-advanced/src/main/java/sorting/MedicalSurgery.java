package sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MedicalSurgery {

	private List<Patient> patients;

	public MedicalSurgery(List<Patient> patients) {
		this.patients = patients;
	}

	public List<Patient> getPatientsInTimeOrder() {
		List<Patient> sorted = new ArrayList<>(patients);
		sorted.sort(Comparator.comparing(Patient::getAppointment));
		return sorted;
	}
}
