package Week1_DataStructuresAndAlgorithms.Extra.Ex_04_EmployeeManagementSystem.Code;

public class EmployeeManagementSystem {
    Employee[] employees;
    int size;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    // Add employee
    public void addEmployee(Employee emp) {
        if (size < employees.length) {
            employees[size++] = emp;
        } else {
            System.out.println("❌ Employee list is full.");
        }
    }

    // Search by ID
    public Employee searchEmployee(int empId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == empId) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse
    public void listEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete by ID
    public void deleteEmployee(int empId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == empId) {
                // Shift left
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null;
                System.out.println("✅ Employee deleted.");
                return;
            }
        }
        System.out.println("❌ Employee not found.");
    }
}

