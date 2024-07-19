public class Student {
    final int id;
    String name;
    int birthYear;
    final static float degreeOfSuccess;
    static {
        degreeOfSuccess=50;
    }
   // {id=100;} //initialize
    //Student(){name="Haneen";} //initialize
    // final -> initial in block or constructor
    public Student(int id, String name, int birthYear) {
        this.id = id;
       this.name = name;
        this.birthYear = birthYear;
    }



    
}
