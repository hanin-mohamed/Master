package HotelSystem.controller;

import HotelSystem.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeController {
    Scanner sc = new Scanner(System.in);
    public void addEmp(ArrayList<Employee> employees){
        System.out.println("Enter employee name: ");
        String name = sc.nextLine();
        System.out.println("Enter employee Salary: ");
        double salary = sc.nextDouble();
        System.out.println("Enter employee ID: ");
        int id = sc.nextInt();
        System.out.println("Enter employee Rule: ");
        String rule = sc.nextLine();
        Employee emp =new Employee(id,salary,rule,name);
                employees.add(emp);
    }
    public void updateEmp(ArrayList<Employee>employees){
        System.out.println("Enter employee ID: ");
        int id=sc.nextInt();
        System.out.println("Enter new Salary :");
        double sal= sc.nextDouble();
        System.out.println("Enter new Rule :");
        String rule =sc.nextLine();
        Employee emp =employees.get(id);
        emp.setEmpSalary(sal);
        emp.setEmpJob(rule);
        employees.set(id,emp);
        System.out.println("Employee Updated Successfully");
    }
    public void viewEmployees(ArrayList<Employee> employees){
        for (Employee emp : employees)
            emp.display();
    }
}
