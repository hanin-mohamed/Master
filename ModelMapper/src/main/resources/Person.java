public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, int age, String lastName) {
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
    }

   public Person() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
