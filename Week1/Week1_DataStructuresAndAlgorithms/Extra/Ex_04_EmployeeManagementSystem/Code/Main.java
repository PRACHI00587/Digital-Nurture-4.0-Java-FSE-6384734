package Week1_DataStructuresAndAlgorithms.Extra.Ex_04_EmployeeManagementSystem.Code;

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        ems.addEmployee(new Employee(1, "Alice", "Manager", 75000));
        ems.addEmployee(new Employee(2, "Bob", "Developer", 50000));
        ems.addEmployee(new Employee(3, "Charlie", "HR", 45000));

        System.out.println("📋 All Employees:");
        ems.listEmployees();

        System.out.println("\n🔍 Searching for Employee ID 2:");
        Employee e = ems.searchEmployee(2);
        System.out.println(e != null ? e : "Not found");

        System.out.println("\n❌ Deleting Employee ID 2:");
        ems.deleteEmployee(2);

        System.out.println("\n📋 Updated Employees:");
        ems.listEmployees();
    }
}

