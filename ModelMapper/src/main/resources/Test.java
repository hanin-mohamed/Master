import org.modelmapper.ModelMapper;

public class Test {
    public static void main(String[] args) {
        ModelMapper modelMapper = new ModelMapper();

        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(30);

        PersonDTO personDTO = modelMapper.map(person, PersonDTO.class);

        System.out.println("PersonDTO fullName: " + personDTO.getFullName()); //John Doe
        System.out.println("PersonDTO age: " + personDTO.getAge());    //30
    }
}
