public class Employee {
    private String name,address,depart,email;
    private float salary;
    public Employee(){}
    public Employee(String name, String address, String depart, String email, float salary) {
        this.name = name;
        this.address = address;
        this.depart = depart;
        this.email = email;
        this.salary = salary;
    }
    public  void print(){
        System.out.println("Employee");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
