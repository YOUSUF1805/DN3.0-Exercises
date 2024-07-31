import java.util.*;
public class EmployeeManagementSystem {
    private Employee[] employees;
    private int size; // Current number of employees in the system
    private int capacity; // Maximum capacity of the employee array

    public EmployeeManagementSystem(int capacity) {
        this.capacity = capacity;
        this.employees = new Employee[capacity];
        this.size = 0;
    }

    public void addEmployee(Employee employee) {
        if (size >= capacity) {
            System.out.println("Employee array is full. Cannot add more employees.");
            return;
        }
        employees[size++] = employee;
    }

    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null; // Employee not found
    }

    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(int employeeId) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                employees[i] = employees[i + 1];
            }
            employees[size - 1] = null; // Optional: nullify the last element
            size--;
        } else {
            System.out.println("Employee not found.");
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Traverse Employees");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add Employee
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Position: ");
                    String position = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    Employee employee = new Employee(id, name, position, salary);
                    ems.addEmployee(employee);
                    break;

                case 2:
                    // Search Employee
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = scanner.nextInt();
                    Employee foundEmployee = ems.searchEmployee(searchId);
                    if (foundEmployee != null) {
                        System.out.println("Employee found: " + foundEmployee);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 3:
                    // Traverse Employees
                    System.out.println("Employee List:");
                    ems.traverseEmployees();
                    break;

                case 4:
                    // Delete Employee
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = scanner.nextInt();
                    ems.deleteEmployee(deleteId);
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }
    }
}