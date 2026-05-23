import java.util.ArrayList;
import java.util.Scanner;


abstract class Employee {
    protected String name;
    protected String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract void displayInfo();
}


interface Payable {
    double calculateSalary();
}


class Manager extends Employee implements Payable {
    private String department;
    private double basicSalary;
    private double bonus;

    public Manager(String name, String id, String department, double basicSalary, double bonus) {
        super(name, id);
        this.department = department;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return basicSalary + bonus;
    }

    public void displayInfo() {
        System.out.println("\n===== MANAGER DETAILS =====");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Salary: R" + calculateSalary());
        System.out.println("Grade: " + getGrade());
    }

    public String getGrade() {
        double salary = calculateSalary();

        if (salary >= 40000) {
            return "A";
        } else if (salary >= 30000) {
            return "B";
        } else {
            return "C";
        }
    }
}


class Developer extends Employee implements Payable {
    private String programmingLanguage;
    private double basicSalary;
    private double projectAllowance;

    public Developer(String name, String id, String programmingLanguage, double basicSalary, double projectAllowance) {
        super(name, id);
        this.programmingLanguage = programmingLanguage;
        this.basicSalary = basicSalary;
        this.projectAllowance = projectAllowance;
    }

    public double calculateSalary() {
        return basicSalary + projectAllowance;
    }

    public void displayInfo() {
        System.out.println("\n===== DEVELOPER DETAILS =====");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Salary: R" + calculateSalary());
        System.out.println("Grade: " + getGrade());
    }

    public String getGrade() {
        double salary = calculateSalary();

        if (salary >= 40000) {
            return "A";
        } else if (salary >= 30000) {
            return "B";
        } else {
            return "C";
        }
    }
}


class CyberSecurityAnalyst extends Employee implements Payable {
    private String securityClearance;
    private double basicSalary;
    private double riskAllowance;

    public CyberSecurityAnalyst(String name, String id, String securityClearance, double basicSalary, double riskAllowance) {
        super(name, id);
        this.securityClearance = securityClearance;
        this.basicSalary = basicSalary;
        this.riskAllowance = riskAllowance;
    }

    public double calculateSalary() {
        return basicSalary + riskAllowance;
    }

    public void displayInfo() {
        System.out.println("\n===== CYBER SECURITY ANALYST DETAILS =====");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Security Clearance: " + securityClearance);
        System.out.println("Salary: R" + calculateSalary());
        System.out.println("Grade: " + getGrade());
    }

    public String getGrade() {
        double salary = calculateSalary();

        if (salary >= 40000) {
            return "A";
        } else if (salary >= 30000) {
            return "B";
        } else {
            return "C";
        }
    }
}


public class Main {

    static ArrayList<Employee> employees = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        System.out.println("====================================");
        System.out.println("  SECURESTAFF EMPLOYEE SYSTEM");
        System.out.println("  Powered by Leigh Tech Consulting");
        System.out.println("====================================");

        do {
            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. Add Manager");
            System.out.println("2. Add Developer");
            System.out.println("3. Add Cyber Security Analyst");
            System.out.println("4. View All Employees");
            System.out.println("5. Calculate Total Payroll");
            System.out.println("6. Search Employee by ID");
            System.out.println("7. Show Employee of the Month");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addManager();
                    break;

                case 2:
                    addDeveloper();
                    break;

                case 3:
                    addCyberSecurityAnalyst();
                    break;

                case 4:
                    viewAllEmployees();
                    break;

                case 5:
                    calculateTotalPayroll();
                    break;

                case 6:
                    searchEmployee();
                    break;

                case 7:
                    showEmployeeOfTheMonth();
                    break;

                case 8:
                    System.out.println("Thank you for using SecureStaff. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (choice != 8);
    }

    public static void addManager() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter department: ");
        String department = scanner.nextLine();

        System.out.print("Enter basic salary: R");
        double basicSalary = scanner.nextDouble();

        System.out.print("Enter bonus: R");
        double bonus = scanner.nextDouble();

        employees.add(new Manager(name, id, department, basicSalary, bonus));

        System.out.println("Manager added successfully.");
    }

    public static void addDeveloper() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter programming language: ");
        String language = scanner.nextLine();

        System.out.print("Enter basic salary: R");
        double basicSalary = scanner.nextDouble();

        System.out.print("Enter project allowance: R");
        double projectAllowance = scanner.nextDouble();

        employees.add(new Developer(name, id, language, basicSalary, projectAllowance));

        System.out.println("Developer added successfully.");
    }

    public static void addCyberSecurityAnalyst() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter security clearance level: ");
        String clearance = scanner.nextLine();

        System.out.print("Enter basic salary: R");
        double basicSalary = scanner.nextDouble();

        System.out.print("Enter risk allowance: R");
        double riskAllowance = scanner.nextDouble();

        employees.add(new CyberSecurityAnalyst(name, id, clearance, basicSalary, riskAllowance));

        System.out.println("Cyber Security Analyst added successfully.");
    }

    public static void viewAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees available.");
        } else {
            System.out.println("\n===== ALL EMPLOYEES =====");

            for (Employee employee : employees) {
                employee.displayInfo();
            }
        }
    }

    public static void calculateTotalPayroll() {
        double total = 0;

        for (Employee employee : employees) {
            Payable payableEmployee = (Payable) employee;
            total += payableEmployee.calculateSalary();
        }

        System.out.println("\nTotal Monthly Payroll: R" + total);
    }

    public static void searchEmployee() {
        System.out.print("Enter employee ID to search: ");
        String searchId = scanner.nextLine();

        boolean found = false;

        for (Employee employee : employees) {
            if (employee.id.equalsIgnoreCase(searchId)) {
                employee.displayInfo();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }
    }

    public static void showEmployeeOfTheMonth() {
        if (employees.isEmpty()) {
            System.out.println("No employees available.");
            return;
        }

        Employee topEmployee = employees.get(0);

        for (Employee employee : employees) {
            Payable current = (Payable) employee;
            Payable top = (Payable) topEmployee;

            if (current.calculateSalary() > top.calculateSalary()) {
                topEmployee = employee;
            }
        }

        System.out.println("\n EMPLOYEE OF THE MONTH ");
        topEmployee.displayInfo();
    }
}