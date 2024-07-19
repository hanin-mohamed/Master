public class PersonDTO {
    private String fullName;
    private int age;

    public PersonDTO(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public PersonDTO(){}

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
