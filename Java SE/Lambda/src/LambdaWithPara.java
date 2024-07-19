@FunctionalInterface
interface IsFunctional{
    void testMethod (String data);
}
public class LambdaWithPara {
    //(arguments)->{statements};
    public static void main(String[] args) {
        IsFunctional fun=new IsFunctional() {

            @Override
            public void testMethod(String name) {
                System.out.println("Hello"+name);
            }
        };
        IsFunctional fun2=(name)-> System.out.println("Hello Iam Lambda,"+name);
        LambdaWithPara lambdaWithPara=new LambdaWithPara();

    }
}