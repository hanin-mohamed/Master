public class Employee {
    private int id;
    private float salary;
    private PersonalInformation personalInfo;
    private  Department dept;

    public Employee(int id, float salary, String firstName, String midName, String lastName, String bloodGroup, String acountNumber, String nation, String birthYear,Department dept) {
        this.id = id;
        this.salary = salary;
        this.personalInfo = new PersonalInformation(firstName,midName,lastName,bloodGroup,acountNumber,nation,birthYear);
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", personalInfo=" + personalInfo +
                ", dept=" +dept+
                '}';
    }

}
