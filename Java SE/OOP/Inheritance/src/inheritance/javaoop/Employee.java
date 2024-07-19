package inheritance.javaoop;

public class Employee {
    protected String name,email,phone,depart,address;
    int birthYear;
    public Employee(){
        System.out.println("No Parameter Constructor");
    }

    public Employee(String name, String email, String phone, String depart, String address, int birthYear) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.depart = depart;
        this.address = address;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
