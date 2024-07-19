public class DailyEmployee extends Employee{
    private float workDayPrice;
    private int dailyRate;
    public DailyEmployee(){}
    public DailyEmployee(String name, String address, String depart, String email, float salary,int dailyRate, float workDayPrice) {
        super(name, address, depart, email, salary);
        this.dailyRate=dailyRate;
        this.workDayPrice=workDayPrice;
    }
    @Override
    public  void print(){
        System.out.println("DailyEmployee");
    }
    public float getWorkDayPrice() {
        return workDayPrice;
    }
    @Override
    public float getSalary(){
        return workDayPrice*dailyRate;
    }

    public void setWorkDayPrice(float workDayPrice) {
        this.workDayPrice = workDayPrice;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }
}
