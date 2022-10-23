package intromethods.employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee = new Employee("Kovacs Bela", 2020, 300000);
		System.out.println(employee.getName());
		System.out.println(employee.getHiringYear());
		System.out.println(employee.getSalary());
		employee.setName("Kovacs Istvan");
		System.out.println(employee.getName());
		employee.raiseSalary(50000);
		System.out.println(employee.getSalary());
		System.out.println(employee);
	}
}
