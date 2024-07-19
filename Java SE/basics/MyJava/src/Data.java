public class Data {
    private int month,day,year;
    public Data(){

    }
    public Data(int month,int day,int year){
        this.month=month;
        this.day=day;
        this.year=year;
    }
    public void setMonth(){
        this.month=month;
    }
     public void setDay(){
        this.day=day;
     }
     public void setYear(){
        this.year=year;
     }
     public int getMonth(){
        return month;
     }
     public int getDay(){
        return day;
     }
     public int getYear(){
        return year;
     }
     public void display(){
        System.out.println(month+"/"+day+"/"+year);
     }

}
