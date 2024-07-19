package HotelSystem;

public class Employee {
    private int empId;
    private String empName;
    private String empJob;
    private double empSalary;

    public Employee() {
    }

    public Employee(int empId, double empSalary, String empJob, String empName) {
        this.empId = empId;
        this.empSalary = empSalary;
        this.empJob = empJob;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpJob() {
        return empJob;
    }

    public void setEmpJob(String empJob) {
        this.empJob = empJob;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
    //Display EmpInfo
    public void display() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Job: " + empJob);
        System.out.println("Employee Salary: " + empSalary);
    }
}
