public class Lambda2par {

    //interface implements one function
    interface FuncInter1{
        int operate(int a, int b);
    }

    //interface implements one function
    interface FuncInter2{
        void sayMsg(String msg);
    }

    //implement fun1 to br performed on a,b
    private int operation(int a, int b,FuncInter1 inter){
        return inter.operate(a, b);
    }
    public static void main(String[] args) {
        //lambda expression for addition for two parameters
        FuncInter1 add= ( x, y)->x+y;
        //lambda expression for addition for two parameters
        FuncInter1 mul= (x, y)->x*y;
        //lambda expression for minus for two parameters
        FuncInter1 min= (x, y)->x-y;

        Lambda2par lambda = new Lambda2par();

        System.out.println("Addition is "+lambda.operation(4,2,add));
        System.out.println("Multiplication is "+lambda.operation(5,3,mul));
        System.out.println("Min is "+lambda.operation(99,9,min));


        FuncInter2 lambda2=msg-> System.out.println("Hello"+msg);
        lambda2.sayMsg("Haneen");
    }
}
