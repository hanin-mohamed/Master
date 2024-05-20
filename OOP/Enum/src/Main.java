import java.util.EnumSet;
import java.util.EnumMap;
public class Main {
    enum WeekDays{
        Monday("working"){
            public void testMethod() {
                System.out.println("Monday");
                }}
        ,Tuesday{
            public void testMethod() {
                System.out.println("Tuesday");
            }}
        ,Wednsday{
            public void testMethod() {
                System.out.println("Wednsday");
            }}
        ,Thursday{
            public void testMethod() {
                System.out.println("Thursday");
            }},Friday{
            public void testMethod() {
                System.out.println("Friday");
            }},Saturday{
            public void testMethod() {
                System.out.println("Saturday");
            }},Sunday{
            public void testMethod() {
                System.out.println("Sunday");
            }};
       String status;

       WeekDays(String status) {
            this.status=status;
        }
        WeekDays() {}
        public abstract void testMethod();
    }
    /*EnumSet*/
    public static void main(String[] args) {
        EnumSet<WeekDays>days= EnumSet.allOf(WeekDays.class);
        System.out.println(days);
        EnumSet<WeekDays>day= EnumSet.of(WeekDays.Thursday,WeekDays.Friday);
        System.out.println(day);
        EnumSet<WeekDays>range= EnumSet.range(WeekDays.Tuesday,WeekDays.Friday);
        System.out.println(range);
        EnumSet<WeekDays>dayoff= EnumSet.noneOf(WeekDays.class);//empty!
        dayoff.add(WeekDays.Monday);
        System.out.println(dayoff);
        dayoff.addAll(range);
        System.out.println(dayoff);
        dayoff.remove(WeekDays.Wednsday);
        System.out.println(dayoff);
        dayoff.removeAll(days);
        System.out.println(dayoff);
        /********EnumMap******/
        EnumMap<WeekDays,String>daysMap=new EnumMap<>(WeekDays.class);
        daysMap.put(WeekDays.Thursday/*key*/,"Working day"/*value*/);
        daysMap.put(WeekDays.Friday,"Free day");
        System.out.println(daysMap);
        WeekDays.Monday.testMethod();
        Numbers val=Numbers.One;
        switch (val){
            case One:
                System.out.println("1");
                break;
            case Two:
                System.out.println("2");
                break;
            case Three:
                System.out.println("3");
                break;
        }

    }
}