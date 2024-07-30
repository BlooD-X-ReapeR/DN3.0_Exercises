public class Main {
    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement(10);

        Employee emp1 = new Employee("1", "John Doe", "Manager", 50000);
        Employee emp2 = new Employee("2", "Jane Smith", "Developer", 45000);

        // Adding employees
        management.addEmployee(emp1);
        management.addEmployee(emp2);

        System.out.println("Employees:");
        management.traverseEmployees();

        // Searching for an employee
        System.out.println("\nSearching for employee with ID '1':");
        Employee foundEmployee = management.searchEmployee("1");
        if (foundEmployee != null) {
            System.out.println(foundEmployee);
        } else {
            System.out.println("Employee not found.");
        }

        // Deleting an employee
        System.out.println("\nDeleting employee with ID '1':");
        management.deleteEmployee("1");

        System.out.println("\nEmployees after deletion:");
        management.traverseEmployees();

        System.out.println("\nTrying to delete employee with ID '1' again:");
        management.deleteEmployee("1");
    }
}
