package day03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SchoolStudentService {

	private SchoolRepository schoolRepository;
	private StudentRepository studentRepository;


	public SchoolStudentService(SchoolRepository schoolRepository, StudentRepository studentRepository) {
		this.schoolRepository = schoolRepository;
		this.studentRepository = studentRepository;
	}

	public void insertSchoolWithoutStudents(School school){
		schoolRepository.insertSchoolWithoutStudents(school);
	}

	public void insertSchoolWithStudents(School school){
		long schoolId = schoolRepository.insertSchoolWithoutStudents(new School(school.getSchoolName(),school.getCity()));
		for(Student student : school.getStudents()){
			studentRepository.insertStudent(student,schoolId);
		}
	}

	public School findSchoolWithStudentsById(long id){
		School school = schoolRepository.findSchoolById(id);
		List<Student> students = new ArrayList<>();
		return new School(school.getSchoolName(),school.getCity(),students);
	}

	public List<School> findSchoolsByCity(String city){
		return schoolRepository.findSchoolsByCity(city);
	}

	public List<Student> findStudentsByYearInSchool(int year, int schoolId) {
		return studentRepository.findStudentsByYearInSchool(year,schoolId);
	}

	public School findSchoolWithMostStudentsJava(){
		List<School> allSchools = schoolRepository.findAllSchool();
		for(School school : allSchools){
			List<Student> students = studentRepository.findAllStudentsBySchool(school.getId());
			school.addAllStudents(students);
		}
		return allSchools.stream()
				.max(Comparator.comparing(s->s.getStudents().size())).orElseThrow(()->new IllegalStateException("No schools!"));
	}

	public School findSchoolWithMostStudentsSql(){
		return schoolRepository.findSchoolWithMostStudents();
	}
}
