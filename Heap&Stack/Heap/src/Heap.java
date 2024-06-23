public class Heap {
    public static void main(String[] args) {
        MyClass obj = new MyClass(); // تخصيص Heap علي الـ
        obj.sayHello();
    }
}
class MyClass {
    void sayHello() {
        System.out.println("Hello, World!");
    }
}