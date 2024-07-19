public class SalariedEmployee extends Employee{
    float bouns;
    public SalariedEmployee(){}
    public SalariedEmployee(String name, String address, String depart, String email, float salary,float bouns) {
        super(name, address, depart, email, salary);
        this.bouns=bouns;
    }
    @Override
    public  void print(){
        System.out.println("SalaryEmployee");
    }
    public float getBouns() {
        return bouns;
    }
    @Override
    public float getSalary(){
        return super.getSalary()+bouns;
    }

    public void setBouns(float bouns) {
        this.bouns = bouns;
    }
}
