package introdate;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee(1990, 10, 11, "John Doe");
        System.out.println(employee.getBeginEmployment());
        System.out.println(employee.getDateOfBirth());
        System.out.println(employee.getName());
        employee.setName("Jack Doe");
        System.out.println(employee.getName());
    }
}
