package OOP.Inheritance;

import java.util.Scanner;

class Employee {
    String empName;
    int empId;
    String address;
    String mailId;
    long mobileNo;
    double DA;
    double HRA;
    double PF;
    double SCF;
    double grossSalary;
    double netSalary;

    void getData() {
        Scanner sc = new Scanner(System.in);
        int min = 1000000;
        int max = 9999999;
        System.out.print("Enter name: ");
        this.empName = sc.nextLine();
        this.empId = (int) (Math.random() * (max - min + 1) + min);
        System.out.print("Enter address: ");
        this.address = sc.nextLine();
        System.out.print("Enter Mail-Id: ");
        this.mailId = sc.next();
        System.out.print("Enter mobile no: ");
        this.mobileNo = sc.nextLong();
    }

    void displayData() {
        System.out.println("----------------------------------------");
        System.out.println("               Employee Data            ");
        System.out.println("Name: " + empName);
        System.out.println("ID: " + empId);
        System.out.println("Address: " + address);
        System.out.println("Mail ID: " + mailId);
        System.out.println("Mobile no: " + mobileNo);
    }

    void calculateSalary(double basicPay) {
        DA = 0.97 * basicPay;
        HRA = 0.1 * basicPay;
        PF = 0.12 * basicPay;
        SCF = 0.01 * basicPay;
        grossSalary = basicPay + DA + HRA;
        netSalary = grossSalary - (PF + SCF);
    }

    void salarySlip() {
        System.out.println("----------------------------------------");
        System.out.println("              Salary Slip               ");
        System.out.println("Dearness Allowance: " + DA);
        System.out.println("Human Resource Allowance: " + HRA);
        System.out.println("Provident Fund: " + PF);
        System.out.println("Staff Club Fund: " + SCF);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }
}

class Programmer extends Employee {
    public Programmer() {
        Scanner sc = new Scanner(System.in);
        getData();
        displayData();
        System.out.println("Status: Programmer");
        System.out.println("Enter basic pay amount: ");
        int basicPay = sc.nextInt();
        calculateSalary(basicPay);
        salarySlip();
    }
}

class TeamLeader extends Employee {
    public TeamLeader() {
        Scanner sc = new Scanner(System.in);
        getData();
        displayData();
        System.out.println("Status: Team Leader");
        System.out.println("Enter basic pay amount: ");
        int basicPay = sc.nextInt();
        calculateSalary(basicPay);
        salarySlip();
    }
}

class AssistantProjectManager extends Employee {
    public AssistantProjectManager() {
        Scanner sc = new Scanner(System.in);
        getData();
        displayData();
        System.out.println("Status: Assistant Project Manager");
        System.out.println("Enter basic pay amount: ");
        int basicPay = sc.nextInt();
        calculateSalary(basicPay);
        salarySlip();
    }
}

class ProjectManager extends Employee {
    public ProjectManager() {
        Scanner sc = new Scanner(System.in);
        getData();
        displayData();
        System.out.println("Status: Project Manager");
        System.out.println("Enter basic pay amount: ");
        int basicPay = sc.nextInt();
        calculateSalary(basicPay);
        salarySlip();
    }
}

public class EmployeeImpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Programmer");
        System.out.println("2. Team Leader");
        System.out.println("3. Assistant Project Manager");
        System.out.println("4. Project Manager");
        System.out.print("Enter your status: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Programmer programmer = new Programmer();
                break;
            case 2:
                TeamLeader teamLeader = new TeamLeader();
                break;
            case 3:
                AssistantProjectManager assistantProjectManager = new AssistantProjectManager();
                break;
            case 4:
                ProjectManager projectManager = new ProjectManager();
                break;
            default:
                System.out.println("Invalid choice!!!");
                break;
        }
    }
}