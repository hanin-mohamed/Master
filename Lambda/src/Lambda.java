@FunctionalInterface
interface  InterFun{
    void testMethod();
}
public class Lambda {
    private void Print(InterFun x){
        x.testMethod();
    }
    public static void main(String[] args) {
        InterFun isFun = new InterFun() {

            @Override
            public void testMethod() {
                System.out.println("Hello");
            }
        };

        InterFun interFun = () -> System.out.println("Hello ");
        Lambda lambda = new Lambda();
        lambda.Print(isFun );
        lambda.Print(interFun);
    }
}
