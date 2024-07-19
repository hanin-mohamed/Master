public class Main {
    public static void main(String[] args) {

        EmpClass emp= new EmpClass("Haneen",0152);
        System.out.println(emp.getName()+" "+emp.getNumber());
        System.out.println(emp);
        EmpRecord  empRecord= new EmpRecord("hanona",4444); //can't be changed
        System.out.println(empRecord.name()+" "+empRecord.number());
        System.out.println(empRecord.uppercaseName());
        EmpRecord.printWhateve();
        System.out.println(empRecord );
    }
}