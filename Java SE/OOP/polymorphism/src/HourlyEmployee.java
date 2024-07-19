public class HourlyEmployee extends Employee{
    private float workHourPrice;
    private int hourlyRate;
    public HourlyEmployee(){}
    public HourlyEmployee(String name, String address, String depart, String email, float salary,float workHourPrice,int hourlyRate) {
        super(name, address, depart, email, salary);
        this.hourlyRate=hourlyRate;
        this.workHourPrice=workHourPrice;
    }
    @Override
    public  void print(){
        System.out.println("HourlyEmployee");
    }
    public float getWorkHourPrice() {
        return workHourPrice;
    }

    @Override
    public float getSalary() {
        return hourlyRate*workHourPrice;
    }

    public void setWorkHourPrice(float workHourPrice) {
        this.workHourPrice = workHourPrice;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
