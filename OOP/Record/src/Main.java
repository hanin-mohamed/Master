public class Main {
    public static void main(String[] args) {

        EmpClass emp= new EmpClass("Haneen",0152);
        System.out.println(emp.getName()+" "+emp.getNumber());
        System.out.println(emp);
        EmpRecord  em= new EmpRecord("hanona",4444); //can't be changed
        System.out.println(em.name()+" "+em.number());
        System.out.println(em.uppercaseName());
        EmpRecord.printWhateve();
        System.out.println(em );
    }
}