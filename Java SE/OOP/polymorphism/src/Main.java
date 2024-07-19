public class Main {
    static void p(Employee e){e.print();}
    public static void main(String[] args) {
        Employee emp=new Employee("Haneen","Egypt","CS","haneen@gmail",1000);
           System.out.println("Salary = "+emp.getSalary());
           emp.print();
           p(new Employee());
         emp=new SalariedEmployee("Haneen","Egypt","CS","haneen@gmail",1000,300 );
           System.out.println("Salary = "+emp.getSalary());
            emp.print();
            p(new SalariedEmployee());
         emp=new DailyEmployee("Haneen","Egypt","CS","haneen@gmail",1000,24,300);
           System.out.println("Salary = "+emp.getSalary());
           emp.print();
           p(new DailyEmployee());
         emp=new HourlyEmployee("Haneen","Egypt","CS","haneen@gmail",1000,100,100);
            System.out.println("Salary = "+emp.getSalary());
             emp.print();
             p(new HourlyEmployee());
            //emp->holymorphic
        Employee [] refArray =new Employee[4];
        refArray[0]=new Employee();
        refArray[1]=new SalariedEmployee();
        refArray[2]=new DailyEmployee();
        refArray[3]=new HourlyEmployee();
        for ( Employee e : refArray ){
            e.print();
            p(e);
        }
    }
}