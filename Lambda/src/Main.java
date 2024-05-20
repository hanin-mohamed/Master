public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        //myCat.print();
      //1.
//        printThing(
//                ()->{System.out.println("Meow");});
//        //2.
//        Printable lambdaPrintable =()->{System.out.println("Meow");};
//        printThing(lambdaPrintable);

        /******one parameter*******/
//        Printable lambdaPrintable =(s)->{ System.out.println("Meow"+ s);};
//        printThing(lambdaPrintable);
//    }
    /******one parameter & return Type*******/
    Printable lambdaPrintable =(s)->"Meow"+ s;   //->return
    printThing(lambdaPrintable);
}

static void printThing(Printable thing) {
        thing.printtt("!");
    }
}
