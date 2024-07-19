package inheritance.javaoop;

import inheritance.javaoop.Employee;

public class Developer extends Employee {
    String project;
    public Developer(){
        System.out.println("sub-class");
    }
    public Developer(String name, String email, String phone, String depart, String address, int birthYear,String project) {
        super( name,  email,  phone,  depart,  address, birthYear);
        this.project=project;
    }
    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
}
