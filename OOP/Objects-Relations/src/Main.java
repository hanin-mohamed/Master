public class Main {
    public static void main(String[] args) {
        Department dep=new Department("CS",3);
        Employee emp= new Employee(1,7000,"Haneen","Mohamed","El-fiky","O+","420118","Egyptain","2002",dep);
        System.out.println(emp.toString());
    }
}