public class PersonalInformation {
    private String firstName,midName,lastName,bloodGroup,acountNumber,nation,birthYear;

    public PersonalInformation() {
    }

    public PersonalInformation(String firstName, String midName, String lastName, String bloodGroup, String acountNumber, String nation, String birthYear) {
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
        this.bloodGroup = bloodGroup;
        this.acountNumber = acountNumber;
        this.nation = nation;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "PersonalInformation{" +
                "firstName='" + firstName + '\'' +
                ", midName='" + midName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", acountNumber='" + acountNumber + '\'' +
                ", nation='" + nation + '\'' +
                ", birthYear='" + birthYear + '\'' +
                '}';
    }
}
