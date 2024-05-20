public class Cat implements Printable {
    public String name;
    public int age;

    public Cat() {
    }

    /******no parameter & no return Type*******/

//    @Override
//    public void print() {
//        System.out.println("Meow");
//    }

    /******one parameter *******/

    //    @Override
//    public void printt(String suf) {
//
//    }
    /******one parameter & return Type*******/

    @Override
    public String printtt(String suf) {
        return "Hello";
    }


}